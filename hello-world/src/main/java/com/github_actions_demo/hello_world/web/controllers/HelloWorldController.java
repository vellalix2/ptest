package com.github_actions_demo.hello_world.web.controllers;

import com.github_actions_demo.hello_world.web.responses.HelloWorldResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping(value = "hello-world", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public HelloWorldResponse get(@RequestParam(value="name") String name,
                                  @RequestParam(value="surname") String surname) {
        return new HelloWorldResponse("Hello " + name + " " + surname + "!");
    }
}
