package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_opclass" database table.
 * 
 */
@Entity
@Table(name="\"pg_opclass\"")
@NamedQuery(name="PgOpclass.findAll", query="SELECT p FROM PgOpclass p")
public class PgOpclass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"oid\"")
	private long oid;

	@Column(name="\"opcdefault\"")
	private boolean opcdefault;

	@Column(name="\"opcfamily\"")
	private long opcfamily;

	@Column(name="\"opcintype\"")
	private long opcintype;

	@Column(name="\"opckeytype\"")
	private long opckeytype;

	@Column(name="\"opcmethod\"")
	private long opcmethod;

	@Column(name="\"opcname\"")
	private String opcname;

	@Column(name="\"opcnamespace\"")
	private long opcnamespace;

	@Column(name="\"opcowner\"")
	private long opcowner;

	public PgOpclass() {
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public boolean getOpcdefault() {
		return this.opcdefault;
	}

	public void setOpcdefault(boolean opcdefault) {
		this.opcdefault = opcdefault;
	}

	public long getOpcfamily() {
		return this.opcfamily;
	}

	public void setOpcfamily(long opcfamily) {
		this.opcfamily = opcfamily;
	}

	public long getOpcintype() {
		return this.opcintype;
	}

	public void setOpcintype(long opcintype) {
		this.opcintype = opcintype;
	}

	public long getOpckeytype() {
		return this.opckeytype;
	}

	public void setOpckeytype(long opckeytype) {
		this.opckeytype = opckeytype;
	}

	public long getOpcmethod() {
		return this.opcmethod;
	}

	public void setOpcmethod(long opcmethod) {
		this.opcmethod = opcmethod;
	}

	public String getOpcname() {
		return this.opcname;
	}

	public void setOpcname(String opcname) {
		this.opcname = opcname;
	}

	public long getOpcnamespace() {
		return this.opcnamespace;
	}

	public void setOpcnamespace(long opcnamespace) {
		this.opcnamespace = opcnamespace;
	}

	public long getOpcowner() {
		return this.opcowner;
	}

	public void setOpcowner(long opcowner) {
		this.opcowner = opcowner;
	}

}