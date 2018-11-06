package com.tistory.namocom.springbootdemo.service;

import com.tistory.namocom.springbootdemo.monitoring.PageViewCounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DashboardService {

    private final PageViewCounter pageViewCounter;

    @Autowired
    public DashboardService(PageViewCounter pageViewCounter) {
        this.pageViewCounter = pageViewCounter;
    }

    public void incresePV() {
        pageViewCounter.increasePVCount();
    }

    public long getPV() {
        return pageViewCounter.getPvCount();
    }
}
