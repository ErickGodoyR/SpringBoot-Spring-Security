package com.registro.usuarios.servicio;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.registro.usuarios.DTO.UsuarioRegistroDTO;
import com.registro.usuarios.modelo.Usuario;

@Service
public interface UsuarioServicio extends UserDetailsService {

	public Usuario guardar(UsuarioRegistroDTO registroDTO);
}
