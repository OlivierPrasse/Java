package com.m2i.formation.media;

public class Cd extends Media{
	
	private int nbTracks;
	
	private CdCategory cdCategory;

	public int getNbTracks() {
		return nbTracks;
	}

	public void setNbTracks(int nbTracks) {
		this.nbTracks = nbTracks;
	}

	public CdCategory getCdCategory() {
		return cdCategory;
	}

	public void setCdCategory(CdCategory cdCategory) {
		this.cdCategory = cdCategory;
	}
	
	@Override 
	public double getVATPrice() {
		return getPrice() * 1.10;
	}
	
}
