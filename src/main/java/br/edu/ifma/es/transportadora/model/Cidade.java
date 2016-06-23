package br.edu.ifma.es.transportadora.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;

public class Cidade {
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="cidade")
	private Set<Frete> fretes = new HashSet<Frete>();
}
