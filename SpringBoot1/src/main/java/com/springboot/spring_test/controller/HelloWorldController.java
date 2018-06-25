package com.springboot.spring_test.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
   @RequestMapping("/abc")
   public String sayHello() {
      return "Hello Spring Boot!!";
   }
}