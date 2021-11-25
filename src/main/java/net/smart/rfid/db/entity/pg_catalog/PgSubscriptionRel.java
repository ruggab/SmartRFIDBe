package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_subscription_rel" database table.
 * 
 */
@Entity
@Table(name="\"pg_subscription_rel\"")
@NamedQuery(name="PgSubscriptionRel.findAll", query="SELECT p FROM PgSubscriptionRel p")
public class PgSubscriptionRel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"srrelid\"")
	private long srrelid;

	@Column(name="\"srsubid\"")
	private long srsubid;

	@Column(name="\"srsublsn\"")
	private Object srsublsn;

	@Column(name="\"srsubstate\"")
	private String srsubstate;

	public PgSubscriptionRel() {
	}

	public long getSrrelid() {
		return this.srrelid;
	}

	public void setSrrelid(long srrelid) {
		this.srrelid = srrelid;
	}

	public long getSrsubid() {
		return this.srsubid;
	}

	public void setSrsubid(long srsubid) {
		this.srsubid = srsubid;
	}

	public Object getSrsublsn() {
		return this.srsublsn;
	}

	public void setSrsublsn(Object srsublsn) {
		this.srsublsn = srsublsn;
	}

	public String getSrsubstate() {
		return this.srsubstate;
	}

	public void setSrsubstate(String srsubstate) {
		this.srsubstate = srsubstate;
	}

}