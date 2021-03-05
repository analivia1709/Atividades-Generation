package com.Generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Generation.farmacia.model.Produto;


public interface ProdutoRepository  extends JpaRepository<Produto,Long>{
	public List<Produto> findAllByNomeProdutoContainingIgnoreCase(String nomeProduto);//<pedindo um argumento


}