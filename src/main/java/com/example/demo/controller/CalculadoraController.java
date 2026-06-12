package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    /**
     * método para realizar operações matemáticas entre dois números inteiros
     * @param a primeiro número
     * @param b segundo número
     * @param operacao tipo de operação a ser realizada (soma, subtração, multiplicação ou divisão)
     * @return String formatada contendo o resultado da operação
     */
    @GetMapping("/calculadora")
    public String calculadora(
            @RequestParam int a,
            @RequestParam int b,
            @RequestParam String operacao) {

        if (operacao == null) {
            return "Operação inválida!";
        }

        switch (operacao.toLowerCase()) {
            case "soma":
                return "Resultado: " + (a + b);
            case "subtracao":
            case "subtração":
                return "Resultado: " + (a - b);
            case "multiplicacao":
            case "multiplicação":
                return "Resultado: " + (a * b);
            case "divisao":
            case "divisão":
                if (b == 0) {
                    return "Divisão por zero não é permitida!";
                }
                return "Resultado: " + (a / b);
            default:
                return "Operação inválida!";
        }
    }
}
