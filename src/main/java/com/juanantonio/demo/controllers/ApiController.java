package com.juanantonio.demo.controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juanantonio.demo.entities.Agenda;
import com.juanantonio.demo.entities.Contacto;
import com.juanantonio.demo.entities.Usuario;
import com.juanantonio.demo.repositories.UsuarioRepository;

@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping("/hello")
	public Usuario comprobar() {
		Usuario user = new Usuario();
		user.setApellidos("gonzalez");
		user.setNombre("juan");
		user.setEmail("yo@email.xd");
		user.setPassword("12345678");
		List<Agenda> list= new ArrayList<Agenda>();
		List<Contacto> list2= new ArrayList<Contacto>();
		Contacto con = new Contacto();
		con.setType("empresa");
		list2.add(con);
		Agenda agenda=new Agenda();
		agenda.setContactos(list2);
		agenda.setDescripcion("miagenda");
		list.add(agenda);
		user.setAgenda(list);
		repository.save(user);
		
		return user;
	} 
	@GetMapping("/bye")
	public List<Usuario> recoger() {
		repository.findAll();
		return repository.findAll();
	} 
	

}
