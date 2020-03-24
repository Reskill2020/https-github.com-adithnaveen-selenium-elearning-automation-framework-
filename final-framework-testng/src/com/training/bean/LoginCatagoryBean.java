package com.training.bean;

public class LoginCatagoryBean {
	private String catg;
	

	public LoginCatagoryBean() {
	}

	public LoginCatagoryBean(String catg) {
		super();
		this.catg = catg;
		
	}

	public String getcatagoryName() {
		return catg;
	}

	public void setcatagoryName(String catg1) {
		this.catg = catg1;
	}

	
	@Override
	public String toString() {
		return "LoginCatagoryBean [Catagory=" + catg + "]";
	}

}
