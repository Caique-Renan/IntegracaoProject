package br.com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.project.domain.EnderecoEntity;
import br.com.project.dto.EnderecoDTO;
import br.com.project.dto.UsuarioDTO;
import br.com.project.repository.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Autowired
	private UsuarioService usuarioService;

	public EnderecoEntity salvarEndereco(Long usuarioId, EnderecoEntity endereco) {
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

	public EnderecoDTO BuscarUmEndereco(Long id) {
		EnderecoEntity enderecoEntity = new EnderecoEntity();
		EnderecoDTO enderecoDTO = new EnderecoDTO();
		enderecoEntity = enderecoRepository.getById(id);
		UsuarioDTO usuarioDTORecuperado = new UsuarioDTO();
		usuarioDTORecuperado = usuarioService.BuscarUm(id);
		enderecoDTO.setBairroEndereco(enderecoEntity.getBairroEndereco());
		enderecoDTO.setCEPEndereco(enderecoEntity.getCEPEndereco());
		enderecoDTO.setCidadeEndereco(enderecoEntity.getCidadeEndereco());
		enderecoDTO.setEstadoEndereco(enderecoEntity.getEstadoEndereco());
		enderecoDTO.setIdEndereco(enderecoEntity.getIdEndereco());
		enderecoDTO.setNumeroendereco(enderecoEntity.getNumeroendereco());
		enderecoDTO.setRuaEndereco(enderecoEntity.getRuaEndereco());
		enderecoDTO.setUsuarioDTO(usuarioDTORecuperado);

		return enderecoDTO;

	}

}
