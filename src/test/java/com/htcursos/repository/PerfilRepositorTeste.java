package com.htcursos.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.htcursos.model.Perfil;


@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class PerfilRepositorTeste {
	
		@Autowired
		PerfilRepository perfilRepository;
		
		@Test
		public void deveCadastrarPerfil() {
			
			Perfil perfil = new Perfil();
			perfil.setDescricao("Administrador");
			Perfil perfilsalvo = perfilRepository.save(perfil);
			
			Perfil perfil2 = new Perfil();
			perfil2.setDescricao("Tecnico");
			Perfil perfilsalvo2 = perfilRepository.save(perfil2);
			
			Assert.assertNotNull(perfilsalvo.getId());
			
			Assert.assertNotNull(perfilsalvo2.getId());
	}

	}


