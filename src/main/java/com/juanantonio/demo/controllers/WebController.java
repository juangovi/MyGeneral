package com.juanantonio.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.juanantonio.demo.entities.Usuario;
import com.juanantonio.demo.repositories.UsuarioRepository;



@Controller
public class WebController {
	@Autowired
	private UsuarioRepository repository;

	@GetMapping("/newuser")
	public String verlistado( Model model) {
		model.addAttribute("user", new Usuario());
		//repository.save((Usuario) model.getAttribute("user"));
		return "newuser";
	}
	
	@PostMapping("/newuser")
	public String verlistado(@ModelAttribute Usuario user) {
		repository.save(user);
		return "newuser";
	}
}
