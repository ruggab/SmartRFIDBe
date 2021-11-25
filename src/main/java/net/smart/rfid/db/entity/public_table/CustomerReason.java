package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "customer_reason" database table.
 * 
 */
@Entity
@Table(name="\"customer_reason\"")
@NamedQuery(name="CustomerReason.findAll", query="SELECT c FROM CustomerReason c")
public class CustomerReason implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CustomerReasonPK id;

	@Column(name="\"description\"")
	private String description;

	public CustomerReason() {
	}

	public CustomerReasonPK getId() {
		return this.id;
	}

	public void setId(CustomerReasonPK id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}