package com.maketude.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maketude.entity.Client;
import com.maketude.repository.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService{
	
	@Autowired
	ClientRepository clientRepository;

	@Override
	public Client saveClient(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public List<Client> getAllClients() {
		return clientRepository.findAll();
	}

	@Override
	public void deleteClientById(Long idClient) {
		clientRepository.deleteById(idClient);
	}

	@Override
	public Client updateClient(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public Optional<Client> getClient(Long idClient) {
		return clientRepository.findById(idClient);
	}

	@Override
	public List<Client> findByNomClientContains(String nom) {
		return ((ClientServiceImpl) clientRepository).findByNomClientContains(nom);
	}
}
