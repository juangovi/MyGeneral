package com.juanantonio.demo.service;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juanantonio.demo.entities.Usuario;
import com.juanantonio.demo.modelo.Response;
import com.juanantonio.demo.repositories.UsuarioRepository;



@Service
public class ServiceApp {

	@Autowired
	private UsuarioRepository userrepository;
	
	public Response<Usuario> login(HttpSession session, String email, String password) {
		Usuario user = userrepository.findByEmailAndPassword(email, password).orElse(null);
		Response<Usuario> res=new Response<Usuario>();
		if(user != null) {
			res.setStatus(200);
			res.setResponse(user);
			res.setServerMesage("sesion iniciada");
		}else {
			res.setStatus(404);
			res.setResponse(user);
			res.setServerMesage("usuario no existe");
		}
		return res;
	}
}
