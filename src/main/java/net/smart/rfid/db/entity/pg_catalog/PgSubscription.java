package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_subscription" database table.
 * 
 */
@Entity
@Table(name="\"pg_subscription\"")
@NamedQuery(name="PgSubscription.findAll", query="SELECT p FROM PgSubscription p")
public class PgSubscription implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"oid\"")
	private long oid;

	@Column(name="\"subconninfo\"")
	private String subconninfo;

	@Column(name="\"subdbid\"")
	private long subdbid;

	@Column(name="\"subenabled\"")
	private boolean subenabled;

	@Column(name="\"subname\"")
	private String subname;

	@Column(name="\"subowner\"")
	private long subowner;

	@Column(name="\"subpublications\"")
	private Object subpublications;

	@Column(name="\"subslotname\"")
	private String subslotname;

	@Column(name="\"subsynccommit\"")
	private String subsynccommit;

	public PgSubscription() {
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public String getSubconninfo() {
		return this.subconninfo;
	}

	public void setSubconninfo(String subconninfo) {
		this.subconninfo = subconninfo;
	}

	public long getSubdbid() {
		return this.subdbid;
	}

	public void setSubdbid(long subdbid) {
		this.subdbid = subdbid;
	}

	public boolean getSubenabled() {
		return this.subenabled;
	}

	public void setSubenabled(boolean subenabled) {
		this.subenabled = subenabled;
	}

	public String getSubname() {
		return this.subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

	public long getSubowner() {
		return this.subowner;
	}

	public void setSubowner(long subowner) {
		this.subowner = subowner;
	}

	public Object getSubpublications() {
		return this.subpublications;
	}

	public void setSubpublications(Object subpublications) {
		this.subpublications = subpublications;
	}

	public String getSubslotname() {
		return this.subslotname;
	}

	public void setSubslotname(String subslotname) {
		this.subslotname = subslotname;
	}

	public String getSubsynccommit() {
		return this.subsynccommit;
	}

	public void setSubsynccommit(String subsynccommit) {
		this.subsynccommit = subsynccommit;
	}

}