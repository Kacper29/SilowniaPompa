package com.AbAmAk.Pompa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping
public class AppController {

    @GetMapping({"/strona_glowna"})
    String main_page() {
        return "strona_glowna";
    }

    @GetMapping("/")
    public String homePage() {
        return "home"; // Return the home.html page
    }


}