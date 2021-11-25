package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_opfamily" database table.
 * 
 */
@Entity
@Table(name="\"pg_opfamily\"")
@NamedQuery(name="PgOpfamily.findAll", query="SELECT p FROM PgOpfamily p")
public class PgOpfamily implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"oid\"")
	private long oid;

	@Column(name="\"opfmethod\"")
	private long opfmethod;

	@Column(name="\"opfname\"")
	private String opfname;

	@Column(name="\"opfnamespace\"")
	private long opfnamespace;

	@Column(name="\"opfowner\"")
	private long opfowner;

	public PgOpfamily() {
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public long getOpfmethod() {
		return this.opfmethod;
	}

	public void setOpfmethod(long opfmethod) {
		this.opfmethod = opfmethod;
	}

	public String getOpfname() {
		return this.opfname;
	}

	public void setOpfname(String opfname) {
		this.opfname = opfname;
	}

	public long getOpfnamespace() {
		return this.opfnamespace;
	}

	public void setOpfnamespace(long opfnamespace) {
		this.opfnamespace = opfnamespace;
	}

	public long getOpfowner() {
		return this.opfowner;
	}

	public void setOpfowner(long opfowner) {
		this.opfowner = opfowner;
	}

}