package Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import Repository.UsuarioRepository;
import domain.Usuario;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public List<Usuario> buscarTodas() {
		return usuarioRepository.findAll();
	}

	public Usuario salvarUsuario(Usuario usuario) {
		usuario.setIdUsuario(null);
		return usuarioRepository.save(usuario);
	}

	public Optional<Usuario> BuscarUm(Long id) {
		return usuarioRepository.findById(id);
	}

	public void Deletar(Long id) {
		usuarioRepository.deleteById(id);
	}

	public void atualizar(@RequestBody Usuario usuario, Long id) {
		verificarExistencia(usuario.getIdUsuario());
		usuarioRepository.save(usuario);
	}
	
	private void verificarExistencia(Long id) {
		BuscarUm(id);
	}

}
