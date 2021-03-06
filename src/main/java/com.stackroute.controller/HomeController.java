package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController{

    @RequestMapping(value = "/")
    public String greetings(ModelMap map){

        map.addAttribute("greeting","Welcome!");
        return "index";
    }
}