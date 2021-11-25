package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_depend" database table.
 * 
 */
@Entity
@Table(name="\"pg_depend\"")
@NamedQuery(name="PgDepend.findAll", query="SELECT p FROM PgDepend p")
public class PgDepend implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"classid\"")
	private long classid;

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

	@Column(name="\"refobjsubid\"")
	private int refobjsubid;

	public PgDepend() {
	}

	public long getClassid() {
		return this.classid;
	}

	public void setClassid(long classid) {
		this.classid = classid;
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

	public int getRefobjsubid() {
		return this.refobjsubid;
	}

	public void setRefobjsubid(int refobjsubid) {
		this.refobjsubid = refobjsubid;
	}

}