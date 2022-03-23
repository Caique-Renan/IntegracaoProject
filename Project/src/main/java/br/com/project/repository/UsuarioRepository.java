package br.com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.domain.UsuarioEntity;


public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

}
