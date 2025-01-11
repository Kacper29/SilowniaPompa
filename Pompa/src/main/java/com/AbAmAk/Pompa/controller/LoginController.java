package com.AbAmAk.Pompa.controller;

import com.AbAmAk.Pompa.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        if (loginService.login(username, password)) {
            return "redirect:/strona_glowna";
        }
        model.addAttribute("error", "Invalid username or password");
        return "login";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // Your login.html page
    }

    @GetMapping("/register")
    public String registerPage() {
        return "register"; // Your register.html page
    }
}