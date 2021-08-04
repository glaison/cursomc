package com.fac.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fac.cursomc.domain.Categoria;
import com.fac.cursomc.domain.Cidade;
import com.fac.cursomc.domain.Cliente;
import com.fac.cursomc.domain.Endereco;
import com.fac.cursomc.domain.Estado;
import com.fac.cursomc.domain.Produto;
import com.fac.cursomc.domain.enuns.TipoCliente;
import com.fac.cursomc.repositories.CategoriaRepository;
import com.fac.cursomc.repositories.CidadeRepository;
import com.fac.cursomc.repositories.ClienteRepository;
import com.fac.cursomc.repositories.EnderecoRepository;
import com.fac.cursomc.repositories.EstadoRepository;
import com.fac.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriarepository; 
	

	@Autowired
	private ProdutoRepository produtorepository; 
	
	@Autowired
	private EstadoRepository estadorepository; 
	
	@Autowired
	private CidadeRepository cidaderepository; 
	
	
	@Autowired
	private ClienteRepository clienterepository; 
	
	
	@Autowired
	private EnderecoRepository enderecorepository; 
	
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Categoria cat1 = new Categoria(null,"Informática");
		Categoria cat2 = new Categoria(null,"Escritório");
		Categoria cat3 = new Categoria(null,"Testes");

		
		Produto p1 = new Produto(null,"Computador",2000.00);
		Produto p2 = new Produto(null,"Impressora",800.00);
		Produto p3 = new Produto(null,"Mouse",80.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriarepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		produtorepository.saveAll(Arrays.asList(p1,p2,p3));
		
		
		
		Estado est1 = new Estado(null, "Minas Gerais", null);
		Estado est2 = new Estado(null, "São Paulo",null);
		
		Cidade c1 = new Cidade(null, "Uberlandia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		Cidade c3 = new Cidade(null,"Campinas", est2);
		
		
		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2,c3));
		
		estadorepository.saveAll(Arrays.asList(est1,est2));
		cidaderepository.saveAll(Arrays.asList(c1,c2,c3));
		
		
		
		//instanciar cliente e endereço (popular base)
		
		Cliente cli1 =  new Cliente(null, "Maria Silva","maria@gmail.com","22116709890", TipoCliente.PESSOAFISICA);
		
		cli1.getTelefones().addAll(Arrays.asList("37556642","37500000"));
		
		
		Endereco e1 = new Endereco(null,"Rua Flores","300","Apto 303","Jardins","38220834", cli1, c1);
		Endereco e2 =  new Endereco(null,"Avenida Matos","105","Sala 800","Centro","38777012", cli1, c2);
		
		cli1.getEnderecos().addAll(Arrays.asList(e1,e2));
		
		
		clienterepository.saveAll(Arrays.asList(cli1));
		enderecorepository.saveAll(Arrays.asList(e1,e2));
		
		
	}
	
	

}