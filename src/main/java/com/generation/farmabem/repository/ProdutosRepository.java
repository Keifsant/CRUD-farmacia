package com.generation.farmabem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.farmabem.model.Produtos;

public interface ProdutosRepository extends JpaRepository <Produtos, Long> {
	List<Produtos> findAllByNomeContainingIgnoreCase(String nome);
}
