package br.com.gerenciador_telefones_api.mapper;

import br.com.gerenciador_telefones_api.controller.request.UserDtoAtualizacaoRequest;
import br.com.gerenciador_telefones_api.controller.request.UserDtoRequest;
import br.com.gerenciador_telefones_api.controller.response.UserDtoExtraResponse;
import br.com.gerenciador_telefones_api.controller.response.UserDtoResponse;
import br.com.gerenciador_telefones_api.model.User;

public class UserMapper {
    public static User converterParaUser(UserDtoRequest userDtoRequest) {
        User user = new User();
        user.setNome(userDtoRequest.getNome());
        user.setDataNascimento(userDtoRequest.getDataNascimento());
        return user;
    }

    public static User converterParaUser(UserDtoAtualizacaoRequest userDtoAtualizacaoRequest) {
        User user = new User();
        user.setId(userDtoAtualizacaoRequest.getId());
        user.setNome(userDtoAtualizacaoRequest.getNome());
        user.setDataNascimento(userDtoAtualizacaoRequest.getDataNascimento());
        return user;
    }

    public static UserDtoResponse converterParaDto(User user) {
        UserDtoResponse userDtoResponse = new UserDtoResponse();
        userDtoResponse.setId(user.getId());
        userDtoResponse.setNome(user.getNome());
        userDtoResponse.setDataNascimento(user.getDataNascimento());
        return userDtoResponse;
    }

    public  static UserDtoExtraResponse converterParaDtoExtra(User user){
        UserDtoExtraResponse userDtoExtraResponse = new UserDtoExtraResponse();

        userDtoExtraResponse.setNome(user.getNome());
        userDtoExtraResponse.setDataNascimento(user.getDataNascimento());
        return userDtoExtraResponse;

    }
}
