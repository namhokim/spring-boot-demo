package com.tistory.namocom.springbootdemo.monitoring;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

/**
 * https://joycoding.wordpress.com/2016/02/16/jmxtrans를-사용하기-위한-mbean-설정/
 */
@ManagedResource(value = "web.analysis:type=PageViewCounter,name=pageViewCounter", description = "PV")
@Component
public class PageViewCounter {
    private AtomicLong pvCount = new AtomicLong(0);

    @ManagedAttribute
    public long getPvCount() {
        return pvCount.get();
    }

    public void increasePVCount() {
        if (pvCount == null) {
            pvCount = new AtomicLong(0);
        }

        pvCount.incrementAndGet();
    }
}
