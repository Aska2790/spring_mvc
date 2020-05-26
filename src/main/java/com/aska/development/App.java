package com.aska.development;

import com.aska.development.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        final Test bean = context.getBean(Test.class);
        System.out.println(bean.getName());
    }
}
