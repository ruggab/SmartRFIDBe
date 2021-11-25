package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_conversion" database table.
 * 
 */
@Entity
@Table(name="\"pg_conversion\"")
@NamedQuery(name="PgConversion.findAll", query="SELECT p FROM PgConversion p")
public class PgConversion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"condefault\"")
	private boolean condefault;

	@Column(name="\"conforencoding\"")
	private int conforencoding;

	@Column(name="\"conname\"")
	private String conname;

	@Column(name="\"connamespace\"")
	private long connamespace;

	@Column(name="\"conowner\"")
	private long conowner;

	@Column(name="\"conproc\"")
	private Object conproc;

	@Column(name="\"contoencoding\"")
	private int contoencoding;

	@Column(name="\"oid\"")
	private long oid;

	public PgConversion() {
	}

	public boolean getCondefault() {
		return this.condefault;
	}

	public void setCondefault(boolean condefault) {
		this.condefault = condefault;
	}

	public int getConforencoding() {
		return this.conforencoding;
	}

	public void setConforencoding(int conforencoding) {
		this.conforencoding = conforencoding;
	}

	public String getConname() {
		return this.conname;
	}

	public void setConname(String conname) {
		this.conname = conname;
	}

	public long getConnamespace() {
		return this.connamespace;
	}

	public void setConnamespace(long connamespace) {
		this.connamespace = connamespace;
	}

	public long getConowner() {
		return this.conowner;
	}

	public void setConowner(long conowner) {
		this.conowner = conowner;
	}

	public Object getConproc() {
		return this.conproc;
	}

	public void setConproc(Object conproc) {
		this.conproc = conproc;
	}

	public int getContoencoding() {
		return this.contoencoding;
	}

	public void setContoencoding(int contoencoding) {
		this.contoencoding = contoencoding;
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

}