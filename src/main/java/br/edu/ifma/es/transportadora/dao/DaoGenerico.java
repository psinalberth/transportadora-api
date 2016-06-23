package br.edu.ifma.es.transportadora.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

public abstract class DaoGenerico<T> {
	
	@PersistenceContext
	private EntityManager manager;
	private T clazz;
	
	public DaoGenerico() {
		
	}
	
	public DaoGenerico(T clazz) {
		this.clazz = clazz;
	}
	
	public void save(T clazz) {
		manager.persist(clazz);
	}
	
	@SuppressWarnings("unchecked")
	public T findById(int id) {
		return manager.find((Class<T>) clazz, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		
		CriteriaQuery<Object> criteria = manager.getCriteriaBuilder().createQuery();
		criteria.select(criteria.from((Class<T>) clazz));
		
		return (List<T>) manager.createQuery(criteria).getResultList();
	}
	
	public void merge(T clazz) {
		manager.merge(clazz);
	}
	
	public void remove(T clazz) {
		manager.remove(clazz);
	}
}
