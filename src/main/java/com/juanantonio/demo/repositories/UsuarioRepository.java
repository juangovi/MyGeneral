package com.juanantonio.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


import com.juanantonio.demo.entities.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	
	//public Usuario save(Usuario todo);
	public List<Usuario> findAll();
	public Optional<Usuario> findByEmailAndPassword(String email, String password);
	public boolean existsByEmail(String email);

}
