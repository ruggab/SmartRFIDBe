package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_shdepend" database table.
 * 
 */
@Entity
@Table(name="\"pg_shdepend\"")
@NamedQuery(name="PgShdepend.findAll", query="SELECT p FROM PgShdepend p")
public class PgShdepend implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"classid\"")
	private long classid;

	@Column(name="\"dbid\"")
	private long dbid;

	@Column(name="\"deptype\"")
	private String deptype;

	@Column(name="\"objid\"")
	private long objid;

	@Column(name="\"objsubid\"")
	private int objsubid;

	@Column(name="\"refclassid\"")
	private long refclassid;

	@Column(name="\"refobjid\"")
	private long refobjid;

	public PgShdepend() {
	}

	public long getClassid() {
		return this.classid;
	}

	public void setClassid(long classid) {
		this.classid = classid;
	}

	public long getDbid() {
		return this.dbid;
	}

	public void setDbid(long dbid) {
		this.dbid = dbid;
	}

	public String getDeptype() {
		return this.deptype;
	}

	public void setDeptype(String deptype) {
		this.deptype = deptype;
	}

	public long getObjid() {
		return this.objid;
	}

	public void setObjid(long objid) {
		this.objid = objid;
	}

	public int getObjsubid() {
		return this.objsubid;
	}

	public void setObjsubid(int objsubid) {
		this.objsubid = objsubid;
	}

	public long getRefclassid() {
		return this.refclassid;
	}

	public void setRefclassid(long refclassid) {
		this.refclassid = refclassid;
	}

	public long getRefobjid() {
		return this.refobjid;
	}

	public void setRefobjid(long refobjid) {
		this.refobjid = refobjid;
	}

}