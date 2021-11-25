package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pref_period_type" database table.
 * 
 */
@Entity
@Table(name="\"pref_period_type\"")
@NamedQuery(name="PrefPeriodType.findAll", query="SELECT p FROM PrefPeriodType p")
public class PrefPeriodType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"type\"")
	private String type;

	@Column(name="\"Description\"")
	private String description;

	public PrefPeriodType() {
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}