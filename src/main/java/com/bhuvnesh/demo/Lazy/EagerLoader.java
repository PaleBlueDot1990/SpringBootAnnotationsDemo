package com.bhuvnesh.demo.Lazy;

import org.springframework.stereotype.Component;

@Component
public class EagerLoader
{
    public EagerLoader()
    {
        System.out.println("Eager Loader...");
    }
}