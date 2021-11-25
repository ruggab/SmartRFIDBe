package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_foreign_data_wrapper" database table.
 * 
 */
@Entity
@Table(name="\"pg_foreign_data_wrapper\"")
@NamedQuery(name="PgForeignDataWrapper.findAll", query="SELECT p FROM PgForeignDataWrapper p")
public class PgForeignDataWrapper implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"fdwacl\"")
	private Object fdwacl;

	@Column(name="\"fdwhandler\"")
	private long fdwhandler;

	@Column(name="\"fdwname\"")
	private String fdwname;

	@Column(name="\"fdwoptions\"")
	private Object fdwoptions;

	@Column(name="\"fdwowner\"")
	private long fdwowner;

	@Column(name="\"fdwvalidator\"")
	private long fdwvalidator;

	@Column(name="\"oid\"")
	private long oid;

	public PgForeignDataWrapper() {
	}

	public Object getFdwacl() {
		return this.fdwacl;
	}

	public void setFdwacl(Object fdwacl) {
		this.fdwacl = fdwacl;
	}

	public long getFdwhandler() {
		return this.fdwhandler;
	}

	public void setFdwhandler(long fdwhandler) {
		this.fdwhandler = fdwhandler;
	}

	public String getFdwname() {
		return this.fdwname;
	}

	public void setFdwname(String fdwname) {
		this.fdwname = fdwname;
	}

	public Object getFdwoptions() {
		return this.fdwoptions;
	}

	public void setFdwoptions(Object fdwoptions) {
		this.fdwoptions = fdwoptions;
	}

	public long getFdwowner() {
		return this.fdwowner;
	}

	public void setFdwowner(long fdwowner) {
		this.fdwowner = fdwowner;
	}

	public long getFdwvalidator() {
		return this.fdwvalidator;
	}

	public void setFdwvalidator(long fdwvalidator) {
		this.fdwvalidator = fdwvalidator;
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

}