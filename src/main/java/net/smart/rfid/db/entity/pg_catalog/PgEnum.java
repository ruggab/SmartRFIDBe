package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_enum" database table.
 * 
 */
@Entity
@Table(name="\"pg_enum\"")
@NamedQuery(name="PgEnum.findAll", query="SELECT p FROM PgEnum p")
public class PgEnum implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"enumlabel\"")
	private String enumlabel;

	@Column(name="\"enumsortorder\"")
	private float enumsortorder;

	@Column(name="\"enumtypid\"")
	private long enumtypid;

	@Column(name="\"oid\"")
	private long oid;

	public PgEnum() {
	}

	public String getEnumlabel() {
		return this.enumlabel;
	}

	public void setEnumlabel(String enumlabel) {
		this.enumlabel = enumlabel;
	}

	public float getEnumsortorder() {
		return this.enumsortorder;
	}

	public void setEnumsortorder(float enumsortorder) {
		this.enumsortorder = enumsortorder;
	}

	public long getEnumtypid() {
		return this.enumtypid;
	}

	public void setEnumtypid(long enumtypid) {
		this.enumtypid = enumtypid;
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

}