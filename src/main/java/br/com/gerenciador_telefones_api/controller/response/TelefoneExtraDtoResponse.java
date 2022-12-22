package br.com.gerenciador_telefones_api.controller.response;

import java.time.LocalDate;

public class TelefoneExtraDtoResponse {
    private Long id;

    private String numero;

   private UserDtoExtraResponse userDtoExtraResponse;

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

    public UserDtoExtraResponse getUserDtoExtraResponse() {
        return userDtoExtraResponse;
    }

    public void setUserDtoExtraResponse(UserDtoExtraResponse userDtoExtraResponse) {
        this.userDtoExtraResponse = userDtoExtraResponse;
    }
}
