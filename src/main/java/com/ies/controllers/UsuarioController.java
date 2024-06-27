package com.ies.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ies.dao.UsuarioDao;
import com.ies.models.Usuario;

@RestController
public class UsuarioController {
	

	
	@GetMapping("/usuario")
    public Usuario listarUsuarios() {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		usuario.setNombre("Juan");
		usuario.setApellido("Perez");
		usuario.setEmail("jPerez@gmail.com");
		usuario.setTelefono("999");
		usuario.setContraseña("123");
		
        return usuario;
    }
	
	//Inyeccion de dependencia
	@Autowired
	private UsuarioDao usuarioDao;
	
	@GetMapping("api/usuarios")
	public List<Usuario> getUsuario(){
		
		List<Usuario> user= usuarioDao.obtenerUsuarios();
	
		return user;
	}
	
	
}
