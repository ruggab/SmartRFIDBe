package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "customer_doctype" database table.
 * 
 */
@Entity
@Table(name="\"customer_doctype\"")
@NamedQuery(name="CustomerDoctype.findAll", query="SELECT c FROM CustomerDoctype c")
public class CustomerDoctype implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CustomerDoctypePK id;

	@Column(name="\"description\"")
	private String description;

	public CustomerDoctype() {
	}

	public CustomerDoctypePK getId() {
		return this.id;
	}

	public void setId(CustomerDoctypePK id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}