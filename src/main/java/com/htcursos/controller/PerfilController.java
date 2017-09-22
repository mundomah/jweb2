package com.htcursos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.htcursos.model.Perfil;
import com.htcursos.model.Usuario;
import com.htcursos.repository.PerfilRepository;

@RestController
public class PerfilController {

	@Autowired
	private PerfilRepository perfilRepository;

	@GetMapping(value = "/perfils")
	public List<Perfil> buscarTodos() {
		return perfilRepository.findAll();
	}

	// Rota para cadastrar Perfil
	@PostMapping(value = "/perfils")
	public void cadastrarPerfil(@RequestBody Perfil perfil) {
		perfilRepository.save(perfil);
	}
}