package com.bhuvnesh.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean(name = "margharitaBean", initMethod = "init", destroyMethod = "destroy")
    public Pizza Margharita()
    {
        return new Margharita();
    }
}
