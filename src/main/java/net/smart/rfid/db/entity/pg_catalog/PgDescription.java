package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_description" database table.
 * 
 */
@Entity
@Table(name="\"pg_description\"")
@NamedQuery(name="PgDescription.findAll", query="SELECT p FROM PgDescription p")
public class PgDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"classoid\"")
	private long classoid;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"objoid\"")
	private long objoid;

	@Column(name="\"objsubid\"")
	private int objsubid;

	public PgDescription() {
	}

	public long getClassoid() {
		return this.classoid;
	}

	public void setClassoid(long classoid) {
		this.classoid = classoid;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getObjoid() {
		return this.objoid;
	}

	public void setObjoid(long objoid) {
		this.objoid = objoid;
	}

	public int getObjsubid() {
		return this.objsubid;
	}

	public void setObjsubid(int objsubid) {
		this.objsubid = objsubid;
	}

}