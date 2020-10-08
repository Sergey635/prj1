package edu.iva.prj.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    String sayHello(){
        return "<h1>Hello from Controller</h1>";
    }

}
