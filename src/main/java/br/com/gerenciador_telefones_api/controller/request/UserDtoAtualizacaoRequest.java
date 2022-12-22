package br.com.gerenciador_telefones_api.controller.request;

import java.time.LocalDate;

public class UserDtoAtualizacaoRequest {
    private Long id;
    private String nome;
    private LocalDate dataNascimento;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
