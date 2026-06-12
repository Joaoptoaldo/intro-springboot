package com.example.demo.dto;

/**
 * Data Transfer Object para representar os dados de um perfil de usuário
 */
public record UserDTO(
    String nome, 
    String cpf, 
    String endereco
) {}