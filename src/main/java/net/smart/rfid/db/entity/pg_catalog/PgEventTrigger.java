package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_event_trigger" database table.
 * 
 */
@Entity
@Table(name="\"pg_event_trigger\"")
@NamedQuery(name="PgEventTrigger.findAll", query="SELECT p FROM PgEventTrigger p")
public class PgEventTrigger implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"evtenabled\"")
	private String evtenabled;

	@Column(name="\"evtevent\"")
	private String evtevent;

	@Column(name="\"evtfoid\"")
	private long evtfoid;

	@Column(name="\"evtname\"")
	private String evtname;

	@Column(name="\"evtowner\"")
	private long evtowner;

	@Column(name="\"evttags\"")
	private Object evttags;

	@Column(name="\"oid\"")
	private long oid;

	public PgEventTrigger() {
	}

	public String getEvtenabled() {
		return this.evtenabled;
	}

	public void setEvtenabled(String evtenabled) {
		this.evtenabled = evtenabled;
	}

	public String getEvtevent() {
		return this.evtevent;
	}

	public void setEvtevent(String evtevent) {
		this.evtevent = evtevent;
	}

	public long getEvtfoid() {
		return this.evtfoid;
	}

	public void setEvtfoid(long evtfoid) {
		this.evtfoid = evtfoid;
	}

	public String getEvtname() {
		return this.evtname;
	}

	public void setEvtname(String evtname) {
		this.evtname = evtname;
	}

	public long getEvtowner() {
		return this.evtowner;
	}

	public void setEvtowner(long evtowner) {
		this.evtowner = evtowner;
	}

	public Object getEvttags() {
		return this.evttags;
	}

	public void setEvttags(Object evttags) {
		this.evttags = evttags;
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

}