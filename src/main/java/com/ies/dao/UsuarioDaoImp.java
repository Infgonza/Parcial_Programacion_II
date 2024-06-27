package com.ies.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ies.models.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional //Nos permite integrar las consultas mysql que realizaran nuestras clases o metodos.
public class UsuarioDaoImp implements UsuarioDao{
	
	//Nos sirve para hacer la conexion con la BD
	@PersistenceContext
	private EntityManager entityManager;


	//Hacemos la consulta a la base de datos
	@Override
	public List<Usuario> obtenerUsuarios() {
		
		//Consulta con Hibernate
		String query="from Usuario";
		
		////Creamos la consulta (query) y ejecutamos la query (.getResultList)
		List<Usuario> resultado = entityManager.createQuery(query).getResultList();
		
		return resultado;
		
		
	}


}
