package com.api.vacina.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.api.vacina.entities.Usuario;
import com.api.vacina.repositories.UsuarioRepository;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@RequestMapping(value = "/lista", method = RequestMethod.GET)
	public ModelAndView listar(){
		ModelAndView mv = new ModelAndView("usuario/lista");
		Iterable<Usuario> usuarios = usuarioRepository.findAll();
		mv.addObject("usuario", usuarios);
		return mv;
	}
	
	
}
