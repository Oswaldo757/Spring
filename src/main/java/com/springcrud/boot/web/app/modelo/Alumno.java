package com.springcrud.boot.web.app.modelo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Alumno")


public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String Apellido;

@OneToMany(mappedBy = "alumno",fetch = FetchType.LAZY, cascade = CascadeType.ALL )
private List<Materias> materias;




public Alumno() {

	materias = new ArrayList<Materias>();
	
		}

public Alumno(int id, String name, String apellido) {
	super();
	this.id = id;
	this.name = name;
	this.Apellido = apellido;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getApellido() {
	return Apellido;
}

public void setApellido(String apellido) {
	this.Apellido = apellido;
}

public List<Materias> getMaterias() {
	return materias;
}

public void setMaterias(List<Materias> materias) {
	this.materias = materias;
}





}

