package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_publication_rel" database table.
 * 
 */
@Entity
@Table(name="\"pg_publication_rel\"")
@NamedQuery(name="PgPublicationRel.findAll", query="SELECT p FROM PgPublicationRel p")
public class PgPublicationRel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"oid\"")
	private long oid;

	@Column(name="\"prpubid\"")
	private long prpubid;

	@Column(name="\"prrelid\"")
	private long prrelid;

	public PgPublicationRel() {
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public long getPrpubid() {
		return this.prpubid;
	}

	public void setPrpubid(long prpubid) {
		this.prpubid = prpubid;
	}

	public long getPrrelid() {
		return this.prrelid;
	}

	public void setPrrelid(long prrelid) {
		this.prrelid = prrelid;
	}

}