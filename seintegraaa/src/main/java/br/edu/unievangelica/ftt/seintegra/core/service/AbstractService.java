package br.edu.unievangelica.ftt.seintegra.core.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.validation.Errors;

import br.edu.unievangelica.ftt.seintegra.core.exception.BadRequestException;
import br.edu.unievangelica.ftt.seintegra.core.exception.NotFoundException;

public abstract class AbstractService<T> implements IService<T>{
	@Autowired
	private JpaRepository<T, Long> repository;
	
	
	@Override
	public List<T> findAll(){
		return repository.findAll();
	}
	@Override
	 public T findById(long id) {
		
		Optional<T> object = repository.findById(id);
		if(object.isPresent()) {
			return object.get();
		}
		throw new NotFoundException();
		
		// return repository.findById(id).get();
	 }
	@Override
	 public T save(T object, Errors errors) {
		if(errors.hasErrors()) {
			throw new BadRequestException(errors);
		}
		return repository.save(object);
		
	 }
	
	@Override
	 public void deleteById(long id) {
		 repository.deleteById(id);
	 }
}
