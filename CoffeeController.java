package com.example.hellospring.controller;

import com.example.hellospring.models.Coffee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping( "coffees")
public class CoffeeController {

    @GetMapping("single")
    public Coffee getCoffee() {
        Coffee coffee = new Coffee("Espresso con un cucchiaino di zucchero", "Italy", 5);
            return coffee;        }

    @GetMapping("all")
    public List<Coffee> getCoffees() {
        List<Coffee> coffees = new ArrayList<>();
        coffees.add(new Coffee("Espresso con un cucchiaino di zucchero", "Italy", 5));
        coffees.add(new Coffee("Cappuccino", "Italy", 6));
        coffees.add(new Coffee("Latte", "Italy", 7));
        return coffees;
    }
    @GetMapping("first")
public Coffee getFirstCoffee() {
        List<Coffee> coffees = new ArrayList<>();
        coffees.add(new Coffee("Espresso Italiano", "Italy", 5));
        coffees.add(new Coffee("Cappuccino", "Italy", 6));

        return coffees.get(0);
}
    @GetMapping("second")
    public Coffee getSecondCoffee () {
        List<Coffee> coffees = new ArrayList<>();
        coffees.add(new Coffee("Espresso Italiano", "Italy", 5));
        coffees.add(new Coffee("Cappuccino", "Italy", 6));
        return coffees.get(1);
    }


}