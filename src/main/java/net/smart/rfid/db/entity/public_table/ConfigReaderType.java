package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "config_reader_type" database table.
 * 
 */
@Entity
@Table(name="\"config_reader_type\"")
@NamedQuery(name="ConfigReaderType.findAll", query="SELECT c FROM ConfigReaderType c")
public class ConfigReaderType implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ConfigReaderTypePK id;

	@Column(name="\"parameter_type\"")
	private String parameterType;

	@Column(name="\"value\"")
	private Object value;

	public ConfigReaderType() {
	}

	public ConfigReaderTypePK getId() {
		return this.id;
	}

	public void setId(ConfigReaderTypePK id) {
		this.id = id;
	}

	public String getParameterType() {
		return this.parameterType;
	}

	public void setParameterType(String parameterType) {
		this.parameterType = parameterType;
	}

	public Object getValue() {
		return this.value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}