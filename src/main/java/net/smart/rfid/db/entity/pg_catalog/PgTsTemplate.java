package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_ts_template" database table.
 * 
 */
@Entity
@Table(name="\"pg_ts_template\"")
@NamedQuery(name="PgTsTemplate.findAll", query="SELECT p FROM PgTsTemplate p")
public class PgTsTemplate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"oid\"")
	private long oid;

	@Column(name="\"tmplinit\"")
	private Object tmplinit;

	@Column(name="\"tmpllexize\"")
	private Object tmpllexize;

	@Column(name="\"tmplname\"")
	private String tmplname;

	@Column(name="\"tmplnamespace\"")
	private long tmplnamespace;

	public PgTsTemplate() {
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public Object getTmplinit() {
		return this.tmplinit;
	}

	public void setTmplinit(Object tmplinit) {
		this.tmplinit = tmplinit;
	}

	public Object getTmpllexize() {
		return this.tmpllexize;
	}

	public void setTmpllexize(Object tmpllexize) {
		this.tmpllexize = tmpllexize;
	}

	public String getTmplname() {
		return this.tmplname;
	}

	public void setTmplname(String tmplname) {
		this.tmplname = tmplname;
	}

	public long getTmplnamespace() {
		return this.tmplnamespace;
	}

	public void setTmplnamespace(long tmplnamespace) {
		this.tmplnamespace = tmplnamespace;
	}

}