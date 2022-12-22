package br.com.gerenciador_telefones_api.service;

import br.com.gerenciador_telefones_api.controller.request.TelefoneDtoAtualizacaoRequest;
import br.com.gerenciador_telefones_api.controller.request.TelefoneDtoRequest;
import br.com.gerenciador_telefones_api.controller.request.UserDtoRequest;
import br.com.gerenciador_telefones_api.controller.response.TelefoneDetalhadoDtoResponse;
import br.com.gerenciador_telefones_api.controller.response.TelefoneDtoResponse;
import br.com.gerenciador_telefones_api.controller.response.TelefoneExtraDtoResponse;
import br.com.gerenciador_telefones_api.mapper.TelefoneMapper;
import br.com.gerenciador_telefones_api.mapper.UserMapper;
import br.com.gerenciador_telefones_api.model.Telefone;
import br.com.gerenciador_telefones_api.model.User;
import br.com.gerenciador_telefones_api.repository.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TelefoneService {

    @Autowired
    TelefoneRepository telefoneRepository;

    public void salvar(TelefoneDtoRequest telefoneDtoRequest) {
        Telefone telefone = TelefoneMapper.converterParaTelefone(telefoneDtoRequest);
        telefoneRepository.save(telefone);
    }

    public List<TelefoneDtoResponse> buscarTelefone() {
        return telefoneRepository.findAll().stream().map(TelefoneMapper::converterParaDto).collect(Collectors.toList());
    }

//    public TelefoneDetalhadoDtoResponse buscarPorId(Long id) {
//        Optional<Telefone> telefone =  telefoneRepository.findById(id);
//        TelefoneDetalhadoDtoResponse telefoneDtoResponse  = TelefoneMapper.converterParaDtoDetalhado(telefone.get());
//        return  telefoneDtoResponse;
//    }

    public TelefoneExtraDtoResponse buscarPorId(Long id){
     Optional<Telefone> telefoneOptional = telefoneRepository.findById(id);
       TelefoneExtraDtoResponse telefoneExtraDtoResponse = TelefoneMapper.converterParaDtoExtra(telefoneOptional.get());
     return  telefoneExtraDtoResponse;
    }

    public void  atualizarTelefone(TelefoneDtoAtualizacaoRequest telefoneDtoAtualizacaoRequest){
     Telefone telefone = TelefoneMapper.converterParaTelefone(telefoneDtoAtualizacaoRequest);
     telefoneRepository.save(telefone);
    }

    public void deletarTelefonePorId(Long id){
        telefoneRepository.deleteById(id);
    }

}
