package javabasicsday11;

import java.util.Date;

public class Person {
      
	  private String name;
	  private long contactNo;
	  private Date dateofbirth;
	  public Person(String name,long contactNo, Date dateofbirth)
	  {
		  super();
		  this.name = name;
		  this.contactNo = contactNo;
		  this.dateofbirth = getDateofbirth();
	  }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	  
	   
	public void person() {
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", contactNo=" + contactNo + ", dateofbirth=" + dateofbirth + "]";
	}
	
}
	  
	  

