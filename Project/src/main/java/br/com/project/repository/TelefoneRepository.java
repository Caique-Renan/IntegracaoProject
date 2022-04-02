package br.com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.project.domain.TelefoneEntity;

@Repository
public interface TelefoneRepository extends JpaRepository<TelefoneEntity, Long>{

}
