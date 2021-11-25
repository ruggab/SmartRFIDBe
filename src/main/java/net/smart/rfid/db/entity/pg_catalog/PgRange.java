package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_range" database table.
 * 
 */
@Entity
@Table(name="\"pg_range\"")
@NamedQuery(name="PgRange.findAll", query="SELECT p FROM PgRange p")
public class PgRange implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"rngcanonical\"")
	private Object rngcanonical;

	@Column(name="\"rngcollation\"")
	private long rngcollation;

	@Column(name="\"rngsubdiff\"")
	private Object rngsubdiff;

	@Column(name="\"rngsubopc\"")
	private long rngsubopc;

	@Column(name="\"rngsubtype\"")
	private long rngsubtype;

	@Column(name="\"rngtypid\"")
	private long rngtypid;

	public PgRange() {
	}

	public Object getRngcanonical() {
		return this.rngcanonical;
	}

	public void setRngcanonical(Object rngcanonical) {
		this.rngcanonical = rngcanonical;
	}

	public long getRngcollation() {
		return this.rngcollation;
	}

	public void setRngcollation(long rngcollation) {
		this.rngcollation = rngcollation;
	}

	public Object getRngsubdiff() {
		return this.rngsubdiff;
	}

	public void setRngsubdiff(Object rngsubdiff) {
		this.rngsubdiff = rngsubdiff;
	}

	public long getRngsubopc() {
		return this.rngsubopc;
	}

	public void setRngsubopc(long rngsubopc) {
		this.rngsubopc = rngsubopc;
	}

	public long getRngsubtype() {
		return this.rngsubtype;
	}

	public void setRngsubtype(long rngsubtype) {
		this.rngsubtype = rngsubtype;
	}

	public long getRngtypid() {
		return this.rngtypid;
	}

	public void setRngtypid(long rngtypid) {
		this.rngtypid = rngtypid;
	}

}