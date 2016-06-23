package br.edu.ifma.es.transportadora.repository;

import javax.enterprise.context.RequestScoped;

import br.edu.ifma.es.transportadora.model.Cliente;

@RequestScoped
public interface Clientes extends Repository<Cliente> {

}
