package com.curso.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.ecommerce.model.Produto;
import com.curso.ecommerce.repository.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	@Override
	public Produto salvar(Produto produto) {
		// TODO Auto-generated method stub
		return produtoRepository.save(produto) ;
	}

	@Override
	public Optional<Produto> obter(Long id) {
		// TODO Auto-generated method stub
		return produtoRepository.findById(id);
	}

	@Override
	public void atualizar(Produto produto) {
		// TODO Auto-generated method stub
		produtoRepository.save(produto) ;
	}

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub
		 produtoRepository.deleteById(id) ;
		
	}

}
