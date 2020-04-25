package com.capg.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="author")
public class Author {
	@Id
	private int authorId;
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String fName;
	private String mName;
	private String lName;
	private long phoneNo;
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", fName=" + fName + ", mName=" + mName
				+ ", lName=" + lName + ", phoneNo=" + phoneNo + "]";
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getFName() {
		return fName;
	}
	public void setFName(String fName) {
		this.fName = fName;
	}
	public String getMName() {
		return mName;
	}
	public void setMName(String mName) {
		this.mName = mName;
	}
	public String getLName() {
		return lName;
	}
	public void setLName(String lName) {
		this.lName = lName;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Author(int authorId, String fName, String mName, String lName, long phoneNo) {
		super();
		this.authorId = authorId;
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.phoneNo = phoneNo;
	}
	
	

}
