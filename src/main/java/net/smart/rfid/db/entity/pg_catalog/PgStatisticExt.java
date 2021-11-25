package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_statistic_ext" database table.
 * 
 */
@Entity
@Table(name="\"pg_statistic_ext\"")
@NamedQuery(name="PgStatisticExt.findAll", query="SELECT p FROM PgStatisticExt p")
public class PgStatisticExt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"oid\"")
	private long oid;

	@Column(name="\"stxkeys\"")
	private Object stxkeys;

	@Column(name="\"stxkind\"")
	private Object stxkind;

	@Column(name="\"stxname\"")
	private String stxname;

	@Column(name="\"stxnamespace\"")
	private long stxnamespace;

	@Column(name="\"stxowner\"")
	private long stxowner;

	@Column(name="\"stxrelid\"")
	private long stxrelid;

	@Column(name="\"stxstattarget\"")
	private int stxstattarget;

	public PgStatisticExt() {
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public Object getStxkeys() {
		return this.stxkeys;
	}

	public void setStxkeys(Object stxkeys) {
		this.stxkeys = stxkeys;
	}

	public Object getStxkind() {
		return this.stxkind;
	}

	public void setStxkind(Object stxkind) {
		this.stxkind = stxkind;
	}

	public String getStxname() {
		return this.stxname;
	}

	public void setStxname(String stxname) {
		this.stxname = stxname;
	}

	public long getStxnamespace() {
		return this.stxnamespace;
	}

	public void setStxnamespace(long stxnamespace) {
		this.stxnamespace = stxnamespace;
	}

	public long getStxowner() {
		return this.stxowner;
	}

	public void setStxowner(long stxowner) {
		this.stxowner = stxowner;
	}

	public long getStxrelid() {
		return this.stxrelid;
	}

	public void setStxrelid(long stxrelid) {
		this.stxrelid = stxrelid;
	}

	public int getStxstattarget() {
		return this.stxstattarget;
	}

	public void setStxstattarget(int stxstattarget) {
		this.stxstattarget = stxstattarget;
	}

}