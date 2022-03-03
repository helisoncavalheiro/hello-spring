package com.helison.hellospring.controller;

import java.util.concurrent.atomic.AtomicLong;

import com.helison.hellospring.model.Greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

  /**
   * todos os métodos desta classe retornam um JSON.
   * a anotação @RestController informa ao framework que esta classe possui endpoints
   * e que seus retornos devem ser convertidos em JSON.
   */
@RestController
public class GreetingController {
  
  private static final String TEMPLATE = "Hello %s";
  private final AtomicLong counter = new AtomicLong();

  @GetMapping("/greeting")
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
    return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
  }

}
