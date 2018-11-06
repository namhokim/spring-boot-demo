package com.tistory.namocom.springbootdemo.controller;

import com.tistory.namocom.springbootdemo.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final DashboardService dashboardService;

    @Autowired
    public HelloController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @RequestMapping("/hello")
    public String helloWorld() {
        dashboardService.incresePV();

        return "hello world! " + dashboardService.getPV();
    }
}
