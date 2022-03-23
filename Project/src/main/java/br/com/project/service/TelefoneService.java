package br.com.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.project.domain.TelefoneEntity;
import br.com.project.repository.TelefoneRepository;

@Service
public class TelefoneService {
	
	private TelefoneRepository telefoneRepository;
	
	public List<TelefoneEntity> listar (){
		return telefoneRepository.findAll();
	}
	
	public TelefoneEntity salvar(TelefoneEntity telefone) {
		return telefoneRepository.save(telefone);
	}

}
