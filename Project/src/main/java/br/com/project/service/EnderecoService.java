package br.com.project.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.project.domain.EnderecoEntity;
import br.com.project.domain.UsuarioEntity;
import br.com.project.dto.EnderecoDTO;
import br.com.project.dto.UsuarioDTO;
import br.com.project.dto.ViaCEPDTO;
import br.com.project.dto.ViaCEPRequestDTO;
import br.com.project.dto.ViaCEPResponseDTO;
import br.com.project.repository.EnderecoRepository;
import br.com.project.repository.UsuarioRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private UsuarioRepository usuarioRepository;


	public List<EnderecoDTO> listarEnderecos(Long usuarioId) {
		List<EnderecoEntity> enderecoEntityList = new ArrayList<>();
		List<EnderecoDTO> enderecoDTOList = new ArrayList<>();
		for (EnderecoEntity enderecoEntity : enderecoEntityList) {
			EnderecoDTO enderecoDTO = new EnderecoDTO();
			UsuarioDTO usuarioDTORecovered = new UsuarioDTO();
			usuarioDTORecovered = usuarioService.BuscarUm(usuarioId);
			enderecoDTO.setUsuarioDTO(usuarioDTORecovered);
			enderecoDTO.setBairro(enderecoEntity.getBairro());
			enderecoDTO.setCep(enderecoEntity.getCep());
			enderecoDTO.setComplemento(enderecoEntity.getComplemento());
			enderecoDTO.setDdd(enderecoEntity.getDdd());
			enderecoDTO.setGia(enderecoEntity.getGia());
			enderecoDTO.setIbge(enderecoEntity.getIbge());
			enderecoDTO.setLocalidade(enderecoEntity.getLocalidade());
			enderecoDTO.setLogradouro(enderecoEntity.getLogradouro());
			enderecoDTO.setSiafi(enderecoEntity.getSiafi());
			enderecoDTO.setUf(enderecoEntity.getUf());
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
		enderecoDTO.setBairro(enderecoEntity.getBairro());
		enderecoDTO.setIdEndereco(enderecoEntity.getIdEndereco());
		enderecoDTO.setCep(enderecoEntity.getCep());
		enderecoDTO.setComplemento(enderecoEntity.getComplemento());
		enderecoDTO.setDdd(enderecoEntity.getDdd());
		enderecoDTO.setGia(enderecoEntity.getGia());
		enderecoDTO.setIbge(enderecoEntity.getIbge());
		enderecoDTO.setLocalidade(enderecoEntity.getLocalidade());
		enderecoDTO.setLogradouro(enderecoEntity.getLogradouro());
		enderecoDTO.setSiafi(enderecoEntity.getSiafi());
		enderecoDTO.setUf(enderecoEntity.getUf());
		enderecoDTO.setUsuarioDTO(usuarioDTORecuperado);

		return enderecoDTO;

	}
	
	public ViaCEPResponseDTO salvarEnderecoV1(ViaCEPRequestDTO request){
		
		ViaCEPDTO responseClient = getViaCepAPIClient(request);
		
		EnderecoEntity enderecoEntity = new EnderecoEntity();
		UsuarioEntity usuarioEntity = usuarioRepository.findById(request.getIdUsuario()).get();
		
		
		enderecoEntity.setUsuarioEntity(usuarioEntity);
		enderecoEntity.setBairro(responseClient.getBairro());
		enderecoEntity.setCep(request.getCep());
		enderecoEntity.setComplemento(request.getComplemento());
		enderecoEntity.setIbge(responseClient.getIbge());
		enderecoEntity.setLocalidade(responseClient.getLocalidade());
		enderecoEntity.setLogradouro(responseClient.getLogradouro());
		enderecoEntity.setUf(responseClient.getUf());
		enderecoEntity.setNumero(Integer.valueOf(request.getNumero()));
		enderecoRepository.save(enderecoEntity);
		
		
		ViaCEPResponseDTO response = new ViaCEPResponseDTO();
		
		response.setBairro(responseClient.getBairro());
		response.setCep(responseClient.getCep());
		response.setComplemento(responseClient.getComplemento());
		response.setDdd(responseClient.getDdd());
		response.setGia(responseClient.getGia());
		response.setIbge(responseClient.getIbge());
		response.setLocalidade(responseClient.getLocalidade());
		response.setLogradouro(responseClient.getLogradouro());
		response.setSiafi(responseClient.getSiafi());
		response.setUf(responseClient.getUf());
		
		
		
		return response;
	}
	
	// ele busca no viaCEP retorna um obj VIACEPDTO
	//  getViaCepAPIClient
	public ViaCEPDTO getViaCepAPIClient(ViaCEPRequestDTO request) {
		RestTemplate restTemplate = new RestTemplate();
		String uri = "http://viacep.com.br/ws/{cep}/json/";
		Map<String, String> params = new HashMap<String, String>();
		params.put("cep", request.getCep());
		ViaCEPDTO viaCEPDTO = restTemplate.getForObject(uri, ViaCEPDTO.class, params);
		return viaCEPDTO;
	}

}
