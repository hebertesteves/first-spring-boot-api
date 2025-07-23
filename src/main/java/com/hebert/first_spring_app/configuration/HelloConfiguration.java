package com.hebert.first_spring_app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {

    @Bean // É usada para indicar gerenciar o retorno desse metodo como um bean no contexto da aplicacao
    public String helloWorld() {
        return "Hello World";
    }
}
