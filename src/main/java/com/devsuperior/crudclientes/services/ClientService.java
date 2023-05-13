package com.devsuperior.crudclientes.services;

import com.devsuperior.crudclientes.dto.ClientDTO;
import com.devsuperior.crudclientes.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id){
        return new ClientDTO(clientRepository.findById(id).get());
    }

}
