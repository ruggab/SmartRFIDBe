package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_foreign_server" database table.
 * 
 */
@Entity
@Table(name="\"pg_foreign_server\"")
@NamedQuery(name="PgForeignServer.findAll", query="SELECT p FROM PgForeignServer p")
public class PgForeignServer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"oid\"")
	private long oid;

	@Column(name="\"srvacl\"")
	private Object srvacl;

	@Column(name="\"srvfdw\"")
	private long srvfdw;

	@Column(name="\"srvname\"")
	private String srvname;

	@Column(name="\"srvoptions\"")
	private Object srvoptions;

	@Column(name="\"srvowner\"")
	private long srvowner;

	@Column(name="\"srvtype\"")
	private String srvtype;

	@Column(name="\"srvversion\"")
	private String srvversion;

	public PgForeignServer() {
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public Object getSrvacl() {
		return this.srvacl;
	}

	public void setSrvacl(Object srvacl) {
		this.srvacl = srvacl;
	}

	public long getSrvfdw() {
		return this.srvfdw;
	}

	public void setSrvfdw(long srvfdw) {
		this.srvfdw = srvfdw;
	}

	public String getSrvname() {
		return this.srvname;
	}

	public void setSrvname(String srvname) {
		this.srvname = srvname;
	}

	public Object getSrvoptions() {
		return this.srvoptions;
	}

	public void setSrvoptions(Object srvoptions) {
		this.srvoptions = srvoptions;
	}

	public long getSrvowner() {
		return this.srvowner;
	}

	public void setSrvowner(long srvowner) {
		this.srvowner = srvowner;
	}

	public String getSrvtype() {
		return this.srvtype;
	}

	public void setSrvtype(String srvtype) {
		this.srvtype = srvtype;
	}

	public String getSrvversion() {
		return this.srvversion;
	}

	public void setSrvversion(String srvversion) {
		this.srvversion = srvversion;
	}

}