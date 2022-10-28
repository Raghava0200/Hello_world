package com.sap.first_application.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("wishMe")
    Object helloController()
    {
        return "Hello Raghava Jaggayyagari";
    }

}
