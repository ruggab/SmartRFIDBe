package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_ts_dict" database table.
 * 
 */
@Entity
@Table(name="\"pg_ts_dict\"")
@NamedQuery(name="PgTsDict.findAll", query="SELECT p FROM PgTsDict p")
public class PgTsDict implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"dictinitoption\"")
	private String dictinitoption;

	@Column(name="\"dictname\"")
	private String dictname;

	@Column(name="\"dictnamespace\"")
	private long dictnamespace;

	@Column(name="\"dictowner\"")
	private long dictowner;

	@Column(name="\"dicttemplate\"")
	private long dicttemplate;

	@Column(name="\"oid\"")
	private long oid;

	public PgTsDict() {
	}

	public String getDictinitoption() {
		return this.dictinitoption;
	}

	public void setDictinitoption(String dictinitoption) {
		this.dictinitoption = dictinitoption;
	}

	public String getDictname() {
		return this.dictname;
	}

	public void setDictname(String dictname) {
		this.dictname = dictname;
	}

	public long getDictnamespace() {
		return this.dictnamespace;
	}

	public void setDictnamespace(long dictnamespace) {
		this.dictnamespace = dictnamespace;
	}

	public long getDictowner() {
		return this.dictowner;
	}

	public void setDictowner(long dictowner) {
		this.dictowner = dictowner;
	}

	public long getDicttemplate() {
		return this.dicttemplate;
	}

	public void setDicttemplate(long dicttemplate) {
		this.dicttemplate = dicttemplate;
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

}