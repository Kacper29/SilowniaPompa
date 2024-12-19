package com.AbAmAk.Pompa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping
public class AppController {

    @GetMapping("{id}")
    String main_page(@PathVariable("id") final int id) {
        return "strona_glowna";
    }

}