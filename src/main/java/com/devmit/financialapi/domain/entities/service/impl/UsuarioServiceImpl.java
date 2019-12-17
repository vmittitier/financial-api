package com.devmit.financialapi.domain.entities.service.impl;

import com.devmit.financialapi.domain.entities.service.UsuarioService;
import com.devmit.financialapi.domain.entities.usuario.Usuario;
import com.devmit.financialapi.domain.repositories.UsuarioRepository;

public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository repository;

    public UsuarioServiceImpl(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public Usuario autenticar(String email, String senha) {
        return null;
    }

    @Override
    public Usuario salvarUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public void validarEmail(String email) {

    }
}
