package br.com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.domain.TelefoneEntity;

public interface TelefoneRepository extends JpaRepository<TelefoneEntity, Long>{

}
