package com.tr.income.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
public class HomeController {

    @GetMapping(path = "/")
    public String welcome() {
        return "GELIR API SERVIS 2.0";
    }
}
