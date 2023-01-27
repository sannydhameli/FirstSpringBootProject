package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Sunny {

    @GetMapping("/")
    public String solve(){
        return "Tekion";
    }

    @GetMapping("/sunny")
    public String Solve2(){
        return "We are on 2nd page";
    }
}
