package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_cast" database table.
 * 
 */
@Entity
@Table(name="\"pg_cast\"")
@NamedQuery(name="PgCast.findAll", query="SELECT p FROM PgCast p")
public class PgCast implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"castcontext\"")
	private String castcontext;

	@Column(name="\"castfunc\"")
	private long castfunc;

	@Column(name="\"castmethod\"")
	private String castmethod;

	@Column(name="\"castsource\"")
	private long castsource;

	@Column(name="\"casttarget\"")
	private long casttarget;

	@Column(name="\"oid\"")
	private long oid;

	public PgCast() {
	}

	public String getCastcontext() {
		return this.castcontext;
	}

	public void setCastcontext(String castcontext) {
		this.castcontext = castcontext;
	}

	public long getCastfunc() {
		return this.castfunc;
	}

	public void setCastfunc(long castfunc) {
		this.castfunc = castfunc;
	}

	public String getCastmethod() {
		return this.castmethod;
	}

	public void setCastmethod(String castmethod) {
		this.castmethod = castmethod;
	}

	public long getCastsource() {
		return this.castsource;
	}

	public void setCastsource(long castsource) {
		this.castsource = castsource;
	}

	public long getCasttarget() {
		return this.casttarget;
	}

	public void setCasttarget(long casttarget) {
		this.casttarget = casttarget;
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

}