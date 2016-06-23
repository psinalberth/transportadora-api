package br.edu.ifma.es.transportadora.repository;

import java.util.List;

public interface Repository<T> {
	
	public void save(T clazz);
	
	public T findById(int id);
	
	public List<T> findAll();
	
	public void merge(T clazz);
	
	public void remove(T clazz);
}
