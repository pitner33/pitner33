package com.greenfoxacademy.tablesandforms.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Newsletter {

    @RequestMapping("/newsletter")
    public String newsletter() {
        return "newsletter";
    }
}
