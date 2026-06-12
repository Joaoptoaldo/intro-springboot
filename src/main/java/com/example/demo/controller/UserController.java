package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDTO;

@RestController
@RequestMapping("/user")
public class UserController {

    // mock de dados (em uma evolução futura, viria de um Banco de Dados ou Service)
    private final UserDTO mockUser = new UserDTO(
        "João Pedro Toaldo", 
        "123.456.789-00", 
        "João da Silva - Rua das Flores, 123"
    );

    /**
     * método para retornar o nome de um usuário
     * @return string contendo o nome do usuário
     */
    @GetMapping("/nome")
    public String getNome() {
        return mockUser.nome();
    }

    /**
     * método para retornar o CPF de um usuário
     * @return string contendo o cpf do usuário
     */
    @GetMapping("/cpf")
    public String getCpf() {
        return mockUser.cpf();
    }

    /**
     * método para retornar o endereço de um usuário
     * @return string contendo o endereço do usuário
     */
    @GetMapping("/endereco")
    public String getEndereco() {
        return mockUser.endereco();
    }

    /**
     * método para retornar os dados de um usuário
     * @return objeto UserDTO contendo os dados do usuário
     */
    @GetMapping("/perfil")
    public UserDTO getPerfil() {
        return mockUser;
    }
}