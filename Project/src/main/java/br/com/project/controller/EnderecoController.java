package br.com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.project.domain.EnderecoEntity;
import br.com.project.dto.EnderecoDTO;
import br.com.project.service.EnderecoService;

public class EnderecoController {
	
	@Autowired
	private EnderecoService enderecoService;

	@RequestMapping(value = "/{id}/endereco", method = RequestMethod.POST)
	public void adicionarEndereco(@PathVariable("id") Long usuarioId, @RequestBody EnderecoEntity endereco) {
		enderecoService.salvarEndereco(usuarioId, endereco);
	}

	@RequestMapping(value = "/{id}/endereco", method = RequestMethod.GET)
	public ResponseEntity<List<EnderecoDTO>> listarEndereco(@PathVariable("id") Long usuarioId) {
		List<EnderecoDTO> enderecos = enderecoService.listarEnderecos(usuarioId);

		return ResponseEntity.status(HttpStatus.OK).body(enderecos);
	}

}
