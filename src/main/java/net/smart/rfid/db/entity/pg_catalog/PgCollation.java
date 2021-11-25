package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_collation" database table.
 * 
 */
@Entity
@Table(name="\"pg_collation\"")
@NamedQuery(name="PgCollation.findAll", query="SELECT p FROM PgCollation p")
public class PgCollation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"collcollate\"")
	private String collcollate;

	@Column(name="\"collctype\"")
	private String collctype;

	@Column(name="\"collencoding\"")
	private int collencoding;

	@Column(name="\"collisdeterministic\"")
	private boolean collisdeterministic;

	@Column(name="\"collname\"")
	private String collname;

	@Column(name="\"collnamespace\"")
	private long collnamespace;

	@Column(name="\"collowner\"")
	private long collowner;

	@Column(name="\"collprovider\"")
	private String collprovider;

	@Column(name="\"collversion\"")
	private String collversion;

	@Column(name="\"oid\"")
	private long oid;

	public PgCollation() {
	}

	public String getCollcollate() {
		return this.collcollate;
	}

	public void setCollcollate(String collcollate) {
		this.collcollate = collcollate;
	}

	public String getCollctype() {
		return this.collctype;
	}

	public void setCollctype(String collctype) {
		this.collctype = collctype;
	}

	public int getCollencoding() {
		return this.collencoding;
	}

	public void setCollencoding(int collencoding) {
		this.collencoding = collencoding;
	}

	public boolean getCollisdeterministic() {
		return this.collisdeterministic;
	}

	public void setCollisdeterministic(boolean collisdeterministic) {
		this.collisdeterministic = collisdeterministic;
	}

	public String getCollname() {
		return this.collname;
	}

	public void setCollname(String collname) {
		this.collname = collname;
	}

	public long getCollnamespace() {
		return this.collnamespace;
	}

	public void setCollnamespace(long collnamespace) {
		this.collnamespace = collnamespace;
	}

	public long getCollowner() {
		return this.collowner;
	}

	public void setCollowner(long collowner) {
		this.collowner = collowner;
	}

	public String getCollprovider() {
		return this.collprovider;
	}

	public void setCollprovider(String collprovider) {
		this.collprovider = collprovider;
	}

	public String getCollversion() {
		return this.collversion;
	}

	public void setCollversion(String collversion) {
		this.collversion = collversion;
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

}