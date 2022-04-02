package br.com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.project.domain.TelefoneEntity;
import br.com.project.dto.TelefoneDTO;
import br.com.project.dto.UsuarioDTO;
import br.com.project.repository.TelefoneRepository;

@Service
public class TelefoneService {

	@Autowired
	private TelefoneRepository telefoneRepository;

	@Autowired
	private UsuarioService usuarioService;

	public List<TelefoneDTO> listarTelefones() {
		List<TelefoneEntity> telefoneEntityList = telefoneRepository.findAll();
		List<TelefoneDTO> telefoneDTOList = new ArrayList<>();
		for (TelefoneEntity telefoneEntity : telefoneEntityList) {
			TelefoneDTO telefoneDTO = new TelefoneDTO();
			UsuarioDTO usuarioDTO = new UsuarioDTO();
			telefoneDTO.setCelularTelefone(telefoneEntity.getCelularTelefone());
			telefoneDTO.setIdTelefone(telefoneEntity.getIdTelefone());
			telefoneDTO.setTelefoneTelefone(telefoneEntity.getTelefoneTelefone());
			telefoneDTO.setUsuario(usuarioDTO);
			telefoneDTOList.add(telefoneDTO);
		}

		return telefoneDTOList;
	}

	public TelefoneDTO buscarUmTelefone(Long id) {
		TelefoneEntity telefoneEntity = new TelefoneEntity();
		TelefoneDTO telefoneDTO = new TelefoneDTO();
		UsuarioDTO usuarioDTO = new UsuarioDTO();
		usuarioDTO = usuarioService.BuscarUm(id);
		telefoneEntity = telefoneRepository.findById(id).get();
		telefoneDTO.setCelularTelefone(telefoneEntity.getCelularTelefone());
		telefoneDTO.setIdTelefone(telefoneEntity.getIdTelefone());
		telefoneDTO.setTelefoneTelefone(telefoneEntity.getTelefoneTelefone());
		telefoneDTO.setUsuario(usuarioDTO);

		return telefoneDTO;
	}

	public TelefoneEntity salvar(TelefoneEntity telefone) {
		return telefoneRepository.save(telefone);
	}

}
