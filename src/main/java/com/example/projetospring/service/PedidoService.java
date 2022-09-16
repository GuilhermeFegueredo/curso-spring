package com.example.projetospring.service;

import com.example.projetospring.domain.Pedido;
import com.example.projetospring.repositories.PedidoRepository;
import com.example.projetospring.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido find(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id
                        + ", Tipo: " + Pedido.class.getName())
        );
    }



}