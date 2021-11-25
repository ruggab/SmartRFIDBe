package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_sequence" database table.
 * 
 */
@Entity
@Table(name="\"pg_sequence\"")
@NamedQuery(name="PgSequence.findAll", query="SELECT p FROM PgSequence p")
public class PgSequence implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"seqcache\"")
	private long seqcache;

	@Column(name="\"seqcycle\"")
	private boolean seqcycle;

	@Column(name="\"seqincrement\"")
	private long seqincrement;

	@Column(name="\"seqmax\"")
	private long seqmax;

	@Column(name="\"seqmin\"")
	private long seqmin;

	@Column(name="\"seqrelid\"")
	private long seqrelid;

	@Column(name="\"seqstart\"")
	private long seqstart;

	@Column(name="\"seqtypid\"")
	private long seqtypid;

	public PgSequence() {
	}

	public long getSeqcache() {
		return this.seqcache;
	}

	public void setSeqcache(long seqcache) {
		this.seqcache = seqcache;
	}

	public boolean getSeqcycle() {
		return this.seqcycle;
	}

	public void setSeqcycle(boolean seqcycle) {
		this.seqcycle = seqcycle;
	}

	public long getSeqincrement() {
		return this.seqincrement;
	}

	public void setSeqincrement(long seqincrement) {
		this.seqincrement = seqincrement;
	}

	public long getSeqmax() {
		return this.seqmax;
	}

	public void setSeqmax(long seqmax) {
		this.seqmax = seqmax;
	}

	public long getSeqmin() {
		return this.seqmin;
	}

	public void setSeqmin(long seqmin) {
		this.seqmin = seqmin;
	}

	public long getSeqrelid() {
		return this.seqrelid;
	}

	public void setSeqrelid(long seqrelid) {
		this.seqrelid = seqrelid;
	}

	public long getSeqstart() {
		return this.seqstart;
	}

	public void setSeqstart(long seqstart) {
		this.seqstart = seqstart;
	}

	public long getSeqtypid() {
		return this.seqtypid;
	}

	public void setSeqtypid(long seqtypid) {
		this.seqtypid = seqtypid;
	}

}