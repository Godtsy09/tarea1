package com.jeffersonjuarez.primeraPaginaThy.controller;

import com.jeffersonjuarez.primeraPaginaThy.dto.RegisterDto;
import org.springframework.beans.factory.annotation.Autowired;
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
    public String signup (@ModelAttribute RegisterDto registerDto){
        if (inMemoryUserDetailsManager.userExists(registerDto.getUsername())){

        }

    }

}
