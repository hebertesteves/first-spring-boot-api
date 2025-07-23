package com.hebert.first_spring_app.controller;

import com.hebert.first_spring_app.domain.User;
import com.hebert.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
// STATELESS -> a cada nova requisicao eu recebo todas as informacao que eu preciso para fazer aquela funcionalidade que o cliente esta pedindo (token)
// STATEFULL -> o estado de cada cliente é mantido no servidory
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired // Indica que esse atributo deve ser injetada
    private HelloWorldService helloWorldService;

    /*
    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }
     */

    // post, get, delete, put, patch, options, head
    // GET no endpoint /hello-world
    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Hebert");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body) {
        return "Hello World " + body.getName() + " Id: " + id + " Filter: " + filter;
    }
}
