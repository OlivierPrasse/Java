package com.m2i.formation.media;

import java.util.Date;

public interface IMedia {

	Date getDate();

	void setDate(Date date);

	String getLang();

	void setLang(String lang);

	Publisher getPublisher();

	void setPublisher(Publisher publisher);

	void addAuthor(Author a);

	double getVATPrice();

}