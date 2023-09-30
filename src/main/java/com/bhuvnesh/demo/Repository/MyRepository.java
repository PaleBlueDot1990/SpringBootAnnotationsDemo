package com.bhuvnesh.demo.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository
{
    public String sayHello()
    {
        return "Hello Repository";
    }
}
