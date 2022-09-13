package com.example.projetospring.repositories;

import com.example.projetospring.domain.Categoria;
import com.example.projetospring.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}