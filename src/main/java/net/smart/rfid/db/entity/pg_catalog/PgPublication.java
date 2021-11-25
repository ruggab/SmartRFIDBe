package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_publication" database table.
 * 
 */
@Entity
@Table(name="\"pg_publication\"")
@NamedQuery(name="PgPublication.findAll", query="SELECT p FROM PgPublication p")
public class PgPublication implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"oid\"")
	private long oid;

	@Column(name="\"puballtables\"")
	private boolean puballtables;

	@Column(name="\"pubdelete\"")
	private boolean pubdelete;

	@Column(name="\"pubinsert\"")
	private boolean pubinsert;

	@Column(name="\"pubname\"")
	private String pubname;

	@Column(name="\"pubowner\"")
	private long pubowner;

	@Column(name="\"pubtruncate\"")
	private boolean pubtruncate;

	@Column(name="\"pubupdate\"")
	private boolean pubupdate;

	@Column(name="\"pubviaroot\"")
	private boolean pubviaroot;

	public PgPublication() {
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public boolean getPuballtables() {
		return this.puballtables;
	}

	public void setPuballtables(boolean puballtables) {
		this.puballtables = puballtables;
	}

	public boolean getPubdelete() {
		return this.pubdelete;
	}

	public void setPubdelete(boolean pubdelete) {
		this.pubdelete = pubdelete;
	}

	public boolean getPubinsert() {
		return this.pubinsert;
	}

	public void setPubinsert(boolean pubinsert) {
		this.pubinsert = pubinsert;
	}

	public String getPubname() {
		return this.pubname;
	}

	public void setPubname(String pubname) {
		this.pubname = pubname;
	}

	public long getPubowner() {
		return this.pubowner;
	}

	public void setPubowner(long pubowner) {
		this.pubowner = pubowner;
	}

	public boolean getPubtruncate() {
		return this.pubtruncate;
	}

	public void setPubtruncate(boolean pubtruncate) {
		this.pubtruncate = pubtruncate;
	}

	public boolean getPubupdate() {
		return this.pubupdate;
	}

	public void setPubupdate(boolean pubupdate) {
		this.pubupdate = pubupdate;
	}

	public boolean getPubviaroot() {
		return this.pubviaroot;
	}

	public void setPubviaroot(boolean pubviaroot) {
		this.pubviaroot = pubviaroot;
	}

}