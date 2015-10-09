package com.m2i.formation.media;
import java.util.Date;

public class Book extends Media {
	
	private int nbPage;
	private String isbn;
	
	private BookCategory bookCategory;
	
	public BookCategory getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(BookCategory bookCategory) {
		this.bookCategory = bookCategory;
	}
	
	public int getNbPage() {
		return nbPage;
	}
	public void setNbPage(int nbPage) {
		this.nbPage = nbPage;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	@Override 
	public double getVATPrice() {
		return getPrice() * 1.05;
	}
	
}
