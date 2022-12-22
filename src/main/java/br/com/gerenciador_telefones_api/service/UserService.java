package br.com.gerenciador_telefones_api.service;

import br.com.gerenciador_telefones_api.controller.request.UserDtoAtualizacaoRequest;
import br.com.gerenciador_telefones_api.controller.request.UserDtoRequest;
import br.com.gerenciador_telefones_api.controller.response.UserDtoResponse;
import br.com.gerenciador_telefones_api.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gerenciador_telefones_api.model.User;
import br.com.gerenciador_telefones_api.repository.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void salvar(UserDtoRequest userDtoRequest) {
        User user = UserMapper.converterParaUser(userDtoRequest);
        userRepository.save(user);
    }

    public List<UserDtoResponse> buscarUsers() {
        return userRepository.findAll().stream().map(UserMapper::converterParaDto).collect(Collectors.toList());
    }

    public User buscarPorId(Long id) {
        Optional<User> byId = userRepository.findById(id);
        return byId.orElseThrow(() -> new RuntimeException("User não encontrado"));
    }

	public void atualizarUser(UserDtoAtualizacaoRequest userDtoAtualizacaoRequest){
        User userAtualicao = UserMapper.converterParaUser(userDtoAtualizacaoRequest);
        userRepository.save(userAtualicao);
    }

    public void deletarUserPorId(Long id){
        userRepository.deleteById(id);
    }
}
