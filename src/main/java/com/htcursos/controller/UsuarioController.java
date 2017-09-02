package com.htcursos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htcursos.model.Usuario;
import com.htcursos.repository.UsuarioRepository;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping(value="/usuarios")
	public List<Usuario> buscarTodos(){
		return usuarioRepository.findAll();
	}

}
