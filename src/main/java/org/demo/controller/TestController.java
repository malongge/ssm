package org.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/hello")
public class TestController {

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String yourName(@PathVariable(value = "name") String name) {
        return "your name is: " + name;
    }

}
