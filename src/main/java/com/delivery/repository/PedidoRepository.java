package com.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.delivery.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
