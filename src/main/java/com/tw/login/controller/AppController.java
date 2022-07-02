package com.tw.login.controller;

import com.tw.login.entity.User;
import com.tw.login.repositary.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @Autowired
    private UserRepository userRepo;

    @GetMapping("/")
    public String viewHomePage() {
        return "index";
    }
    @GetMapping("/register")
    public String showSignUpForm(Model model)
    {
        model.addAttribute("user",new User());
        return "signup_form";
    }
}