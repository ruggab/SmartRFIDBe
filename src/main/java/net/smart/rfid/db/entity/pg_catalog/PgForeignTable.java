package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_foreign_table" database table.
 * 
 */
@Entity
@Table(name="\"pg_foreign_table\"")
@NamedQuery(name="PgForeignTable.findAll", query="SELECT p FROM PgForeignTable p")
public class PgForeignTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"ftoptions\"")
	private Object ftoptions;

	@Column(name="\"ftrelid\"")
	private long ftrelid;

	@Column(name="\"ftserver\"")
	private long ftserver;

	public PgForeignTable() {
	}

	public Object getFtoptions() {
		return this.ftoptions;
	}

	public void setFtoptions(Object ftoptions) {
		this.ftoptions = ftoptions;
	}

	public long getFtrelid() {
		return this.ftrelid;
	}

	public void setFtrelid(long ftrelid) {
		this.ftrelid = ftrelid;
	}

	public long getFtserver() {
		return this.ftserver;
	}

	public void setFtserver(long ftserver) {
		this.ftserver = ftserver;
	}

}