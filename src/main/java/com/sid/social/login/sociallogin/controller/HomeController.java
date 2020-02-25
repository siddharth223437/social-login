package com.sid.social.login.sociallogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHome(){
        return "redirect:/welcome";
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
}
