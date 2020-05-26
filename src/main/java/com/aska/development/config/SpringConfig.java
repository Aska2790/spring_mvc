package com.aska.development.config;


import com.aska.development.Test;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public Test getTest(){
        return new Test("aska");
    }
}
