package br.com.gerenciador_telefones_api.mapper;

import br.com.gerenciador_telefones_api.controller.request.TelefoneDtoAtualizacaoRequest;
import br.com.gerenciador_telefones_api.controller.request.TelefoneDtoRequest;
import br.com.gerenciador_telefones_api.controller.request.UserDtoRequest;
import br.com.gerenciador_telefones_api.controller.response.*;
import br.com.gerenciador_telefones_api.model.Telefone;
import br.com.gerenciador_telefones_api.model.User;

public class TelefoneMapper {
    public static Telefone converterParaTelefone(TelefoneDtoRequest telefoneDtoRequest) {
        Telefone telefone = new Telefone();
        User user = new User();

        telefone.setNumero(telefoneDtoRequest.getNumero());
        user.setId(telefoneDtoRequest.getUserId());
        telefone.setUser(user);
        return telefone;
    }
    public static Telefone converterParaTelefone(TelefoneDtoAtualizacaoRequest telefoneDtoAtualizacaoRequest) {
        Telefone telefone = new Telefone();
        User user = new User();

        telefone.setId(telefoneDtoAtualizacaoRequest.getId());
        telefone.setNumero(telefoneDtoAtualizacaoRequest.getNumero());
        user.setId(telefoneDtoAtualizacaoRequest.getUserId());
        telefone.setUser(user);
        return telefone;
    }

    public static TelefoneDtoResponse converterParaDto(Telefone telefone){
        TelefoneDtoResponse telefoneDtoResponse = new TelefoneDtoResponse();
        UserDtoResponse userDtoResponse = UserMapper.converterParaDto(telefone.getUser());

        telefoneDtoResponse.setId(telefone.getId());
        telefoneDtoResponse.setNumero(telefone.getNumero());
        telefoneDtoResponse.setUserDtoResponse(userDtoResponse);
        return telefoneDtoResponse;
    }
    public static TelefoneDetalhadoDtoResponse converterParaDtoDetalhado(Telefone telefone){
        TelefoneDetalhadoDtoResponse dtoDetalhado = new  TelefoneDetalhadoDtoResponse();

        dtoDetalhado.setId(telefone.getId());
        dtoDetalhado.setNumero(telefone.getNumero());
        dtoDetalhado.setIdUser(telefone.getUser().getId());
        return dtoDetalhado;

    }

    public static TelefoneExtraDtoResponse converterParaDtoExtra(Telefone telefone){
        TelefoneExtraDtoResponse dtoExtraResponse =  new TelefoneExtraDtoResponse();
        UserDtoExtraResponse userDtoExtraResponse = UserMapper.converterParaDtoExtra(telefone.getUser());

        dtoExtraResponse.setId(telefone.getId());
        dtoExtraResponse.setNumero(telefone.getNumero());
        dtoExtraResponse.setUserDtoExtraResponse(userDtoExtraResponse);
        return  dtoExtraResponse;
    }

}
