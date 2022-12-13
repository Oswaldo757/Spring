package com.springcrud.boot.web.app.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springcrud.boot.web.app.interfaceService.IalumnaService;
import com.springcrud.boot.web.app.interfaceService.ImateriaService;
import com.springcrud.boot.web.app.modelo.Alumno;
import com.springcrud.boot.web.app.modelo.Materias;


@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private IalumnaService service;
	@Autowired
	private ImateriaService services;
	
	
	
	@GetMapping("/listar")
	public String listar (Model model) {
		List<Alumno>alumnos= service.listar();
		model.addAttribute("alumnos", alumnos);
		
		return "index";
	}
	
	
	@GetMapping("/listarm")
	public String listarf (Model model) {
		List<Materias>materias= services.listarf();
		model.addAttribute("materias", materias);
		
		return "index";
	}
	
	
	@GetMapping("/guardar")
	public String agregar(Model model) {
		model.addAttribute("alumno",new Alumno());
		return "formulario";
	}
	@PostMapping("/guardar")
	public String save(@Validated Alumno p, Model model) {
		service.save(p);
		return "redirect:/listar";
		
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model){
		Optional<Alumno>alumno=service.listarid(id);
		model.addAttribute("alumno", alumno);
		
		return "formulario";
	}
	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable int id){
		service.delete(id);
		return "redirect:/listar";
		
	}
	
	
}
