package br.edu.ifma.es.transportadora.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.edu.ifma.es.transportadora.repository.Clientes;

@Controller
public class ClienteController {
	
	private Result result;
	private Clientes clientes;
	
	public ClienteController() {
		
	}
	
	@Inject
	public ClienteController(Result result, Clientes clientes) {
		this.result = result;
		this.clientes = clientes;
	}
	
	@Get("/clientes")
	public void index() {
		result.use(Results.json()).withoutRoot().from(clientes.findAll()).serialize();
	}
}
