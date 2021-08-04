package com.fac.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fac.cursomc.domain.Pedido;


@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> { //igual ao DAO (Conversar com o banco de dados)
	
	
	
	

}
