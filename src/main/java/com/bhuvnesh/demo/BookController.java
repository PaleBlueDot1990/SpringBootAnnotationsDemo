package com.bhuvnesh.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//RestController => Controller + ResponseBody
@Controller
public class BookController
{
    @RequestMapping("/hello-world")
    @ResponseBody
    public String sayHelloWorld()
    {
        return "Hello World";
    }

    @RequestMapping("/getDefaultBook")
    @ResponseBody
    public Book getDefaultBook()
    {
        Book book = new Book("The Book Thief",
                                1,
                         "A story about a little girl growing in Nazi Germany",
                            "Markus Zuzak");
        return book;
    }
}
