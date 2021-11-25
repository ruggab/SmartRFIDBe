package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_namespace" database table.
 * 
 */
@Entity
@Table(name="\"pg_namespace\"")
@NamedQuery(name="PgNamespace.findAll", query="SELECT p FROM PgNamespace p")
public class PgNamespace implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"nspacl\"")
	private Object nspacl;

	@Column(name="\"nspname\"")
	private String nspname;

	@Column(name="\"nspowner\"")
	private long nspowner;

	@Column(name="\"oid\"")
	private long oid;

	public PgNamespace() {
	}

	public Object getNspacl() {
		return this.nspacl;
	}

	public void setNspacl(Object nspacl) {
		this.nspacl = nspacl;
	}

	public String getNspname() {
		return this.nspname;
	}

	public void setNspname(String nspname) {
		this.nspname = nspname;
	}

	public long getNspowner() {
		return this.nspowner;
	}

	public void setNspowner(long nspowner) {
		this.nspowner = nspowner;
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

}