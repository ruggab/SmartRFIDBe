package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "config_reader_type_step_type" database table.
 * 
 */
@Entity
@Table(name="\"config_reader_type_step_type\"")
@NamedQuery(name="ConfigReaderTypeStepType.findAll", query="SELECT c FROM ConfigReaderTypeStepType c")
public class ConfigReaderTypeStepType implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ConfigReaderTypeStepTypePK id;

	@Column(name="\"value\"")
	private String value;

	public ConfigReaderTypeStepType() {
	}

	public ConfigReaderTypeStepTypePK getId() {
		return this.id;
	}

	public void setId(ConfigReaderTypeStepTypePK id) {
		this.id = id;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}