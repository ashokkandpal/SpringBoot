package com.ashok.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "Hello, This is not the name of the view but a simple string";
    }

    @ResponseBody
    @RequestMapping("/api/firstendpoint")
    public String firstEndpoint(@RequestParam String name, @RequestParam int age){
        return "Name is : " + name + " and Age is :" + age;
    }
}
