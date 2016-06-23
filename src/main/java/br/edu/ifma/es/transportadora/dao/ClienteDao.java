package br.edu.ifma.es.transportadora.dao;

import javax.ejb.Stateless;

import br.edu.ifma.es.transportadora.model.Cliente;
import br.edu.ifma.es.transportadora.repository.Clientes;

@Stateless
public class ClienteDao extends DaoGenerico<Cliente> implements Clientes {
	
	public ClienteDao() {
		
	}
}
