package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_ts_config" database table.
 * 
 */
@Entity
@Table(name="\"pg_ts_config\"")
@NamedQuery(name="PgTsConfig.findAll", query="SELECT p FROM PgTsConfig p")
public class PgTsConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"cfgname\"")
	private String cfgname;

	@Column(name="\"cfgnamespace\"")
	private long cfgnamespace;

	@Column(name="\"cfgowner\"")
	private long cfgowner;

	@Column(name="\"cfgparser\"")
	private long cfgparser;

	@Column(name="\"oid\"")
	private long oid;

	public PgTsConfig() {
	}

	public String getCfgname() {
		return this.cfgname;
	}

	public void setCfgname(String cfgname) {
		this.cfgname = cfgname;
	}

	public long getCfgnamespace() {
		return this.cfgnamespace;
	}

	public void setCfgnamespace(long cfgnamespace) {
		this.cfgnamespace = cfgnamespace;
	}

	public long getCfgowner() {
		return this.cfgowner;
	}

	public void setCfgowner(long cfgowner) {
		this.cfgowner = cfgowner;
	}

	public long getCfgparser() {
		return this.cfgparser;
	}

	public void setCfgparser(long cfgparser) {
		this.cfgparser = cfgparser;
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

}