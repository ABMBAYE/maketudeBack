package com.maketude.service;

import java.util.List;
import java.util.Optional;

import com.maketude.entity.Client;

public interface ClientService {
	
	Client saveClient(Client client);
	List<Client> getAllClients();
	Optional<Client> getClient(Long idClient);
	void deleteClientById(Long idClient);
	Client updateClient(Client client);
	
	List<Client> findByNomClientContains(String nom);
}
