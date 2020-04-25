package com.capg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Book extends Author {
	
	@Column(name="isbn")
	private int isbn;
	@Column(name="bktitle")
	private String bktitle;
	@Column(name="bkprice")
	private int bkprice;
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", bktitle=" + bktitle + ", bkprice=" + bkprice + "]";
	}
	public Book(int authorid,String authorname,int isbn, String bktitle, int bkprice) {
		super(authorid,authorname);
		this.isbn = isbn;
		this.bktitle = bktitle;
		this.bkprice = bkprice;
	}
	public Book() {
		
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getBkTitle() {
		return bktitle;
	}
	public void setBkTitle(String bktitle) {
		this.bktitle = bktitle;
	}
	public int getBkPrice() {
		return bkprice;
	}
	public void setBkPrice(int bkprice) {
		this.bkprice = bkprice;
	}
	
	

}
