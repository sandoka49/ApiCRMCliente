package com.sandoval.crm.controller;

import com.sandoval.crm.model.Cliente;
import com.sandoval.crm.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> list(){
          return clienteRepository.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
     public Cliente adicionar(@RequestBody  Cliente cliente){
        return clienteRepository.save(cliente);
     }

}
