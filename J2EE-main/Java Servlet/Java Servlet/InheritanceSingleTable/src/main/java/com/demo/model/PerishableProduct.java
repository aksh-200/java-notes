package com.demo.model;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("Perishable")
public class PerishableProduct extends Product  {

	private Date expirydate;

	public PerishableProduct() {
		super();
	}



	


	public PerishableProduct(int pid, String pname, Date mfgdate, Date expirydate) {
		super(pid, pname, mfgdate);
		this.expirydate = expirydate;
	}











	public Date getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(Date expirydate) {
		this.expirydate = expirydate;
	}

	@Override
	public String toString() {
		return "PerishableProduct [expirydate=" + expirydate + "]";
	}

	
}
