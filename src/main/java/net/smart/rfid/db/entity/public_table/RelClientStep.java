package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "rel_client_step" database table.
 * 
 */
@Entity
@Table(name="\"rel_client_step\"")
@NamedQuery(name="RelClientStep.findAll", query="SELECT r FROM RelClientStep r")
public class RelClientStep implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RelClientStepPK id;

	public RelClientStep() {
	}

	public RelClientStepPK getId() {
		return this.id;
	}

	public void setId(RelClientStepPK id) {
		this.id = id;
	}

}