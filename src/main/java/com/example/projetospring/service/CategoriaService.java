package com.example.projetospring.service;

import com.example.projetospring.domain.Categoria;
import com.example.projetospring.repositories.CategoriaRepository;
import com.example.projetospring.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id
                        + ", Tipo: " + Categoria.class.getName())
        );
    }


}