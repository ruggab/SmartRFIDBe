package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "flow" database table.
 * 
 */
@Entity
@Table(name="\"flow\"")
@NamedQuery(name="Flow.findAll", query="SELECT f FROM Flow f")
public class Flow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"idflow\"")
	private int idflow;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"id_customer\"")
	private int idCustomer;

	public Flow() {
	}

	public int getIdflow() {
		return this.idflow;
	}

	public void setIdflow(int idflow) {
		this.idflow = idflow;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIdCustomer() {
		return this.idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

}