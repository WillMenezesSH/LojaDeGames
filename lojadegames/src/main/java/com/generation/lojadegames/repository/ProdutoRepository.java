package com.generation.lojadegames.repository;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import com.generation.lojadegames.model.Produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
    public List <Produto> findAllByPreco (BigDecimal preco);
    public List <Produto> findAllByAno (BigInteger ano);
}
