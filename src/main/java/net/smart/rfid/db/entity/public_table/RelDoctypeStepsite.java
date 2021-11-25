package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "rel_doctype_stepsite" database table.
 * 
 */
@Entity
@Table(name="\"rel_doctype_stepsite\"")
@NamedQuery(name="RelDoctypeStepsite.findAll", query="SELECT r FROM RelDoctypeStepsite r")
public class RelDoctypeStepsite implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RelDoctypeStepsitePK id;

	public RelDoctypeStepsite() {
	}

	public RelDoctypeStepsitePK getId() {
		return this.id;
	}

	public void setId(RelDoctypeStepsitePK id) {
		this.id = id;
	}

}