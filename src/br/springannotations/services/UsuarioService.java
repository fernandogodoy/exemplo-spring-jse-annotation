package br.springannotations.services;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

	Logger LOGGER = Logger.getLogger("UsuarioService");

	public void testService() {
		LOGGER.info("Executando testController");
	}

}
