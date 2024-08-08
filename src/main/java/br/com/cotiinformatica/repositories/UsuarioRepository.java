package br.com.cotiinformatica.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.cotiinformatica.entities.Perfil;
import br.com.cotiinformatica.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Perfil, UUID>{
	
	@Query("SELECT u FROM Usuario u WHERE u.email = :email")
	Usuario getByEmail(@Param("email") String email);
	
	@Query("SELECT u FROM Usuario u WHERE u. email = :email, u.senha = :senha")
	Usuario getByEmailESenha(@Param("email") String email, @Param("senha") String senha);
	
}
