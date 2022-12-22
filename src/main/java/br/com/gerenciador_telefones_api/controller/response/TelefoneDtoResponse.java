package br.com.gerenciador_telefones_api.controller.response;

import br.com.gerenciador_telefones_api.model.User;

public class TelefoneDtoResponse {
    private Long id;

    private String numero;

    private UserDtoResponse userDtoResponse;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public UserDtoResponse getUserDtoResponse() {
        return userDtoResponse;
    }

    public void setUserDtoResponse(UserDtoResponse userDtoResponse) {
        this.userDtoResponse = userDtoResponse;
    }
}
