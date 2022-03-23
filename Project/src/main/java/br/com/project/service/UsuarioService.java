package br.com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.project.domain.UsuarioEntity;
import br.com.project.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public List<UsuarioEntity> buscarTodas() {
		return usuarioRepository.findAll();
	}

	public UsuarioEntity salvarUsuario(UsuarioEntity usuario) {
		usuario.setIdUsuario(null);
		return usuarioRepository.save(usuario);
	}

	public Optional<UsuarioEntity> BuscarUm(Long id) {
		return usuarioRepository.findById(id);
	}

	public void Deletar(Long id) {
		usuarioRepository.deleteById(id);
	}

	public void atualizar(@RequestBody UsuarioEntity usuario, Long id) {
		verificarExistencia(usuario.getIdUsuario());
		usuarioRepository.save(usuario);
	}
	
	private void verificarExistencia(Long id) {
		BuscarUm(id);
	}

}
