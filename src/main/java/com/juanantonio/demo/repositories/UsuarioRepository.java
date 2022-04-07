package com.juanantonio.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.juanantonio.demo.entities.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	
	public Usuario save(Usuario todo);
	public List<Usuario> findAll();

}
