package com.registro.usuarios.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.registro.usuarios.DTO.UsuarioRegistroDTO;
import com.registro.usuarios.servicio.UsuarioServicio;


@Controller
@RequestMapping("/registro")
public class RegistroUsuarioControlador {

@Autowired
private UsuarioServicio	usuarioServicio;


@ModelAttribute("usuario")
public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO() {
	return new UsuarioRegistroDTO();
}

@GetMapping
public String mostrarFormularioRegistro() {
	return "registro";
}

@PostMapping
public String registrarCuentaDeUsuario(@ModelAttribute("usuario")UsuarioRegistroDTO registroDTO) {
	usuarioServicio.guardar(registroDTO);
	return "redirect:/registro?exito";
}

}
