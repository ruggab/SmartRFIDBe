package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "rel_doctype_stepsite" database table.
 * 
 */
@Embeddable
public class RelDoctypeStepsitePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"doctype\"")
	private String doctype;

	@Column(name="\"idstep\"")
	private int idstep;

	@Column(name="\"idsite\"")
	private int idsite;

	public RelDoctypeStepsitePK() {
	}
	public String getDoctype() {
		return this.doctype;
	}
	public void setDoctype(String doctype) {
		this.doctype = doctype;
	}
	public int getIdstep() {
		return this.idstep;
	}
	public void setIdstep(int idstep) {
		this.idstep = idstep;
	}
	public int getIdsite() {
		return this.idsite;
	}
	public void setIdsite(int idsite) {
		this.idsite = idsite;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RelDoctypeStepsitePK)) {
			return false;
		}
		RelDoctypeStepsitePK castOther = (RelDoctypeStepsitePK)other;
		return 
			this.doctype.equals(castOther.doctype)
			&& (this.idstep == castOther.idstep)
			&& (this.idsite == castOther.idsite);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.doctype.hashCode();
		hash = hash * prime + this.idstep;
		hash = hash * prime + this.idsite;
		
		return hash;
	}
}