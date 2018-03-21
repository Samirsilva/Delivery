package com.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.delivery.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	
}
