package com.jeffersonjuarez.primeraPaginaThy.controller;

import com.jeffersonjuarez.primeraPaginaThy.dto.RegisterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @Autowired
    private InMemoryUserDetailsManager inMemoryUserDetailsManager;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/register")
    public String register(){return "register";}

    @PostMapping("/register")
    public String signup (@ModelAttribute RegisterDto register){

        //verifica si ese usuario ya existe
        if (inMemoryUserDetailsManager.userExists(register.getUsername())){
            return "redirect:/register?usernameExist";
        }
        //crea el usuario
        UserDetails user= User.builder()
                .username(register.getUsername())
                .password(passwordEncoder.encode(register.getPassword()))
                .roles("admin")
                .build();

        inMemoryUserDetailsManager.createUser(user);
        return "redirect:/login";

    }

}
