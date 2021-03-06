package com.juanantonio.demo.entities;



//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//import javax.persistence.ManyToOne;

@Entity
public class Contacto {

	private String type;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private int telefono;

	private int cif;
	
	private String nombreCeo;
	 
//	@ManyToOne(cascade = CascadeType.PERSIST)
//	private Agenda agenda;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getCif() {
		return cif;
	}

	public void setCif(int cif) {
		this.cif = cif;
	}

	public String getNombreCeo() {
		return nombreCeo;
	}

	public void setNombreCeo(String nombreCeo) {
		this.nombreCeo = nombreCeo;
	}

//	public Agenda getAgenda() {
//		return agenda;
//	}
//
//	public void setAgenda(Agenda agenda) {
//		this.agenda = agenda;
//	}


}
