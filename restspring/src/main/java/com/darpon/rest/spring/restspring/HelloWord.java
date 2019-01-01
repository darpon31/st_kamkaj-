package com.darpon.rest.spring.restspring;


import org.springframework.web.bind.annotation.*;

//Controller
@RestController
public class HelloWord {

    //GET
    //URI
    //Method
@RequestMapping(method= RequestMethod.GET, path="/hello")
    public String hello(){

        return "Hello Nigga";
    }

    @GetMapping(path="/hellobean")
    public HelloWordBean hellobean(){

        return new HelloWordBean("Hello bean");
    }

    @GetMapping(path="/hellobean/path/{id}")
    public HelloWordBean hellobeanpath(@PathVariable String id){

        return new HelloWordBean(String.format("Hello to the new path %s",id));
    }

}
