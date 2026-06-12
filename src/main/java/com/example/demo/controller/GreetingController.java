package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    /**
     * método para retornar uma saudação personalizada
     * @param name nome do usuário
     * @return String formatada contendo o texto "Olá " seguido do nome do usuário
     */
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "Mundo") String name) {
        return String.format("Olá %s!", name);
    }

    /**
     * método para somar dois valores inteiros recebidos via URL
     * @param a primeiro valor 
     * @param b segundo valor
     * @return string formatada contendo o texto "Resultado: " seguido do valor da soma
     */
    @GetMapping("/soma")
    public String soma(@RequestParam int a, @RequestParam int b) {
        int resultado = a + b;
        return "Resultado: " + resultado;
    }
}