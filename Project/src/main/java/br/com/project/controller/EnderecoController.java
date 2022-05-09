package br.com.project.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.project.dto.EnderecoDTO;
import br.com.project.dto.ViaCEPRequestDTO;
import br.com.project.dto.ViaCEPResponseDTO;
import br.com.project.service.EnderecoService;

@RestController
@RequestMapping("/endereco")
public class EnderecoController implements Serializable {

	private static final long serialVersionUID = 6046704732666502085L;
	@Autowired
	private EnderecoService enderecoService;


	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<List<EnderecoDTO>> listarEndereco(@PathVariable("id") Long usuarioId) {
		List<EnderecoDTO> enderecos = enderecoService.listarEnderecos(usuarioId);

		return ResponseEntity.status(HttpStatus.OK).body(enderecos);
	}

	@PostMapping
	public ResponseEntity<ViaCEPResponseDTO> salvarEndereco(@RequestBody ViaCEPRequestDTO request) {
		ViaCEPResponseDTO response = enderecoService.salvarEnderecoV1(request);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

}
