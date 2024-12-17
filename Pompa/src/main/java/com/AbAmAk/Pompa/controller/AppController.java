package com.AbAmAk.Pompa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController
@RequestMapping
public class AppController {

    @GetMapping("{id}")
     String main_page(@PathVariable("id") final int id) {
        return "gowno_gowno_sraka";
    }

}