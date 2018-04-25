package com.greenfoxacademy.todoapi.services;

import com.greenfoxacademy.todoapi.models.ApplicationUser;
import com.greenfoxacademy.todoapi.repositories.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService {

  @Autowired
  ApplicationUserRepository applicationUserRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    ApplicationUser applicationUser = loadApplicationUserByUsername(username);
    return new User(applicationUser.getUsername(), applicationUser.getPassword(),
            AuthorityUtils.createAuthorityList("ROLE_USER"));
  }

  public ApplicationUser loadApplicationUserByUsername(String username) {
    if (username != null) {
      ApplicationUser applicationUser = applicationUserRepository.findByUsername(username);
      return new ApplicationUser(applicationUser.getUsername(), applicationUser.getPassword());
    } else {
      return null;
    }
  }
}
