package br.com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.project.domain.EnderecoEntity;
import br.com.project.domain.UsuarioEntity;
import br.com.project.repository.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private EnderecoRepository enderecoRepository;

	public EnderecoEntity salvarEndereco(Long usuarioId, EnderecoEntity endereco) {
		Optional<UsuarioEntity> usuario = usuarioService.BuscarUm(usuarioId);

		endereco.setUsuario(usuario, usuario);

		return enderecoRepository.save(endereco);
	}
	
	@SuppressWarnings("unchecked")
	public List<EnderecoEntity> listarEnderecos(Long usuarioId){
		Optional<UsuarioEntity> usuario = usuarioService.BuscarUm(usuarioId);
		
		return (List<EnderecoEntity>) usuario.get();
	}

}
