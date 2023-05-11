package com.maketude.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maketude.entity.Client;
import com.maketude.service.ClientService;

@RestController
@RequestMapping("/maketude")
@CrossOrigin
public class ClientRestController {
	@Autowired
	ClientService clientService;
	
	@RequestMapping(value="/{idClient}",method = RequestMethod.GET)
	public Optional<Client> getClientById(@PathVariable("idClient") Long idClient) { 
		return clientService.getClient(idClient);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Client> getAllClients() {
		return clientService.getAllClients();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Client createProduit(@RequestBody Client client) {
		return clientService.saveClient(client);
	}
	
	@RequestMapping(value="/{idClient}",method = RequestMethod.DELETE)
	public void deleteProduit(@PathVariable("idClient") Long idClient){
		clientService.deleteClientById(idClient);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Client updateClient(@RequestBody Client client) {
		return clientService.updateClient(client);
	}
	@RequestMapping(value="/clientByName/{nom}",method = RequestMethod.GET)
	public List<Client> findByNomClientContains(@PathVariable("nom") String nom) {
		return clientService.findByNomClientContains(nom);
	}

}
