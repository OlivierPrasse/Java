package com.m2i.formation.media;

public class Dvd extends Media {
	
	private String region;
	
	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}

	@Override 
	public double getVATPrice() {
		return getPrice() * 1.20;
	}

}
