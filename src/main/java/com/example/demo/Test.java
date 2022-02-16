package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Test {

    @Bean
    public static void test1() {
        System.setProperty("javax.net.ssl.trustStore", "C:\\Program Files\\Java\\jdk-11.0.2\\lib\\security\\cacerts");
        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
    }
}
