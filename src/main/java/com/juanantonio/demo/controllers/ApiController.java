package com.juanantonio.demo.controllers;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.juanantonio.demo.entities.Agenda;
import com.juanantonio.demo.entities.Contacto;
import com.juanantonio.demo.entities.Usuario;
import com.juanantonio.demo.modelo.Response;
import com.juanantonio.demo.repositories.UsuarioRepository;
import com.juanantonio.demo.service.ServiceApp;

@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	private UsuarioRepository repository;
	
	@Autowired
	private ServiceApp service;
	
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
	public Optional<Usuario> recoger() {
		Usuario user =repository.findById(8L).get();
		Contacto con = new Contacto();
		user.getAgenda().get(0).getContactos().add(con);
		repository.save(user);
		return repository.findById(8L);
	}
	@PostMapping("/login")
	public Response<Usuario> login(@RequestBody Map<String,Object> body,HttpSession sesion) {
		return service.login(sesion, (String)body.get("email"), (String)body.get("password"));
		//return null;
	}
}
