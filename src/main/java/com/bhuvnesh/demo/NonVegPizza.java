package com.bhuvnesh.demo;

import org.springframework.stereotype.Component;

@Component
public class NonVegPizza implements Pizza
{
    public String getPizza()
    {
        return "Non-veg Pizza";
    }
}
