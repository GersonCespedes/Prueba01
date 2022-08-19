package com.cespedes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cespedes.modelo.Cliente;

public interface IClienteRepositorio extends JpaRepository<Cliente,Integer>{

}
