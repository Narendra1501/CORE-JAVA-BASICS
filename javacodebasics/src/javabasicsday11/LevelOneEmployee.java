package javabasicsday11;

import java.util.Date;

public class LevelOneEmployee {
	
	private int noOfshares;
	private String authority;
	
	//public LevelOneEmployee(String string, String string2, String string3, String string4, int i, int j, String string5) {}
	
	public LevelOneEmployee(String name,String string, Date dateofbirth,String deptName,double basesalary,int noOfshares,String authority) {
    	super();
    	this.noOfshares = noOfshares;
    	this.authority = authority;
	}

	public int getNoOfshares() {
		return noOfshares;
	}

	public void setNoOfshares(int noOfshares) {
		this.noOfshares = noOfshares;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "LevelOneEmployee [noOfshares=" + noOfshares + ", authority=" + authority + "]";
	}
	
	
	
	

}
