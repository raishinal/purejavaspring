/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ros.purejavaspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Raishin
 */
@Controller
public class HomeController {
    @RequestMapping("/home")
    public String homePage(){
        return "home";
    }
    @RequestMapping("/welcome")
    public String welcomeUser(){
        return "welcome";
    }
}
