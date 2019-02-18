package com.zxs.ssh.template.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    private static final Logger logger = Logger.getLogger(WelcomeController.class);
    @RequestMapping("/getWelcomePage")
    public String getWelcomePage(){
        return "WelcomePage";
    }
}
