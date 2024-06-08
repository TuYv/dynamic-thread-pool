package com.rick.dynamic.thread.pool;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Configurable
public class DynamicTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicTestApplication.class);
    }
}
