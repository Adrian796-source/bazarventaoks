
package com.todocode.bazarventa.repository;

import com.todocode.bazarventa.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Long> {

    Optional<Cliente> findByCodigoCliente(Long codigoCliente);
}

