package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_largeobject_metadata" database table.
 * 
 */
@Entity
@Table(name="\"pg_largeobject_metadata\"")
@NamedQuery(name="PgLargeobjectMetadata.findAll", query="SELECT p FROM PgLargeobjectMetadata p")
public class PgLargeobjectMetadata implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"lomacl\"")
	private Object lomacl;

	@Column(name="\"lomowner\"")
	private long lomowner;

	@Column(name="\"oid\"")
	private long oid;

	public PgLargeobjectMetadata() {
	}

	public Object getLomacl() {
		return this.lomacl;
	}

	public void setLomacl(Object lomacl) {
		this.lomacl = lomacl;
	}

	public long getLomowner() {
		return this.lomowner;
	}

	public void setLomowner(long lomowner) {
		this.lomowner = lomowner;
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

}