package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "pref_user_step" database table.
 * 
 */
@Embeddable
public class PrefUserStepPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"idusr\"")
	private String idusr;

	@Column(name="\"step\"")
	private String step;

	@Column(name="\"idcus\"")
	private int idcus;

	public PrefUserStepPK() {
	}
	public String getIdusr() {
		return this.idusr;
	}
	public void setIdusr(String idusr) {
		this.idusr = idusr;
	}
	public String getStep() {
		return this.step;
	}
	public void setStep(String step) {
		this.step = step;
	}
	public int getIdcus() {
		return this.idcus;
	}
	public void setIdcus(int idcus) {
		this.idcus = idcus;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PrefUserStepPK)) {
			return false;
		}
		PrefUserStepPK castOther = (PrefUserStepPK)other;
		return 
			this.idusr.equals(castOther.idusr)
			&& this.step.equals(castOther.step)
			&& (this.idcus == castOther.idcus);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idusr.hashCode();
		hash = hash * prime + this.step.hashCode();
		hash = hash * prime + this.idcus;
		
		return hash;
	}
}