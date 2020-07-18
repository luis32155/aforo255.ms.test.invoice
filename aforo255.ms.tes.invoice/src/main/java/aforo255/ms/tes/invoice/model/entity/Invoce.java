package aforo255.ms.tes.invoice.model.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "invoce")
public class Invoce implements Serializable{
	private static final long serialVersionUID = -3148355961715649429L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_invoice;
	@Column(name="amount")
	private double TotalAmount;
	@Column(name="id_customer")
	private Integer IdCustomer;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_customer",insertable = false,updatable=false)
	@Fetch(FetchMode.JOIN)
	private Customer customer;
	
	
	
	public Integer getId_invoice() {
		return id_invoice;
	}
	public void setId_invoice(Integer id_invoice) {
		this.id_invoice = id_invoice;
	}
	public double getTotalAmount() {
		return TotalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		TotalAmount = totalAmount;
	}
	public Integer getIdCustomer() {
		return IdCustomer;
	}
	public void setIdCustomer(Integer idCustomer) {
		IdCustomer = idCustomer;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
