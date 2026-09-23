package com.forgeidea.api.repository;

import com.forgeidea.api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // O Spring cria o comando SQL SELECT automaticamente baseado no nome do metodo!
    Usuario findByEmailAndSenha(String email, String senha);

}
