package com.magic.magic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping ("/")
    public String rootView(){
        System.out.println("Weeee");
        return "dashboard";
    }
}
