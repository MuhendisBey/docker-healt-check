package com.muhendisbey.dockerhealthcheck.serviceb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EchoController
{
    @GetMapping("/{message}")
    String echo(@PathVariable String message)
    {
        return String.valueOf("From Service B => Hello: " + message);
    }
}
