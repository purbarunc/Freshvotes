package com.codex.freshvotes.security;

import java.util.Set;

import org.springframework.security.core.userdetails.UserDetails;

import com.codex.freshvotes.model.User;

public class CustomSecuredUser extends User implements UserDetails {
	private static final long serialVersionUID = 8887160972677058176L;

	public CustomSecuredUser() {
	}

	public CustomSecuredUser(User user) {
		this.setAuthorities(user.getAuthorities());
		this.setId(user.getId());
		this.setName(user.getName());
		this.setPassword(user.getPassword());
		this.setUsername(user.getUsername());
	}

	@Override
	public Set<Authority> getAuthorities() {
		return super.getAuthorities();
	}

	@Override
	public String getPassword() {
		return super.getPassword();
	}

	@Override
	public String getUsername() {
		return super.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
