package com.juanantonio.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Agenda {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
//	@ManyToOne(cascade = CascadeType.PERSIST)
//	private Usuario usuario;
	
	private String descripcion;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Contacto> contactos;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(List<Contacto> contactos) {
		this.contactos = contactos;
	}

//	public Usuario getUserId() {
//		return usuario;
//	}
//
//	public void setUserId(Usuario usuario) {
//		this.usuario = usuario;
//	}
	
	

}
