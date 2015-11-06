package br.springannotations.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.springannotations.controller.UsuarioController;

public class StartContext {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Context.class);
		UsuarioController bean = context.getBean(UsuarioController.class);
		bean.testController();
	}
}
