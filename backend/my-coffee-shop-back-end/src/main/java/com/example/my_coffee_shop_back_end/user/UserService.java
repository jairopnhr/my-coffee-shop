package com.example.my_coffee_shop_back_end.user;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService{

   private final UserRepository userRepository;
   
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user =  userRepository.findByUsername(username);
       if (user !=null) {
            return new  CustomUserDetails(user);
       }else
       {
        throw new UsernameNotFoundException("could not found user..!!");
       }
    }

    
}
