package net.smart.rfid.db.entity.info_schema;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "sql_implementation_info" database table.
 * 
 */
@Entity
@Table(name="\"sql_implementation_info\"")
@NamedQuery(name="SqlImplementationInfo.findAll", query="SELECT s FROM SqlImplementationInfo s")
public class SqlImplementationInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"character_value\"")
	private Object characterValue;

	@Column(name="\"comments\"")
	private Object comments;

	@Column(name="\"implementation_info_id\"")
	private Object implementationInfoId;

	@Column(name="\"implementation_info_name\"")
	private Object implementationInfoName;

	@Column(name="\"integer_value\"")
	private Object integerValue;

	public SqlImplementationInfo() {
	}

	public Object getCharacterValue() {
		return this.characterValue;
	}

	public void setCharacterValue(Object characterValue) {
		this.characterValue = characterValue;
	}

	public Object getComments() {
		return this.comments;
	}

	public void setComments(Object comments) {
		this.comments = comments;
	}

	public Object getImplementationInfoId() {
		return this.implementationInfoId;
	}

	public void setImplementationInfoId(Object implementationInfoId) {
		this.implementationInfoId = implementationInfoId;
	}

	public Object getImplementationInfoName() {
		return this.implementationInfoName;
	}

	public void setImplementationInfoName(Object implementationInfoName) {
		this.implementationInfoName = implementationInfoName;
	}

	public Object getIntegerValue() {
		return this.integerValue;
	}

	public void setIntegerValue(Object integerValue) {
		this.integerValue = integerValue;
	}

}