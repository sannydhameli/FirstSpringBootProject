package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class sanny {

    @GetMapping("/")
    public String Solve(){
        return "Tekion";
    }

    @GetMapping("/sanny")
    public String Solve2(){
        return "We are on 2nd page";
    }
}
