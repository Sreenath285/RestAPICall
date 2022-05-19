package com.example.restapi.controller;

import com.example.restapi.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {

    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello () {
        return "Hello from Sreenath";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name;
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name;
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName();
    }
}
