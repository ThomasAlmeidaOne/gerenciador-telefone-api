package br.com.gerenciador_telefones_api.repository;

import br.com.gerenciador_telefones_api.model.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository  extends JpaRepository<Telefone,Long>{
}
