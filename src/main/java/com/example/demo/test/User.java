package com.example.demo.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hi")
public class User {
      @Autowired
     private UserService userService;
    @GetMapping("/zero/{id}")
    public String getInfo(@PathVariable("id") String id) {

        userService.getDept(id);


        return "love u";
    }

}
