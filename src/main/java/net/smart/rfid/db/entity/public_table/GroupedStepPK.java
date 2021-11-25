package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "grouped_step" database table.
 * 
 */
@Embeddable
public class GroupedStepPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"grouped_idstep\"")
	private int groupedIdstep;

	@Column(name="\"idstep\"")
	private int idstep;

	public GroupedStepPK() {
	}
	public int getGroupedIdstep() {
		return this.groupedIdstep;
	}
	public void setGroupedIdstep(int groupedIdstep) {
		this.groupedIdstep = groupedIdstep;
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
		if (!(other instanceof GroupedStepPK)) {
			return false;
		}
		GroupedStepPK castOther = (GroupedStepPK)other;
		return 
			(this.groupedIdstep == castOther.groupedIdstep)
			&& (this.idstep == castOther.idstep);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.groupedIdstep;
		hash = hash * prime + this.idstep;
		
		return hash;
	}
}