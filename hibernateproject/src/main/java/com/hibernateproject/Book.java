package com.hibernateproject;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries( 
		{ 
			@NamedQuery(name="findBookById", query = "from Book b where b.bId=:bId"),
			@NamedQuery(name="findBookByName", query = "from Book b where b.bName=:bName"),
			@NamedQuery(name = "getBookCount",query = "select count(1) from Book")
		}
		)
@Entity
public class Book implements Serializable {
	@Id
	@GeneratedValue
	private int bId;
	//@Column(name="Book_Nm" , nullable = false,length = 20)
	private String bName;
	private int bPrice;
	
	public Book()
	{
		
	}
	public Book(String bName, int bPrice) {
		super();
		this.bName = bName;
		this.bPrice = bPrice;
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public int getbPrice() {
		return bPrice;
	}
	public void setbPrice(int bPrice) {
		this.bPrice = bPrice;
	}
	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bName=" + bName + ", bPrice=" + bPrice + "]";
	}
	

}
