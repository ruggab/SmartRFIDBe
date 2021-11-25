package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "grouped_step" database table.
 * 
 */
@Entity
@Table(name="\"grouped_step\"")
@NamedQuery(name="GroupedStep.findAll", query="SELECT g FROM GroupedStep g")
public class GroupedStep implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private GroupedStepPK id;

	public GroupedStep() {
	}

	public GroupedStepPK getId() {
		return this.id;
	}

	public void setId(GroupedStepPK id) {
		this.id = id;
	}

}