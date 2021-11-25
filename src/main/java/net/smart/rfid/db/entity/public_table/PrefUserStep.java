package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pref_user_step" database table.
 * 
 */
@Entity
@Table(name="\"pref_user_step\"")
@NamedQuery(name="PrefUserStep.findAll", query="SELECT p FROM PrefUserStep p")
public class PrefUserStep implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PrefUserStepPK id;

	public PrefUserStep() {
	}

	public PrefUserStepPK getId() {
		return this.id;
	}

	public void setId(PrefUserStepPK id) {
		this.id = id;
	}

}