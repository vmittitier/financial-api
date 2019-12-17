package com.devmit.financialapi.domain.repositories;

import com.devmit.financialapi.domain.entities.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
