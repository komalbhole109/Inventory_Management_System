package com.tka.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

    // Home Page Mapping
    @GetMapping("/")
    public String home()
    {
        return "index";   
    }
}