package com.bhuvnesh.demo;

public class Margharita implements Pizza
{
    @Override
    public String getPizza()
    {
        return "Margharita";
    }

    public void init()
    {
        System.out.println("Creating Margharita");
    }

    public void destroy()
    {
        System.out.println("Destroying Margharita");
    }
}
