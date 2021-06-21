package com.api.vacina.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.api.vacina.entities.Usuario;
import com.api.vacina.repositories.UsuarioRepository;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.GET)
	public String form() {
		return "usuario/cadastro";
	}
	
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public String form(Usuario usuario) {
		usuarioRepository.save(usuario);
		return "redirect:/cadastrar";
	}
	
	
	@RequestMapping(value = "/lista", method = RequestMethod.GET)
	public ModelAndView listar(){
		ModelAndView mv = new ModelAndView("/index");
		Iterable<Usuario> usuarios = usuarioRepository.findAll();
		mv.addObject("usuario", usuarios);
		return mv;
	}
	
	
}
