package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_transform" database table.
 * 
 */
@Entity
@Table(name="\"pg_transform\"")
@NamedQuery(name="PgTransform.findAll", query="SELECT p FROM PgTransform p")
public class PgTransform implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"oid\"")
	private long oid;

	@Column(name="\"trffromsql\"")
	private Object trffromsql;

	@Column(name="\"trflang\"")
	private long trflang;

	@Column(name="\"trftosql\"")
	private Object trftosql;

	@Column(name="\"trftype\"")
	private long trftype;

	public PgTransform() {
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public Object getTrffromsql() {
		return this.trffromsql;
	}

	public void setTrffromsql(Object trffromsql) {
		this.trffromsql = trffromsql;
	}

	public long getTrflang() {
		return this.trflang;
	}

	public void setTrflang(long trflang) {
		this.trflang = trflang;
	}

	public Object getTrftosql() {
		return this.trftosql;
	}

	public void setTrftosql(Object trftosql) {
		this.trftosql = trftosql;
	}

	public long getTrftype() {
		return this.trftype;
	}

	public void setTrftype(long trftype) {
		this.trftype = trftype;
	}

}