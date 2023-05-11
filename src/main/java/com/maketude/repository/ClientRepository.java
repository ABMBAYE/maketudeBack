package com.maketude.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maketude.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

	//List<Client> findByNomClientContains(String nom);
}
