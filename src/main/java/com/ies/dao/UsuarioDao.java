package com.ies.dao;

import java.util.List;

import com.ies.models.Usuario;

import jakarta.transaction.Transactional;

//La interfaz define las funciones que vamos a utilizar.
//Una interfaz tiene metodos que estan sin implementar.
//Una interfaz es equivalente a una herencia multiple.
@Transactional
public interface UsuarioDao {
	
	List<Usuario> obtenerUsuarios();

}
