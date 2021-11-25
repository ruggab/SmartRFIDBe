package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_ts_parser" database table.
 * 
 */
@Entity
@Table(name="\"pg_ts_parser\"")
@NamedQuery(name="PgTsParser.findAll", query="SELECT p FROM PgTsParser p")
public class PgTsParser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"oid\"")
	private long oid;

	@Column(name="\"prsend\"")
	private Object prsend;

	@Column(name="\"prsheadline\"")
	private Object prsheadline;

	@Column(name="\"prslextype\"")
	private Object prslextype;

	@Column(name="\"prsname\"")
	private String prsname;

	@Column(name="\"prsnamespace\"")
	private long prsnamespace;

	@Column(name="\"prsstart\"")
	private Object prsstart;

	@Column(name="\"prstoken\"")
	private Object prstoken;

	public PgTsParser() {
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public Object getPrsend() {
		return this.prsend;
	}

	public void setPrsend(Object prsend) {
		this.prsend = prsend;
	}

	public Object getPrsheadline() {
		return this.prsheadline;
	}

	public void setPrsheadline(Object prsheadline) {
		this.prsheadline = prsheadline;
	}

	public Object getPrslextype() {
		return this.prslextype;
	}

	public void setPrslextype(Object prslextype) {
		this.prslextype = prslextype;
	}

	public String getPrsname() {
		return this.prsname;
	}

	public void setPrsname(String prsname) {
		this.prsname = prsname;
	}

	public long getPrsnamespace() {
		return this.prsnamespace;
	}

	public void setPrsnamespace(long prsnamespace) {
		this.prsnamespace = prsnamespace;
	}

	public Object getPrsstart() {
		return this.prsstart;
	}

	public void setPrsstart(Object prsstart) {
		this.prsstart = prsstart;
	}

	public Object getPrstoken() {
		return this.prstoken;
	}

	public void setPrstoken(Object prstoken) {
		this.prstoken = prstoken;
	}

}