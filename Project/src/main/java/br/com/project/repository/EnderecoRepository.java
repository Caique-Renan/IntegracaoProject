package br.com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.domain.EnderecoEntity;

public interface EnderecoRepository extends JpaRepository<EnderecoEntity, Long>{

}
