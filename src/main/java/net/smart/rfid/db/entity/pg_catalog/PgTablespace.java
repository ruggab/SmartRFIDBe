package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_tablespace" database table.
 * 
 */
@Entity
@Table(name="\"pg_tablespace\"")
@NamedQuery(name="PgTablespace.findAll", query="SELECT p FROM PgTablespace p")
public class PgTablespace implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"oid\"")
	private long oid;

	@Column(name="\"spcacl\"")
	private Object spcacl;

	@Column(name="\"spcname\"")
	private String spcname;

	@Column(name="\"spcoptions\"")
	private Object spcoptions;

	@Column(name="\"spcowner\"")
	private long spcowner;

	public PgTablespace() {
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public Object getSpcacl() {
		return this.spcacl;
	}

	public void setSpcacl(Object spcacl) {
		this.spcacl = spcacl;
	}

	public String getSpcname() {
		return this.spcname;
	}

	public void setSpcname(String spcname) {
		this.spcname = spcname;
	}

	public Object getSpcoptions() {
		return this.spcoptions;
	}

	public void setSpcoptions(Object spcoptions) {
		this.spcoptions = spcoptions;
	}

	public long getSpcowner() {
		return this.spcowner;
	}

	public void setSpcowner(long spcowner) {
		this.spcowner = spcowner;
	}

}