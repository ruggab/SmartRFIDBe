package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "customer_reason" database table.
 * 
 */
@Embeddable
public class CustomerReasonPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"id_customer\"")
	private int idCustomer;

	@Column(name="\"id_reason\"")
	private String idReason;

	public CustomerReasonPK() {
	}
	public int getIdCustomer() {
		return this.idCustomer;
	}
	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}
	public String getIdReason() {
		return this.idReason;
	}
	public void setIdReason(String idReason) {
		this.idReason = idReason;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CustomerReasonPK)) {
			return false;
		}
		CustomerReasonPK castOther = (CustomerReasonPK)other;
		return 
			(this.idCustomer == castOther.idCustomer)
			&& this.idReason.equals(castOther.idReason);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idCustomer;
		hash = hash * prime + this.idReason.hashCode();
		
		return hash;
	}
}