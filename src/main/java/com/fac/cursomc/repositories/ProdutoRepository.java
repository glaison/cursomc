package com.fac.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fac.cursomc.domain.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> { //igual ao DAO (Conversar com o banco de dados)
	
	
}
