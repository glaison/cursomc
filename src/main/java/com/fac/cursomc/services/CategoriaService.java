package com.fac.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fac.cursomc.domain.Categoria;
import com.fac.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService { // igual ao controlles chama os serviços do repository(dao)
	
	@Autowired
	private CategoriaRepository repo;
	
	/*public Categoria buscar(Integer id) {
		Categoria obj.repo.findOne(id); // vai no banco de dados e busca uma categoria com o id passado		
	}*/
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		}
	

}
