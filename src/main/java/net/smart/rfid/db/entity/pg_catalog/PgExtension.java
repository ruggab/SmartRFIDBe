package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_extension" database table.
 * 
 */
@Entity
@Table(name="\"pg_extension\"")
@NamedQuery(name="PgExtension.findAll", query="SELECT p FROM PgExtension p")
public class PgExtension implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"extcondition\"")
	private Object extcondition;

	@Column(name="\"extconfig\"")
	private Object extconfig;

	@Column(name="\"extname\"")
	private String extname;

	@Column(name="\"extnamespace\"")
	private long extnamespace;

	@Column(name="\"extowner\"")
	private long extowner;

	@Column(name="\"extrelocatable\"")
	private boolean extrelocatable;

	@Column(name="\"extversion\"")
	private String extversion;

	@Column(name="\"oid\"")
	private long oid;

	public PgExtension() {
	}

	public Object getExtcondition() {
		return this.extcondition;
	}

	public void setExtcondition(Object extcondition) {
		this.extcondition = extcondition;
	}

	public Object getExtconfig() {
		return this.extconfig;
	}

	public void setExtconfig(Object extconfig) {
		this.extconfig = extconfig;
	}

	public String getExtname() {
		return this.extname;
	}

	public void setExtname(String extname) {
		this.extname = extname;
	}

	public long getExtnamespace() {
		return this.extnamespace;
	}

	public void setExtnamespace(long extnamespace) {
		this.extnamespace = extnamespace;
	}

	public long getExtowner() {
		return this.extowner;
	}

	public void setExtowner(long extowner) {
		this.extowner = extowner;
	}

	public boolean getExtrelocatable() {
		return this.extrelocatable;
	}

	public void setExtrelocatable(boolean extrelocatable) {
		this.extrelocatable = extrelocatable;
	}

	public String getExtversion() {
		return this.extversion;
	}

	public void setExtversion(String extversion) {
		this.extversion = extversion;
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

}