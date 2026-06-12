package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {

    /**
     * método para retornar os dados de um aluno
     * @return String formatada com os dados do aluno
     */
    @GetMapping("/aluno")
    public String getAluno() {
        return "Nome: João Pedro Toaldo\nCurso: Sistemas de Informação";
    }
}
