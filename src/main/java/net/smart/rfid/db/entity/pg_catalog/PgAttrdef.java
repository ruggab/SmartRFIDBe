package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_attrdef" database table.
 * 
 */
@Entity
@Table(name="\"pg_attrdef\"")
@NamedQuery(name="PgAttrdef.findAll", query="SELECT p FROM PgAttrdef p")
public class PgAttrdef implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"adbin\"")
	private Object adbin;

	@Column(name="\"adnum\"")
	private short adnum;

	@Column(name="\"adrelid\"")
	private long adrelid;

	@Column(name="\"oid\"")
	private long oid;

	public PgAttrdef() {
	}

	public Object getAdbin() {
		return this.adbin;
	}

	public void setAdbin(Object adbin) {
		this.adbin = adbin;
	}

	public short getAdnum() {
		return this.adnum;
	}

	public void setAdnum(short adnum) {
		this.adnum = adnum;
	}

	public long getAdrelid() {
		return this.adrelid;
	}

	public void setAdrelid(long adrelid) {
		this.adrelid = adrelid;
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

}