package br.edu.unievangelica.ftt.seintegra.core.service;

import java.util.List;

public  interface IService <T> {
	List<T> findALL();
	T findById(long id);
	T save (T object);
	void deleteById(long id);

}
