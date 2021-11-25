package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_inherits" database table.
 * 
 */
@Entity
@Table(name="\"pg_inherits\"")
@NamedQuery(name="PgInherit.findAll", query="SELECT p FROM PgInherit p")
public class PgInherit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"inhparent\"")
	private long inhparent;

	@Column(name="\"inhrelid\"")
	private long inhrelid;

	@Column(name="\"inhseqno\"")
	private int inhseqno;

	public PgInherit() {
	}

	public long getInhparent() {
		return this.inhparent;
	}

	public void setInhparent(long inhparent) {
		this.inhparent = inhparent;
	}

	public long getInhrelid() {
		return this.inhrelid;
	}

	public void setInhrelid(long inhrelid) {
		this.inhrelid = inhrelid;
	}

	public int getInhseqno() {
		return this.inhseqno;
	}

	public void setInhseqno(int inhseqno) {
		this.inhseqno = inhseqno;
	}

}