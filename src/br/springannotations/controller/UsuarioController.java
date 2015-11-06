package br.springannotations.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.springannotations.services.UsuarioService;

@Controller
public class UsuarioController {
	
	Logger LOGGER = Logger.getLogger("UsuarioController");

	@Autowired
	private UsuarioService service;
	
	public void testController(){
		LOGGER.info("Executando testController");
		service.testService();
	}
	
}
