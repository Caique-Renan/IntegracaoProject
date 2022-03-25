package br.com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.project.domain.EnderecoEntity;
import br.com.project.domain.UsuarioEntity;
import br.com.project.dto.EnderecoDTO;
import br.com.project.dto.UsuarioDTO;
import br.com.project.repository.EnderecoRepository;
import br.com.project.repository.UsuarioRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private UsuarioService usuarioService;

	public EnderecoEntity salvarEndereco(Long usuarioId, EnderecoEntity endereco) {
//		Optional<UsuarioEntity> usuario = usuarioService.BuscarUm(usuarioId);
//
//		endereco.setUsuario(usuario, usuario);

		return enderecoRepository.save(endereco);
	}

	public List<EnderecoDTO> listarEnderecos(Long usuarioId) {
		List<EnderecoEntity> enderecoEntityList = new ArrayList<>();
		List<EnderecoDTO> enderecoDTOList = new ArrayList<>();
		for (EnderecoEntity enderecoEntity : enderecoEntityList) {
			EnderecoDTO enderecoDTO = new EnderecoDTO();
			UsuarioDTO usuarioDTORecovered = new UsuarioDTO();
			usuarioDTORecovered = usuarioService.BuscarUm(usuarioId);
			enderecoDTO.setUsuarioDTO(usuarioDTORecovered);
			enderecoDTO.setBairroEndereco(enderecoEntity.getBairroEndereco());
			enderecoDTO.setCEPEndereco(enderecoEntity.getCEPEndereco());
			enderecoDTO.setCidadeEndereco(enderecoEntity.getCidadeEndereco());
			enderecoDTO.setEstadoEndereco(enderecoEntity.getEstadoEndereco());
			enderecoDTO.setNumeroendereco(enderecoEntity.getNumeroendereco());
			enderecoDTO.setRuaEndereco(enderecoEntity.getRuaEndereco());
			enderecoDTO.setIdEndereco(enderecoEntity.getIdEndereco());
			enderecoDTOList.add(enderecoDTO);
		}

		return enderecoDTOList;
	}

}
