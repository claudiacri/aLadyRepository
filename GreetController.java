package com.example.hellospring.controller;


import com.example.hellospring.models.Greet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// SI SCRIVE RESTCONTROLLER E REQUESTMAPPING
@RestController
@RequestMapping( "greet")
// DENTRO CLASSE CREO METODO
public class GreetController {
    // get mapping usando Greet Class


    @GetMapping("/")
    public Greet index(){
        return new Greet("Hello Spring Boot");
    }

     @GetMapping("hello")
        public Greet hello (){
        return new Greet("HELLO GIPSY  I LOVE YOU SOOO MUCH 13.5.26");
    }
    @GetMapping("hola")
        public Greet hola (){
        return new Greet("HOLA GIPSY TE QUIERO MUCHO COMO LA TRUCHA AL TRUCHO 13.5.26");
    }

    @GetMapping("hello/name/{name}")
    Greet greetName (@PathVariable String name){
        return new Greet("Hello " + name);
    }

  }

