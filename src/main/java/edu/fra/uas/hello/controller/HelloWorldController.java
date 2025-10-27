package edu.fra.uas.hello.controller;
import org.springframework.*;
import org.springframework.web.bind.annotation.*;
public class HelloWorldController {
    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "<h1>Hello, World!!!</h1>";
    }

}
