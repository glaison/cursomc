package com.fac.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fac.cursomc.domain.Categoria;
import com.fac.cursomc.repositories.CategoriaRepository;
import com.fac.cursomc.services.exceptions.ObjectNotFoundException;



@Service
public class CategoriaService { // igual ao controlles chama os serviços do repository(dao)
	
	@Autowired
	private CategoriaRepository repo;
		
	public Categoria find(Integer id) throws ObjectNotFoundException {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
}
