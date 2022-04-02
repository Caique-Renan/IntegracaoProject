package br.com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.project.domain.UsuarioEntity;
import br.com.project.dto.UsuarioDTO;
import br.com.project.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

//	metodo publico que retorna uma lista de usuario dto, de nome "buscarTodas" não recebe parâmetros
	public List<UsuarioDTO> buscarTodas() {
// Um find all dentro de usuario Repository, onde retorna uma lista de usuario Entity
		List<UsuarioEntity> usuarioEntityLista = usuarioRepository.findAll();
//	Criacao de lista de usuarioDTO
		List<UsuarioDTO> usuarioDTOList = new ArrayList<>();
//	Começo do laço for onde será percorrido cada item da lista de usuarioEntity
		for (UsuarioEntity usuarioEntity : usuarioEntityLista) {
//	criar uma instancia de usuarioDTO
			UsuarioDTO usuarioDTO = new UsuarioDTO();
//	"De x para" do usuarioEntity, para o usuarioDTO
			usuarioDTO.setIdUsuario(usuarioEntity.getIdUsuario());
			usuarioDTO.setNomeUsuario(usuarioEntity.getNomeUsuario());
			usuarioDTO.setCPFUsuario(usuarioEntity.getCPFUsuario());
			usuarioDTO.setEmailUsuario(usuarioEntity.getEmailUsuario());
			usuarioDTO.setEndereco(usuarioEntity.getEndereco());
			usuarioDTO.setIdadeUsuario(usuarioEntity.getIdadeUsuario());
			usuarioDTO.setMaeUsuario(usuarioEntity.getMaeUsuario());
			usuarioDTO.setPaiUsuario(usuarioEntity.getPaiUsuario());
			usuarioDTO.setSignoUsuario(usuarioEntity.getSignoUsuario());
			usuarioDTO.setTelefone(usuarioEntity.getTelefone());
			usuarioDTO.setGeneroUsuario(usuarioEntity.getGeneroUsuario());
//	usuarioDTO adicionado a lista de usuarioDTO
			usuarioDTOList.add(usuarioDTO);
		}
//	Retorno do método.
		return usuarioDTOList;

	}

	public UsuarioEntity salvarUsuario(UsuarioEntity usuario) {
		usuario.setIdUsuario(null);
		return usuarioRepository.save(usuario);
	}

//  1) visibilidade do metodo
//	2) tipo de retorno ?
//  3) nome do metodo
//	4) SE o metodo recebe alguma coisa
	public UsuarioDTO BuscarUm(Long id) {
		UsuarioEntity usuarioEntity = new UsuarioEntity();
		UsuarioDTO usuarioDTO = new UsuarioDTO();
		usuarioEntity = usuarioRepository.findById(id).get();
		usuarioDTO.setIdUsuario(usuarioEntity.getIdUsuario());
		usuarioDTO.setNomeUsuario(usuarioEntity.getNomeUsuario());
		usuarioDTO.setCPFUsuario(usuarioEntity.getCPFUsuario());
		usuarioDTO.setEmailUsuario(usuarioEntity.getEmailUsuario());
		usuarioDTO.setEndereco(usuarioEntity.getEndereco());
		usuarioDTO.setIdadeUsuario(usuarioEntity.getIdadeUsuario());
		usuarioDTO.setMaeUsuario(usuarioEntity.getMaeUsuario());
		usuarioDTO.setPaiUsuario(usuarioEntity.getPaiUsuario());
		usuarioDTO.setSignoUsuario(usuarioEntity.getSignoUsuario());
		usuarioDTO.setTelefone(usuarioEntity.getTelefone());
		usuarioDTO.setGeneroUsuario(usuarioEntity.getGeneroUsuario());

		return usuarioDTO;
	}

	public void Deletar(Long id) {
		usuarioRepository.deleteById(id);
	}

	public void atualizar(@RequestBody UsuarioEntity usuario, Long id) {
		usuarioRepository.save(usuario);
	}

}
