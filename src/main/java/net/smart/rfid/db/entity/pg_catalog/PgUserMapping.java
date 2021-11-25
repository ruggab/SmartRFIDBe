package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_user_mapping" database table.
 * 
 */
@Entity
@Table(name="\"pg_user_mapping\"")
@NamedQuery(name="PgUserMapping.findAll", query="SELECT p FROM PgUserMapping p")
public class PgUserMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"oid\"")
	private long oid;

	@Column(name="\"umoptions\"")
	private Object umoptions;

	@Column(name="\"umserver\"")
	private long umserver;

	@Column(name="\"umuser\"")
	private long umuser;

	public PgUserMapping() {
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public Object getUmoptions() {
		return this.umoptions;
	}

	public void setUmoptions(Object umoptions) {
		this.umoptions = umoptions;
	}

	public long getUmserver() {
		return this.umserver;
	}

	public void setUmserver(long umserver) {
		this.umserver = umserver;
	}

	public long getUmuser() {
		return this.umuser;
	}

	public void setUmuser(long umuser) {
		this.umuser = umuser;
	}

}