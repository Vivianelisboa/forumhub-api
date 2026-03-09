
package com.forumhub.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.forumhub.model.Usuario;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
 Optional<Usuario> findByLogin(String login);
}
