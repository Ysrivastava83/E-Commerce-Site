package com.shop.ChandraAndCompany.Controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HealthCheck
{
    @RequestMapping("/test")
    public String healthcheck()
    {
        System.out.println("in healthcheck");
        return "Application is Running";
    }

}
