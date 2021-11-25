package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "rel_doctype_customer_reason" database table.
 * 
 */
@Entity
@Table(name="\"rel_doctype_customer_reason\"")
@NamedQuery(name="RelDoctypeCustomerReason.findAll", query="SELECT r FROM RelDoctypeCustomerReason r")
public class RelDoctypeCustomerReason implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RelDoctypeCustomerReasonPK id;

	public RelDoctypeCustomerReason() {
	}

	public RelDoctypeCustomerReasonPK getId() {
		return this.id;
	}

	public void setId(RelDoctypeCustomerReasonPK id) {
		this.id = id;
	}

}