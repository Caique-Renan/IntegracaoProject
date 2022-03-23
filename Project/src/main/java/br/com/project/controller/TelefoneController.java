package br.com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.project.domain.TelefoneEntity;
import br.com.project.service.TelefoneService;

@RestController
@RequestMapping("/telefone")
public class TelefoneController {
	
	@Autowired
	private TelefoneService telefoneService;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<TelefoneEntity>> lsitar (){
		return ResponseEntity.status(HttpStatus.OK).body(telefoneService.listar());
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public TelefoneEntity salvar(@RequestBody TelefoneEntity telefone){
		return telefoneService.salvar(telefone);
	}

}
