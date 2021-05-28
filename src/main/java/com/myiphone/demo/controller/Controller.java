package com.myiphone.demo.controller;
import com.myiphone.demo.mapper.MyMapping;

import com.myiphone.demo.model.Iphone11;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public Iphone11 getIphone () {
        return MyMapping.iphoneMapping();
    }

}
