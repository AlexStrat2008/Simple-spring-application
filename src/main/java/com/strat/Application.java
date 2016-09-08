package com.strat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.strat.services.api.TestService;
import com.strat.services.impl.TestServiceImpl;

@Configuration
@ComponentScan
public class Application {

    @Bean
    public TestService testService(){
        return new TestServiceImpl();
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        context.getBean(TestService.class).setMessage("hello1");
        System.out.println(context.getBean(TestService.class).getMessage());
    }
}
