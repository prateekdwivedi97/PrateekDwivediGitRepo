package com.capg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="data")
@NamedQuery(name="getbook",query="select count(auth) from Author auth  where auth.id>103")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Author {
	
	@Id
	@Column(name="authorid")
	private int authorid;
	@Column(name="authorname")
	private String authorname;
	@Override
	public String toString() {
		return "Author [authorid=" + authorid + ", authorname=" + authorname + "]";
	}
	public Author() {
		
	}
	public Author(int authorid, String authorname) {
		super();
		this.authorid = authorid;
		this.authorname = authorname;
	}
	public int getAuthorid() {
		return authorid;
	}
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	
	

}
