package com.example.hellospring.controller;

import com.example.hellospring.models.Coffee;
import com.example.hellospring.models.Pizza;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping( "pizza")


public class PizzaController {

    @GetMapping("margherita")
    public Pizza getPizza() {
        Pizza pizza = new Pizza("Margherita", "Medium", 4);
        return pizza;
        }
}