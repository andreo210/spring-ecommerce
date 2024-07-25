package com.curso.ecommerce.service;

import java.util.Optional;

import com.curso.ecommerce.model.Produto;

public interface ProdutoService {
	public Produto salvar(Produto produto);
	public Optional<Produto> obter(Long id);
	public void atualizar(Produto produto);
	public void deletar(Long id);
}
