package com.soleo.exame_soleo.service;

import com.soleo.exame_soleo.entity.Usuario;
import com.soleo.exame_soleo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    //Lista todos os usuarios
    public List<Usuario> listarUsuarios(){
        return usuarioRepository.findAll();
    }

    //Buscar pelo id
    public Optional<Usuario> buscarId(Long id){
        return usuarioRepository.findById(id);
    }

    //Cadastrar um novo usuario
    public Usuario salvarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

}
