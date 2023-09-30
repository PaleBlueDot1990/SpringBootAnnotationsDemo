package com.bhuvnesh.demo;

import com.bhuvnesh.demo.Controller.MyController;
import com.bhuvnesh.demo.Lazy.LazyLoader;
import com.bhuvnesh.demo.Repository.MyRepository;
import com.bhuvnesh.demo.Scope.PrototypeBean;
import com.bhuvnesh.demo.Scope.SingletonBean;
import com.bhuvnesh.demo.Service.MyService;
import com.bhuvnesh.demo.Value.ValueAnnotationDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;

@SpringBootApplication
public class Main
{
    public static void main(String[] args)
    {
        var context = SpringApplication.run(Main.class, args);

        //PizzaFactory pizzaFactory = context.getBean(PizzaFactory.class);
        //System.out.println(pizzaFactory.getPizza());

        //PizzaFactory pizzaFactory = (PizzaFactory) context.getBean("pizzaBean");
        //System.out.println(pizzaFactory.getPizza());

        //Margharita margharita = context.getBean(Margharita.class);
        //System.out.println(margharita.getPizza());

        //Pizza pizza = context.getBean(Margharita.class);
        //System.out.println(pizza.getPizza());

        //Pizza pizza = (Pizza)context.getBean("margharitaBean");
        //System.out.println(pizza.getPizza());


        //MyController myController = context.getBean(MyController.class);
        //MyService myService = context.getBean(MyService.class);
        //MyRepository myRepository = context.getBean(MyRepository.class);
        //System.out.println(myController.sayHello() + "|" + myService.sayHello() + "|" + myRepository.sayHello());

        //LazyLoader lazyLoader = context.getBean(LazyLoader.class);

        //SingletonBean singletonBean1 = context.getBean(SingletonBean.class); //A SingletonBean object is created
        //SingletonBean singletonBean2 = context.getBean(SingletonBean.class); //Equivalent tp singeltonBean2=singletonBean1
        //SingletonBean singletonBean3 = context.getBean(SingletonBean.class); //Equivalent tp singeltonBean3=singletonBean1
        //System.out.println(singletonBean1.hashCode() + "|" + singletonBean2.hashCode() + "|" + singletonBean3.hashCode());

        //PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class); //A PrototypeBean object is created
        //PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class); //Another PrototypeBean object is created
        //PrototypeBean prototypeBean3 = context.getBean(PrototypeBean.class); //Another PrototypeBean object is created
        //System.out.println(prototypeBean1.hashCode() + "|" + prototypeBean2.hashCode() + "|" + prototypeBean3.hashCode());

        //ValueAnnotationDemo valueAnnotationDemo = context.getBean(ValueAnnotationDemo.class);
        //System.out.println(valueAnnotationDemo.getDefaultName());
        //System.out.println(valueAnnotationDemo.getHost());
        //System.out.println(valueAnnotationDemo.getEmail());
        //System.out.println(valueAnnotationDemo.getPassword());
    }
}
