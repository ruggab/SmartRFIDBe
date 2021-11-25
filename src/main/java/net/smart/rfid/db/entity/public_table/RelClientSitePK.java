package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "rel_client_site" database table.
 * 
 */
@Embeddable
public class RelClientSitePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"idclient\"")
	private int idclient;

	@Column(name="\"idsite\"")
	private int idsite;

	public RelClientSitePK() {
	}
	public int getIdclient() {
		return this.idclient;
	}
	public void setIdclient(int idclient) {
		this.idclient = idclient;
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
		if (!(other instanceof RelClientSitePK)) {
			return false;
		}
		RelClientSitePK castOther = (RelClientSitePK)other;
		return 
			(this.idclient == castOther.idclient)
			&& (this.idsite == castOther.idsite);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idclient;
		hash = hash * prime + this.idsite;
		
		return hash;
	}
}