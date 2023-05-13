package com.devsuperior.crudclientes.repositories;

import com.devsuperior.crudclientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
