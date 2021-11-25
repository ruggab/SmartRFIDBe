package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "customer_doctype" database table.
 * 
 */
@Embeddable
public class CustomerDoctypePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"id_customer\"")
	private int idCustomer;

	@Column(name="\"id_doctype\"")
	private String idDoctype;

	public CustomerDoctypePK() {
	}
	public int getIdCustomer() {
		return this.idCustomer;
	}
	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}
	public String getIdDoctype() {
		return this.idDoctype;
	}
	public void setIdDoctype(String idDoctype) {
		this.idDoctype = idDoctype;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CustomerDoctypePK)) {
			return false;
		}
		CustomerDoctypePK castOther = (CustomerDoctypePK)other;
		return 
			(this.idCustomer == castOther.idCustomer)
			&& this.idDoctype.equals(castOther.idDoctype);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idCustomer;
		hash = hash * prime + this.idDoctype.hashCode();
		
		return hash;
	}
}