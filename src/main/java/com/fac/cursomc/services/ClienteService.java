package com.fac.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fac.cursomc.domain.Cliente;
import com.fac.cursomc.repositories.ClienteRepository;
import com.fac.cursomc.services.exceptions.ObjectNotFoundException;



@Service
public class ClienteService { // igual ao controlles chama os serviços do repository(dao)
	
	@Autowired
	private ClienteRepository repo;
		
	public Cliente buscar(Integer id) throws ObjectNotFoundException {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
	
	
	public Cliente buscarTodos() throws ObjectNotFoundException {
		Optional<Cliente> obj = Optional.empty(); 
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado!  Tipo: " + Cliente.class.getName()));
	}
}
