package br.edu.ifma.es.transportadora.dao;

import javax.ejb.Stateless;

import br.edu.ifma.es.transportadora.model.Frete;
import br.edu.ifma.es.transportadora.repository.Fretes;

@Stateless
public class FreteDao extends DaoGenerico<Frete> implements Fretes {
	
	public FreteDao() {
		
	}
}
