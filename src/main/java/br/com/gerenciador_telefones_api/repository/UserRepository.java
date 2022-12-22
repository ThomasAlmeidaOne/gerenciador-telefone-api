package br.com.gerenciador_telefones_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gerenciador_telefones_api.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
