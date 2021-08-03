package com.fac.cursomc.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import com.fasterxml.jackson.annotation.JsonManagedReference;


// o serializble, serve para dizer a classe categoria que os objetos podem ser convertidos para uma sequencia de bytes
// pra que serve ? para gravar em arquivo, para navegar na rede.



@Entity 
public class Categoria implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id;
	private String nome;
	
	@JsonManagedReference
	@ManyToMany(mappedBy="categorias")
	private List<Produto> produtos = new ArrayList<>();
	
	
	//construtor da classe - Instancia os objs sem jogar valores para os atributos.
	public Categoria() {
		
	}


	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	

	//hascode para comparação entre dois objetos - Padrão do java, colocar somente o id

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(id, other.id);
	}



	

}
