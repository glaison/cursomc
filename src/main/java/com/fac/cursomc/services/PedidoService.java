package com.fac.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fac.cursomc.domain.Pedido;
import com.fac.cursomc.repositories.PedidoRepository;
import com.fac.cursomc.services.exceptions.ObjectNotFoundException;



@Service
public class PedidoService { // igual ao controlles chama os serviços do repository(dao)
	
	@Autowired
	private PedidoRepository repo;
		
	public Pedido find(Integer id) throws ObjectNotFoundException {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
	
}
