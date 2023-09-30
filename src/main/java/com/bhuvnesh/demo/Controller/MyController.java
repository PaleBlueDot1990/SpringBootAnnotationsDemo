package com.bhuvnesh.demo.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController
{
    public String sayHello()
    {
        return "Hello Controller";
    }
}
