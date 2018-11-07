package com.tistory.namocom.springbootdemo.controller;

import com.tistory.namocom.springbootdemo.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final DashboardService dashboardService;

    @Value("${spring.jmx.enabled}")
    private boolean jmxEnabled;

    @Value("${metric.application}")
    private String metricApplication;

    @Autowired
    public HelloController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @RequestMapping("/hello")
    public String helloWorld() {
        dashboardService.incresePV();

        return String.format("hello world!, page view: %d jmx.enabled: %s, metric.application: %s",
                dashboardService.getPV(), jmxEnabled, metricApplication);
    }
}
