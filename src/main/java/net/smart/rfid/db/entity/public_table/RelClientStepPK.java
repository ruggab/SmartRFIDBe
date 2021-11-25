package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "rel_client_step" database table.
 * 
 */
@Embeddable
public class RelClientStepPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"idclient\"")
	private int idclient;

	@Column(name="\"idstep\"")
	private int idstep;

	public RelClientStepPK() {
	}
	public int getIdclient() {
		return this.idclient;
	}
	public void setIdclient(int idclient) {
		this.idclient = idclient;
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
		if (!(other instanceof RelClientStepPK)) {
			return false;
		}
		RelClientStepPK castOther = (RelClientStepPK)other;
		return 
			(this.idclient == castOther.idclient)
			&& (this.idstep == castOther.idstep);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idclient;
		hash = hash * prime + this.idstep;
		
		return hash;
	}
}