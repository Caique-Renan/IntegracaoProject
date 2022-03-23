package Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.EnderecoRepository;
import domain.Endereco;
import domain.Usuario;

@Service
public class EnderecoService {

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private EnderecoRepository enderecoRepository;

	public Endereco salvarEndereco(Long usuarioId, Endereco endereco) {
		Optional<Usuario> usuario = usuarioService.BuscarUm(usuarioId);

		endereco.setUsuario(usuario, usuario);

		return enderecoRepository.save(endereco);
	}

}
