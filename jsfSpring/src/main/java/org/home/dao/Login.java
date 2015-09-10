package org.home.dao;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Repository;

@Repository("Login")
public class Login extends HibernateDaoSupport implements
		AuthenticationProvider {

	public Authentication authenticate(Authentication authentication)
			throws AuthenticationException {
		authentication.setAuthenticated(true);
		
		return authentication;
	}

	public boolean supports(Class<?> authentication) {

		return true;
	}

}
