package com.example.judoku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.annotation.SessionScope;


@Controller
@SessionAttributes("name")
public class MainController {

    @GetMapping("/")
    public String root() {
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {
    	String name = "test";
    	model.addAttribute(name);
        return "login";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }
}