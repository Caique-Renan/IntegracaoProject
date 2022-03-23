package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
