package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "rel_doctype_customer_reason" database table.
 * 
 */
@Embeddable
public class RelDoctypeCustomerReasonPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"id_doctype\"")
	private int idDoctype;

	@Column(name="\"id_customer_reason\"")
	private String idCustomerReason;

	public RelDoctypeCustomerReasonPK() {
	}
	public int getIdDoctype() {
		return this.idDoctype;
	}
	public void setIdDoctype(int idDoctype) {
		this.idDoctype = idDoctype;
	}
	public String getIdCustomerReason() {
		return this.idCustomerReason;
	}
	public void setIdCustomerReason(String idCustomerReason) {
		this.idCustomerReason = idCustomerReason;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RelDoctypeCustomerReasonPK)) {
			return false;
		}
		RelDoctypeCustomerReasonPK castOther = (RelDoctypeCustomerReasonPK)other;
		return 
			(this.idDoctype == castOther.idDoctype)
			&& this.idCustomerReason.equals(castOther.idCustomerReason);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idDoctype;
		hash = hash * prime + this.idCustomerReason.hashCode();
		
		return hash;
	}
}