package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "rel_filter_step" database table.
 * 
 */
@Embeddable
public class RelFilterStepPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"idfilter\"")
	private int idfilter;

	@Column(name="\"idstep\"")
	private int idstep;

	public RelFilterStepPK() {
	}
	public int getIdfilter() {
		return this.idfilter;
	}
	public void setIdfilter(int idfilter) {
		this.idfilter = idfilter;
	}
	public int getIdstep() {
		return this.idstep;
	}
	public void setIdstep(int idstep) {
		this.idstep = idstep;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RelFilterStepPK)) {
			return false;
		}
		RelFilterStepPK castOther = (RelFilterStepPK)other;
		return 
			(this.idfilter == castOther.idfilter)
			&& (this.idstep == castOther.idstep);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idfilter;
		hash = hash * prime + this.idstep;
		
		return hash;
	}
}