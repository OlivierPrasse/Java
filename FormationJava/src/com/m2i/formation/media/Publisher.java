package com.m2i.formation.media;

public class Publisher {

	private String name;
	private String siret;
	private int id;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// Icic pour le debugage, eclipse lit cette methode même si elle n'est pas déclarrée  
	public String toString() {
		return "valeur de name: " + name + "valeur de siret:" + siret;
	}
	
}
