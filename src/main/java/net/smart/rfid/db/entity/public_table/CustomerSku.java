package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "customer_sku" database table.
 * 
 */
@Entity
@Table(name="\"customer_sku\"")
@NamedQuery(name="CustomerSku.findAll", query="SELECT c FROM CustomerSku c")
public class CustomerSku implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"id_customer\"")
	private int idCustomer;

	@Column(name="\"principal\"")
	private String principal;

	@Column(name="\"sku\"")
	private String sku;

	public CustomerSku() {
	}

	public int getIdCustomer() {
		return this.idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getPrincipal() {
		return this.principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

}