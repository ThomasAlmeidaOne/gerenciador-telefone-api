package br.com.gerenciador_telefones_api.controller;

import br.com.gerenciador_telefones_api.controller.request.UserDtoAtualizacaoRequest;
import br.com.gerenciador_telefones_api.controller.request.UserDtoRequest;
import br.com.gerenciador_telefones_api.controller.response.UserDtoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import br.com.gerenciador_telefones_api.model.User;
import br.com.gerenciador_telefones_api.service.UserService;

import java.util.List;

@RestController()
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void salvar(@RequestBody UserDtoRequest userDtoRequest) {
        userService.salvar(userDtoRequest);
    }

    @GetMapping
    public ResponseEntity<List<UserDtoResponse>> buscarUsers() {
        return ResponseEntity.ok(userService.buscarUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(userService.buscarPorId(id));
    }

    @PutMapping
    public ResponseEntity<Void> atualizarUser(@RequestBody UserDtoAtualizacaoRequest userDtoAtualizacaoRequest) {
        userService.atualizarUser(userDtoAtualizacaoRequest);
       return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping
    public  ResponseEntity<Void> deletarUserPorId(Long id){
        userService.deletarUserPorId(id);
        return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
