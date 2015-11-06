package br.springannotations.context;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = "br.springannotations.*")
public class Context {

}
