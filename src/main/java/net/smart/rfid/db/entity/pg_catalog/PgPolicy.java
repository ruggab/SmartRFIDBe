package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_policy" database table.
 * 
 */
@Entity
@Table(name="\"pg_policy\"")
@NamedQuery(name="PgPolicy.findAll", query="SELECT p FROM PgPolicy p")
public class PgPolicy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"oid\"")
	private long oid;

	@Column(name="\"polcmd\"")
	private String polcmd;

	@Column(name="\"polname\"")
	private String polname;

	@Column(name="\"polpermissive\"")
	private boolean polpermissive;

	@Column(name="\"polqual\"")
	private Object polqual;

	@Column(name="\"polrelid\"")
	private long polrelid;

	@Column(name="\"polroles\"")
	private Object polroles;

	@Column(name="\"polwithcheck\"")
	private Object polwithcheck;

	public PgPolicy() {
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public String getPolcmd() {
		return this.polcmd;
	}

	public void setPolcmd(String polcmd) {
		this.polcmd = polcmd;
	}

	public String getPolname() {
		return this.polname;
	}

	public void setPolname(String polname) {
		this.polname = polname;
	}

	public boolean getPolpermissive() {
		return this.polpermissive;
	}

	public void setPolpermissive(boolean polpermissive) {
		this.polpermissive = polpermissive;
	}

	public Object getPolqual() {
		return this.polqual;
	}

	public void setPolqual(Object polqual) {
		this.polqual = polqual;
	}

	public long getPolrelid() {
		return this.polrelid;
	}

	public void setPolrelid(long polrelid) {
		this.polrelid = polrelid;
	}

	public Object getPolroles() {
		return this.polroles;
	}

	public void setPolroles(Object polroles) {
		this.polroles = polroles;
	}

	public Object getPolwithcheck() {
		return this.polwithcheck;
	}

	public void setPolwithcheck(Object polwithcheck) {
		this.polwithcheck = polwithcheck;
	}

}