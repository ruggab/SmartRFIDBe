package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "pref_user_period" database table.
 * 
 */
@Embeddable
public class PrefUserPeriodPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"idusr\"")
	private String idusr;

	@Column(name="\"dtda\"")
	private String dtda;

	@Column(name="\"dtal\"")
	private String dtal;

	public PrefUserPeriodPK() {
	}
	public String getIdusr() {
		return this.idusr;
	}
	public void setIdusr(String idusr) {
		this.idusr = idusr;
	}
	public String getDtda() {
		return this.dtda;
	}
	public void setDtda(String dtda) {
		this.dtda = dtda;
	}
	public String getDtal() {
		return this.dtal;
	}
	public void setDtal(String dtal) {
		this.dtal = dtal;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PrefUserPeriodPK)) {
			return false;
		}
		PrefUserPeriodPK castOther = (PrefUserPeriodPK)other;
		return 
			this.idusr.equals(castOther.idusr)
			&& this.dtda.equals(castOther.dtda)
			&& this.dtal.equals(castOther.dtal);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idusr.hashCode();
		hash = hash * prime + this.dtda.hashCode();
		hash = hash * prime + this.dtal.hashCode();
		
		return hash;
	}
}