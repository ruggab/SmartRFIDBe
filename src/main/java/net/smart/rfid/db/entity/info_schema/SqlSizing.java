package net.smart.rfid.db.entity.info_schema;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "sql_sizing" database table.
 * 
 */
@Entity
@Table(name="\"sql_sizing\"")
@NamedQuery(name="SqlSizing.findAll", query="SELECT s FROM SqlSizing s")
public class SqlSizing implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"comments\"")
	private Object comments;

	@Column(name="\"sizing_id\"")
	private Object sizingId;

	@Column(name="\"sizing_name\"")
	private Object sizingName;

	@Column(name="\"supported_value\"")
	private Object supportedValue;

	public SqlSizing() {
	}

	public Object getComments() {
		return this.comments;
	}

	public void setComments(Object comments) {
		this.comments = comments;
	}

	public Object getSizingId() {
		return this.sizingId;
	}

	public void setSizingId(Object sizingId) {
		this.sizingId = sizingId;
	}

	public Object getSizingName() {
		return this.sizingName;
	}

	public void setSizingName(Object sizingName) {
		this.sizingName = sizingName;
	}

	public Object getSupportedValue() {
		return this.supportedValue;
	}

	public void setSupportedValue(Object supportedValue) {
		this.supportedValue = supportedValue;
	}

}