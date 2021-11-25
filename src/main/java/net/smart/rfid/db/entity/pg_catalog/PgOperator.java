package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_operator" database table.
 * 
 */
@Entity
@Table(name="\"pg_operator\"")
@NamedQuery(name="PgOperator.findAll", query="SELECT p FROM PgOperator p")
public class PgOperator implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"oid\"")
	private long oid;

	@Column(name="\"oprcanhash\"")
	private boolean oprcanhash;

	@Column(name="\"oprcanmerge\"")
	private boolean oprcanmerge;

	@Column(name="\"oprcode\"")
	private Object oprcode;

	@Column(name="\"oprcom\"")
	private long oprcom;

	@Column(name="\"oprjoin\"")
	private Object oprjoin;

	@Column(name="\"oprkind\"")
	private String oprkind;

	@Column(name="\"oprleft\"")
	private long oprleft;

	@Column(name="\"oprname\"")
	private String oprname;

	@Column(name="\"oprnamespace\"")
	private long oprnamespace;

	@Column(name="\"oprnegate\"")
	private long oprnegate;

	@Column(name="\"oprowner\"")
	private long oprowner;

	@Column(name="\"oprrest\"")
	private Object oprrest;

	@Column(name="\"oprresult\"")
	private long oprresult;

	@Column(name="\"oprright\"")
	private long oprright;

	public PgOperator() {
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public boolean getOprcanhash() {
		return this.oprcanhash;
	}

	public void setOprcanhash(boolean oprcanhash) {
		this.oprcanhash = oprcanhash;
	}

	public boolean getOprcanmerge() {
		return this.oprcanmerge;
	}

	public void setOprcanmerge(boolean oprcanmerge) {
		this.oprcanmerge = oprcanmerge;
	}

	public Object getOprcode() {
		return this.oprcode;
	}

	public void setOprcode(Object oprcode) {
		this.oprcode = oprcode;
	}

	public long getOprcom() {
		return this.oprcom;
	}

	public void setOprcom(long oprcom) {
		this.oprcom = oprcom;
	}

	public Object getOprjoin() {
		return this.oprjoin;
	}

	public void setOprjoin(Object oprjoin) {
		this.oprjoin = oprjoin;
	}

	public String getOprkind() {
		return this.oprkind;
	}

	public void setOprkind(String oprkind) {
		this.oprkind = oprkind;
	}

	public long getOprleft() {
		return this.oprleft;
	}

	public void setOprleft(long oprleft) {
		this.oprleft = oprleft;
	}

	public String getOprname() {
		return this.oprname;
	}

	public void setOprname(String oprname) {
		this.oprname = oprname;
	}

	public long getOprnamespace() {
		return this.oprnamespace;
	}

	public void setOprnamespace(long oprnamespace) {
		this.oprnamespace = oprnamespace;
	}

	public long getOprnegate() {
		return this.oprnegate;
	}

	public void setOprnegate(long oprnegate) {
		this.oprnegate = oprnegate;
	}

	public long getOprowner() {
		return this.oprowner;
	}

	public void setOprowner(long oprowner) {
		this.oprowner = oprowner;
	}

	public Object getOprrest() {
		return this.oprrest;
	}

	public void setOprrest(Object oprrest) {
		this.oprrest = oprrest;
	}

	public long getOprresult() {
		return this.oprresult;
	}

	public void setOprresult(long oprresult) {
		this.oprresult = oprresult;
	}

	public long getOprright() {
		return this.oprright;
	}

	public void setOprright(long oprright) {
		this.oprright = oprright;
	}

}