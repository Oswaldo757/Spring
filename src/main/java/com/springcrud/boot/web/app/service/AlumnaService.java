package com.springcrud.boot.web.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcrud.boot.web.app.interfaceService.IalumnaService;
import com.springcrud.boot.web.app.interfaces.IAlumna;
import com.springcrud.boot.web.app.modelo.Alumno;

@Service
public class AlumnaService implements IalumnaService  {
	
	@Autowired
	private IAlumna data;
	@Override
	public List<Alumno> listar() {
		// TODO Auto-generated method stub
		return (List<Alumno>)data.findAll();
	}

	@Override
	public Optional<Alumno> listarid(int id) {
	return data.findById(id);

	}

	@Override
	public int save(Alumno p) {
		int res=0;
		Alumno alumno=data.save(p);
		if(!alumno.equals(null)) {
			res=1;
			
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}
	
	

}
