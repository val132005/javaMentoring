package com.val132005.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Recepcin se solicitudes y manejo de tipo REST
@RestController
@RequestMapping("/hello")
public class Hello {
    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable String name){
        return "Hello "+ name;
    }

}
