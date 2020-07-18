package aforo255.ms.tes.invoice.model.entity;

import java.io.Serializable;

public class Operation implements Serializable{
	
	private static final long serialVersionUID = -2772158462042804334L;

	
	private String id ;
	private double amount ;
	private int idinvoce;
	private String date;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

   

	public int getIdinvoce() {
		return idinvoce;
	}
	public void setIdinvoce(int idinvoce) {
		this.idinvoce = idinvoce;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	

}
