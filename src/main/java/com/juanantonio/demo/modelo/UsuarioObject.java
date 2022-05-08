package com.juanantonio.demo.modelo;

import java.util.List;

import com.juanantonio.demo.entities.Agenda;
import com.juanantonio.demo.entities.Usuario;

public class UsuarioObject {
	
	private long id;

	private String nombre;
	
	private String apellidos;
	
	private String password;
	
	private String email;
	
	//private List<Agenda> agenda;
	
	

	public UsuarioObject(String nombre, String apellidos, String password, String email) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.password = password;
		this.email = email;
	}
	
	

	public UsuarioObject(Usuario user) {
		super();
		this.nombre = user.getNombre();
		this.apellidos = user.getApellidos();
		this.password = user.getPassword();
		this.email = user.getEmail();
		this.id = user.getId();
	}

	public Usuario getEntity() {
		Usuario entity = new Usuario(nombre, apellidos, password, email);
		return entity;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}



//	public List<Agenda> getAgenda() {
//		return agenda;
//	}
//
//
//
//	public void setAgenda(List<Agenda> agenda) {
//		this.agenda = agenda;
//	}
	
	
	

}
