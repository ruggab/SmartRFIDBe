package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_amop" database table.
 * 
 */
@Entity
@Table(name="\"pg_amop\"")
@NamedQuery(name="PgAmop.findAll", query="SELECT p FROM PgAmop p")
public class PgAmop implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"amopfamily\"")
	private long amopfamily;

	@Column(name="\"amoplefttype\"")
	private long amoplefttype;

	@Column(name="\"amopmethod\"")
	private long amopmethod;

	@Column(name="\"amopopr\"")
	private long amopopr;

	@Column(name="\"amoppurpose\"")
	private String amoppurpose;

	@Column(name="\"amoprighttype\"")
	private long amoprighttype;

	@Column(name="\"amopsortfamily\"")
	private long amopsortfamily;

	@Column(name="\"amopstrategy\"")
	private short amopstrategy;

	@Column(name="\"oid\"")
	private long oid;

	public PgAmop() {
	}

	public long getAmopfamily() {
		return this.amopfamily;
	}

	public void setAmopfamily(long amopfamily) {
		this.amopfamily = amopfamily;
	}

	public long getAmoplefttype() {
		return this.amoplefttype;
	}

	public void setAmoplefttype(long amoplefttype) {
		this.amoplefttype = amoplefttype;
	}

	public long getAmopmethod() {
		return this.amopmethod;
	}

	public void setAmopmethod(long amopmethod) {
		this.amopmethod = amopmethod;
	}

	public long getAmopopr() {
		return this.amopopr;
	}

	public void setAmopopr(long amopopr) {
		this.amopopr = amopopr;
	}

	public String getAmoppurpose() {
		return this.amoppurpose;
	}

	public void setAmoppurpose(String amoppurpose) {
		this.amoppurpose = amoppurpose;
	}

	public long getAmoprighttype() {
		return this.amoprighttype;
	}

	public void setAmoprighttype(long amoprighttype) {
		this.amoprighttype = amoprighttype;
	}

	public long getAmopsortfamily() {
		return this.amopsortfamily;
	}

	public void setAmopsortfamily(long amopsortfamily) {
		this.amopsortfamily = amopsortfamily;
	}

	public short getAmopstrategy() {
		return this.amopstrategy;
	}

	public void setAmopstrategy(short amopstrategy) {
		this.amopstrategy = amopstrategy;
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

}