package com.tistory.namocom.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.ImportResource;

/**
 * http://blog.saltfactory.net/creating-springboot-project-in-intellij/
 */
@ImportResource(value="classpath:jmxtrans/spring-beans.xml")
@EnableMBeanExport
@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
}
