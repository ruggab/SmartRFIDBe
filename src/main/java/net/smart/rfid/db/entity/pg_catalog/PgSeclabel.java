package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_seclabel" database table.
 * 
 */
@Entity
@Table(name="\"pg_seclabel\"")
@NamedQuery(name="PgSeclabel.findAll", query="SELECT p FROM PgSeclabel p")
public class PgSeclabel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"classoid\"")
	private long classoid;

	@Column(name="\"label\"")
	private String label;

	@Column(name="\"objoid\"")
	private long objoid;

	@Column(name="\"objsubid\"")
	private int objsubid;

	@Column(name="\"provider\"")
	private String provider;

	public PgSeclabel() {
	}

	public long getClassoid() {
		return this.classoid;
	}

	public void setClassoid(long classoid) {
		this.classoid = classoid;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
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

	public String getProvider() {
		return this.provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

}