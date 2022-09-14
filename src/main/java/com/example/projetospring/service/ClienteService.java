package com.example.projetospring.service;

import com.example.projetospring.domain.Cliente;
import com.example.projetospring.repositories.ClienteRepository;
import com.example.projetospring.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente find(Integer id) {
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id
                        + ", Tipo: " + Cliente.class.getName())
        );
    }


}