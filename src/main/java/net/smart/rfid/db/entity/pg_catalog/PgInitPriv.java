package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_init_privs" database table.
 * 
 */
@Entity
@Table(name="\"pg_init_privs\"")
@NamedQuery(name="PgInitPriv.findAll", query="SELECT p FROM PgInitPriv p")
public class PgInitPriv implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"classoid\"")
	private long classoid;

	@Column(name="\"initprivs\"")
	private Object initprivs;

	@Column(name="\"objoid\"")
	private long objoid;

	@Column(name="\"objsubid\"")
	private int objsubid;

	@Column(name="\"privtype\"")
	private String privtype;

	public PgInitPriv() {
	}

	public long getClassoid() {
		return this.classoid;
	}

	public void setClassoid(long classoid) {
		this.classoid = classoid;
	}

	public Object getInitprivs() {
		return this.initprivs;
	}

	public void setInitprivs(Object initprivs) {
		this.initprivs = initprivs;
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

	public String getPrivtype() {
		return this.privtype;
	}

	public void setPrivtype(String privtype) {
		this.privtype = privtype;
	}

}