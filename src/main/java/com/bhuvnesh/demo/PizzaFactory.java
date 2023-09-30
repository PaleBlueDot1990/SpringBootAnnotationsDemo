package com.bhuvnesh.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("pizzaBean")
public class PizzaFactory
{
    /*
    @Autowired
    private VegPizza vegPizza;
    */

    /*
    @Autowired
    public PizzaFactory(VegPizza vegPizza)
    {
        this.vegPizza =  vegPizza;
    }
    */

    /*
    @Autowired
    public void setVegPizza(VegPizza vegPizza)
    {
        this.vegPizza = vegPizza;
    }
    */

    private Pizza pizza;

    /*
    @Autowired
    public PizzaFactory(@Qualifier("nonVegPizza") Pizza pizza)
    {
        this.pizza = pizza;
    }
    */

    @Autowired
    public PizzaFactory(Pizza pizza)
    {
        this.pizza = pizza;
    }

    public String getPizza()
    {
        return pizza.getPizza();
    }
}
