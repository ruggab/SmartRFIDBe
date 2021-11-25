package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_database" database table.
 * 
 */
@Entity
@Table(name="\"pg_database\"")
@NamedQuery(name="PgDatabase.findAll", query="SELECT p FROM PgDatabase p")
public class PgDatabase implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"datacl\"")
	private Object datacl;

	@Column(name="\"datallowconn\"")
	private boolean datallowconn;

	@Column(name="\"datcollate\"")
	private String datcollate;

	@Column(name="\"datconnlimit\"")
	private int datconnlimit;

	@Column(name="\"datctype\"")
	private String datctype;

	@Column(name="\"datdba\"")
	private long datdba;

	@Column(name="\"datfrozenxid\"")
	private Object datfrozenxid;

	@Column(name="\"datistemplate\"")
	private boolean datistemplate;

	@Column(name="\"datlastsysoid\"")
	private long datlastsysoid;

	@Column(name="\"datminmxid\"")
	private Object datminmxid;

	@Column(name="\"datname\"")
	private String datname;

	@Column(name="\"dattablespace\"")
	private long dattablespace;

	@Column(name="\"encoding\"")
	private int encoding;

	@Column(name="\"oid\"")
	private long oid;

	public PgDatabase() {
	}

	public Object getDatacl() {
		return this.datacl;
	}

	public void setDatacl(Object datacl) {
		this.datacl = datacl;
	}

	public boolean getDatallowconn() {
		return this.datallowconn;
	}

	public void setDatallowconn(boolean datallowconn) {
		this.datallowconn = datallowconn;
	}

	public String getDatcollate() {
		return this.datcollate;
	}

	public void setDatcollate(String datcollate) {
		this.datcollate = datcollate;
	}

	public int getDatconnlimit() {
		return this.datconnlimit;
	}

	public void setDatconnlimit(int datconnlimit) {
		this.datconnlimit = datconnlimit;
	}

	public String getDatctype() {
		return this.datctype;
	}

	public void setDatctype(String datctype) {
		this.datctype = datctype;
	}

	public long getDatdba() {
		return this.datdba;
	}

	public void setDatdba(long datdba) {
		this.datdba = datdba;
	}

	public Object getDatfrozenxid() {
		return this.datfrozenxid;
	}

	public void setDatfrozenxid(Object datfrozenxid) {
		this.datfrozenxid = datfrozenxid;
	}

	public boolean getDatistemplate() {
		return this.datistemplate;
	}

	public void setDatistemplate(boolean datistemplate) {
		this.datistemplate = datistemplate;
	}

	public long getDatlastsysoid() {
		return this.datlastsysoid;
	}

	public void setDatlastsysoid(long datlastsysoid) {
		this.datlastsysoid = datlastsysoid;
	}

	public Object getDatminmxid() {
		return this.datminmxid;
	}

	public void setDatminmxid(Object datminmxid) {
		this.datminmxid = datminmxid;
	}

	public String getDatname() {
		return this.datname;
	}

	public void setDatname(String datname) {
		this.datname = datname;
	}

	public long getDattablespace() {
		return this.dattablespace;
	}

	public void setDattablespace(long dattablespace) {
		this.dattablespace = dattablespace;
	}

	public int getEncoding() {
		return this.encoding;
	}

	public void setEncoding(int encoding) {
		this.encoding = encoding;
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

}