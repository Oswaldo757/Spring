package com.springcrud.boot.web.app.interfaceService;

import java.util.List;
import java.util.Optional;

import com.springcrud.boot.web.app.modelo.Materias;



public interface ImateriaService {
	public List<Materias>listarf();
	public Optional<Materias>listarid(int id);
	public int save(Materias p);
	public void delete (int id);


}
