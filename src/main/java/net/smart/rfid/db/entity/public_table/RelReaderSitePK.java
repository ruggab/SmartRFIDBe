package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "rel_reader_site" database table.
 * 
 */
@Embeddable
public class RelReaderSitePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"idreader\"")
	private int idreader;

	@Column(name="\"idsite\"")
	private int idsite;

	@Column(name="\"idstep\"")
	private int idstep;

	public RelReaderSitePK() {
	}
	public int getIdreader() {
		return this.idreader;
	}
	public void setIdreader(int idreader) {
		this.idreader = idreader;
	}
	public int getIdsite() {
		return this.idsite;
	}
	public void setIdsite(int idsite) {
		this.idsite = idsite;
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
		if (!(other instanceof RelReaderSitePK)) {
			return false;
		}
		RelReaderSitePK castOther = (RelReaderSitePK)other;
		return 
			(this.idreader == castOther.idreader)
			&& (this.idsite == castOther.idsite)
			&& (this.idstep == castOther.idstep);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idreader;
		hash = hash * prime + this.idsite;
		hash = hash * prime + this.idstep;
		
		return hash;
	}
}