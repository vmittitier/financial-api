package com.devmit.financialapi.domain.entities.service;

import com.devmit.financialapi.domain.entities.usuario.Usuario;

public interface UsuarioService {

    Usuario autenticar(String email, String senha);

    Usuario salvarUsuario(Usuario usuario);

    void validarEmail(String email);



}
