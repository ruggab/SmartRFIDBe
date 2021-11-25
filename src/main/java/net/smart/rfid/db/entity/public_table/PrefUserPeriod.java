package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pref_user_period" database table.
 * 
 */
@Entity
@Table(name="\"pref_user_period\"")
@NamedQuery(name="PrefUserPeriod.findAll", query="SELECT p FROM PrefUserPeriod p")
public class PrefUserPeriod implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PrefUserPeriodPK id;

	@Column(name="\"special\"")
	private String special;

	@Column(name="\"tipo\"")
	private String tipo;

	public PrefUserPeriod() {
	}

	public PrefUserPeriodPK getId() {
		return this.id;
	}

	public void setId(PrefUserPeriodPK id) {
		this.id = id;
	}

	public String getSpecial() {
		return this.special;
	}

	public void setSpecial(String special) {
		this.special = special;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}