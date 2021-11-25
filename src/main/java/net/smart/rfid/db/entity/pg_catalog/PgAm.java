package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_am" database table.
 * 
 */
@Entity
@Table(name="\"pg_am\"")
@NamedQuery(name="PgAm.findAll", query="SELECT p FROM PgAm p")
public class PgAm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"amhandler\"")
	private Object amhandler;

	@Column(name="\"amname\"")
	private String amname;

	@Column(name="\"amtype\"") 
	private String amtype;

	@Column(name="\"oid\"")
	private long oid;

	public PgAm() {
	}

	public Object getAmhandler() {
		return this.amhandler;
	}

	public void setAmhandler(Object amhandler) {
		this.amhandler = amhandler;
	}

	public String getAmname() {
		return this.amname;
	}

	public void setAmname(String amname) {
		this.amname = amname;
	}

	public String getAmtype() {
		return this.amtype;
	}

	public void setAmtype(String amtype) {
		this.amtype = amtype;
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

}