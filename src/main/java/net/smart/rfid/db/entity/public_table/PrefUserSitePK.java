package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "pref_user_sites" database table.
 * 
 */
@Embeddable
public class PrefUserSitePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"idusr\"")
	private String idusr;

	@Column(name="\"idsite\"")
	private int idsite;

	public PrefUserSitePK() {
	}
	public String getIdusr() {
		return this.idusr;
	}
	public void setIdusr(String idusr) {
		this.idusr = idusr;
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
		if (!(other instanceof PrefUserSitePK)) {
			return false;
		}
		PrefUserSitePK castOther = (PrefUserSitePK)other;
		return 
			this.idusr.equals(castOther.idusr)
			&& (this.idsite == castOther.idsite);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idusr.hashCode();
		hash = hash * prime + this.idsite;
		
		return hash;
	}
}