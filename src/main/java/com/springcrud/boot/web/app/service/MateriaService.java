package com.springcrud.boot.web.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcrud.boot.web.app.interfaceService.ImateriaService;
import com.springcrud.boot.web.app.interfaces.IMateria;
import com.springcrud.boot.web.app.modelo.Materias;

@Service
public class MateriaService implements ImateriaService  {
	
	@Autowired
	private IMateria data;
	@Override
	public List<Materias> listarf() {
		// TODO Auto-generated method stub
		return (List<Materias>)data.findAll();
	}

	@Override
	public Optional<Materias> listarid(int id) {
	return data.findById(id);

	}

	@Override
	public int save(Materias p) {
		int res=0;
		Materias materias=data.save(p);
		if(!materias.equals(null)) {
			res=1;
			}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}
	
	

}
