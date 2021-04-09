package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private CapitalService capitalService;

    @RequestMapping("/capital/{name}")
    public Country getCapital(@PathVariable("name") String name) {
       return capitalService.getCapital(name);
    }
}