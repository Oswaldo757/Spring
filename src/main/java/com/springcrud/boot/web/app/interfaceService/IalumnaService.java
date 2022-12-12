package com.springcrud.boot.web.app.interfaceService;

import java.util.List;
import java.util.Optional;

import com.springcrud.boot.web.app.modelo.Alumno;

public interface IalumnaService {
	public List<Alumno>listar();
	public Optional<Alumno>listarid(int id);
	public int save(Alumno p);
	public void delete (int id);

}
