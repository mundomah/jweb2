package com.htcursos.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.htcursos.model.Perfil;
import com.htcursos.model.Usuario;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UsuarioRepositoryTeste {
	
	@Autowired
	UsuarioRepository UsuarioRepository;
	@Autowired
	PerfilRepository perfilRepository;
	
	@Test
	public void deveCadastrarUsuario() {
		
		Perfil perfil = new Perfil();
		perfil.setDescricao("Administrador");
		
		Perfil perfilSalvo = perfilRepository.save(perfil);
		
		Usuario usuario = new Usuario();
		usuario.setNome("joao do senhoar");
		usuario.setLogin("joao");
		usuario.setSenha("123");
		usuario.setPerfil(perfilSalvo);
		
		Usuario usuarioSalvo = UsuarioRepository.save(usuario);
		Assert.assertNotNull(usuarioSalvo.getId());
}

}
