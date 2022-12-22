package br.com.gerenciador_telefones_api.controller.request;

import br.com.gerenciador_telefones_api.model.User;

public class TelefoneDtoAtualizacaoRequest {

    private Long id;

    private  String numero;

    private Long userId;

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
