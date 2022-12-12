package com.springcrud.boot.web.app.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springcrud.boot.web.app.modelo.Alumno;





@Repository
public interface IAlumna extends CrudRepository <Alumno, Integer> {

}
