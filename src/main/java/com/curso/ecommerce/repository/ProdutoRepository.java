package com.curso.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.ecommerce.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
