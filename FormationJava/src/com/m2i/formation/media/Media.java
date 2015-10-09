package com.m2i.formation.media;

import java.util.Date;

public abstract class Media extends Item implements IMedia {

	private Date date;
	private String lang;

	private Author[] authors = new Author[10];
	private int nbAuthor = 0;
	
	private Publisher publisher;
	
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IMedia#getDate()
	 */
	@Override
	public Date getDate() {
		return date;
	}
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IMedia#setDate(java.util.Date)
	 */
	@Override
	public void setDate(Date date) {
		this.date = date;
	}

	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IMedia#getLang()
	 */
	@Override
	public String getLang() {
		return lang;
	}
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IMedia#setLang(java.lang.String)
	 */
	@Override
	public void setLang(String lang) {
		this.lang = lang;
	}
	
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IMedia#getPublisher()
	 */
	@Override
	public Publisher getPublisher() {
		return publisher;
	}
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IMedia#setPublisher(com.m2i.formation.media.Publisher)
	 */
	@Override
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IMedia#addAuthor(com.m2i.formation.media.Author)
	 */
	@Override
	public void addAuthor(Author a) {
		if(nbAuthor > 10){
			throw new MediaException("Too many authors"); 
			}
		authors[nbAuthor++] = a;
	}
	
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IMedia#getVATPrice()
	 */
	@Override
	public abstract  double getVATPrice();
}
