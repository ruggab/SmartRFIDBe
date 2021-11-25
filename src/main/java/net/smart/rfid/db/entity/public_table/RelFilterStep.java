package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "rel_filter_step" database table.
 * 
 */
@Entity
@Table(name="\"rel_filter_step\"")
@NamedQuery(name="RelFilterStep.findAll", query="SELECT r FROM RelFilterStep r")
public class RelFilterStep implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RelFilterStepPK id;

	public RelFilterStep() {
	}

	public RelFilterStepPK getId() {
		return this.id;
	}

	public void setId(RelFilterStepPK id) {
		this.id = id;
	}

}