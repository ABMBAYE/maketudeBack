package com.maketude.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long idClient;
	
	@Column(name = "prenom")
	public String prenom;
	
	@Column(name = "nom")
	public String nom;
	
	@Column(name = "identifiant")
	public String identifiant;
	
	@Column(name = "adresseMail")
	public String adresseMail;
	
	@Column(name = "motDePasse")
	public String motDePasse;
	
	@Column(name = "paiement")
	public String paiement;
	
	@Column(name = "entretien")
	public String entretien;
	
	@Column(name = "soumis")
	public String soumis;
	
	@Column(name = "acceptation")
	public String acceptation;
	
	@Column(name = "refus")
	public String refus;

	public Client() {
		super();
	}

	public Client(String prenom, String nom, String identifiant, String adresseMail, String motDePasse,
			String paiement, String entretien, String soumis, String acceptation, String refus) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.identifiant = identifiant;
		this.adresseMail = adresseMail;
		this.motDePasse = motDePasse;
		this.paiement = paiement;
		this.entretien = entretien;
		this.soumis = soumis;
		this.acceptation = acceptation;
		this.refus = refus;
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getPaiement() {
		return paiement;
	}

	public void setPaiement(String paiement) {
		this.paiement = paiement;
	}

	public String getEntretien() {
		return entretien;
	}

	public void setEntretien(String entretien) {
		this.entretien = entretien;
	}

	public String getSoumis() {
		return soumis;
	}

	public void setSoumis(String soumis) {
		this.soumis = soumis;
	}

	public String getAcceptation() {
		return acceptation;
	}

	public void setAcceptation(String acceptation) {
		this.acceptation = acceptation;
	}

	public String getRefus() {
		return refus;
	}

	public void setRefus(String refus) {
		this.refus = refus;
	}
	
	
	
}
