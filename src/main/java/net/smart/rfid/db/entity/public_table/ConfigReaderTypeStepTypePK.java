package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "config_reader_type_step_type" database table.
 * 
 */
@Embeddable
public class ConfigReaderTypeStepTypePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"id_reader_type\"")
	private int idReaderType;

	@Column(name="\"parameter\"")
	private String parameter;

	@Column(name="\"idstep_type\"")
	private int idstepType;

	public ConfigReaderTypeStepTypePK() {
	}
	public int getIdReaderType() {
		return this.idReaderType;
	}
	public void setIdReaderType(int idReaderType) {
		this.idReaderType = idReaderType;
	}
	public String getParameter() {
		return this.parameter;
	}
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
	public int getIdstepType() {
		return this.idstepType;
	}
	public void setIdstepType(int idstepType) {
		this.idstepType = idstepType;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ConfigReaderTypeStepTypePK)) {
			return false;
		}
		ConfigReaderTypeStepTypePK castOther = (ConfigReaderTypeStepTypePK)other;
		return 
			(this.idReaderType == castOther.idReaderType)
			&& this.parameter.equals(castOther.parameter)
			&& (this.idstepType == castOther.idstepType);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idReaderType;
		hash = hash * prime + this.parameter.hashCode();
		hash = hash * prime + this.idstepType;
		
		return hash;
	}
}