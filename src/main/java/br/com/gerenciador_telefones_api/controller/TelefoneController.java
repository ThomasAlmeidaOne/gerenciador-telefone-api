package br.com.gerenciador_telefones_api.controller;

import br.com.gerenciador_telefones_api.controller.request.TelefoneDtoAtualizacaoRequest;
import br.com.gerenciador_telefones_api.controller.request.TelefoneDtoRequest;
import br.com.gerenciador_telefones_api.controller.response.TelefoneDetalhadoDtoResponse;
import br.com.gerenciador_telefones_api.controller.response.TelefoneDtoResponse;
import br.com.gerenciador_telefones_api.controller.response.TelefoneExtraDtoResponse;
import br.com.gerenciador_telefones_api.service.TelefoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/telefone")
public class TelefoneController {

    @Autowired
    TelefoneService telefoneService;

    @PostMapping
    public void salvar(@RequestBody TelefoneDtoRequest telefoneDtoRequest){
        telefoneService.salvar(telefoneDtoRequest);
    }

    @GetMapping
    public ResponseEntity<List<TelefoneDtoResponse>> buscarTelefones(){
        return ResponseEntity.ok(telefoneService.buscarTelefone());
    }
//    @GetMapping("/{id}")
//    public ResponseEntity<TelefoneDetalhadoDtoResponse> buscarTelefonePorId(@PathVariable Long id){
//        return ResponseEntity.ok(telefoneService.buscarPorId(id));
//    }

    @GetMapping("/usuario/dadospessoais/{id}")
    public ResponseEntity<TelefoneExtraDtoResponse> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(telefoneService.buscarPorId(id));
    }

    @PutMapping
    public ResponseEntity<Void> atualizarTelefone(TelefoneDtoAtualizacaoRequest telefoneDtoAtualizacaoRequest){
        telefoneService.atualizarTelefone(telefoneDtoAtualizacaoRequest);
       return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<Void> deletarPorId(Long id){
        telefoneService.deletarTelefonePorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
