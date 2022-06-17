package com.intiformation.WatchNow.service;

import java.util.ArrayList;
import java.util.List;

import com.intiformation.WatchNow.model.UtilisateurLogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UtilisateurLoginService utilisateurLoginService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("root".equals(username)) {
			return new User("root", "$2a$10$ixlPY3AAd4ty1l6E2IsQ9OFZi2ba9ZQE0bP7RFcGIWNhyFrrT3YUi", getListeGrantedAuthority("USER"));
		}
		else {
			UtilisateurLogin ul = utilisateurLoginService.getByLoginOrEmail(username);
			if(ul == null)
			{
				throw new UsernameNotFoundException("Le username " + username + " n'existe pas en BDD.");
			}
			return new User(ul.get_login(), ul.get_password(), getListeGrantedAuthority(ul));
		}
//		if ("root".equals(username)) {
//			return new User("root", "$2a$10$ixlPY3AAd4ty1l6E2IsQ9OFZi2ba9ZQE0bP7RFcGIWNhyFrrT3YUi",
//					new ArrayList<>());
//		} else {
//			throw new UsernameNotFoundException("User not found with username: " + username);
//		}
	}
	
	private List<GrantedAuthority> getListeGrantedAuthority(UtilisateurLogin ul)
	{
		List<GrantedAuthority> listeGrantedAuthorities = new ArrayList<GrantedAuthority>();
		
		listeGrantedAuthorities.add(new SimpleGrantedAuthority(ul.get_role()));
		
		return listeGrantedAuthorities;
	}
	
	private List<GrantedAuthority> getListeGrantedAuthority(String role)
	{
		List<GrantedAuthority> listeGrantedAuthorities = new ArrayList<GrantedAuthority>();
		
		listeGrantedAuthorities.add(new SimpleGrantedAuthority(role));
		
		return listeGrantedAuthorities;
	}

}