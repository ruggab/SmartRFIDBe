package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_replication_origin" database table.
 * 
 */
@Entity
@Table(name="\"pg_replication_origin\"")
@NamedQuery(name="PgReplicationOrigin.findAll", query="SELECT p FROM PgReplicationOrigin p")
public class PgReplicationOrigin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"roident\"")
	private long roident;

	@Column(name="\"roname\"")
	private String roname;

	public PgReplicationOrigin() {
	}

	public long getRoident() {
		return this.roident;
	}

	public void setRoident(long roident) {
		this.roident = roident;
	}

	public String getRoname() {
		return this.roname;
	}

	public void setRoname(String roname) {
		this.roname = roname;
	}

}