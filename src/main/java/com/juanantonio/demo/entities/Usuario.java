package com.juanantonio.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String nombre;
	
	private String apellidos;
	
	private String password;
	
	private String email;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Agenda> agenda;

	//private String agenda;
	
	
	
	public long getId() {
		return id;
	}
	
	public Usuario() {
	}

	public Usuario(String nombre, String apellidos, String password, String email) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.password = password;
		this.email = email;
	}

	public void setId(long id) {
		this.id = id;
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

	public List<Agenda> getAgenda() {
		return agenda;
	}

	public void setAgenda(List<Agenda> agenda) {
		this.agenda = agenda;
	}
	
	
	

}
