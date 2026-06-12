package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessorController {

    /**
     * método para retornar os dados de um professor e sua disciplina
     * @return String formatada com os dados do professor
     */
    @GetMapping("/professor")
    public String getProfessor() {
        return "Professor: Ana Paula Canal\nDisciplina: Sistemas Operacionais";
    }
}
