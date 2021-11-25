package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "rel_doctype_reason" database table.
 * 
 */
@Embeddable
public class RelDoctypeReasonPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"id_doctype\"")
	private int idDoctype;

	@Column(name="\"id_reason\"")
	private int idReason;

	public RelDoctypeReasonPK() {
	}
	public int getIdDoctype() {
		return this.idDoctype;
	}
	public void setIdDoctype(int idDoctype) {
		this.idDoctype = idDoctype;
	}
	public int getIdReason() {
		return this.idReason;
	}
	public void setIdReason(int idReason) {
		this.idReason = idReason;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RelDoctypeReasonPK)) {
			return false;
		}
		RelDoctypeReasonPK castOther = (RelDoctypeReasonPK)other;
		return 
			(this.idDoctype == castOther.idDoctype)
			&& (this.idReason == castOther.idReason);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idDoctype;
		hash = hash * prime + this.idReason;
		
		return hash;
	}
}