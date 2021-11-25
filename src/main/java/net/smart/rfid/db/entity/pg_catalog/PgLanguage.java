package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_language" database table.
 * 
 */
@Entity
@Table(name="\"pg_language\"")
@NamedQuery(name="PgLanguage.findAll", query="SELECT p FROM PgLanguage p")
public class PgLanguage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"lanacl\"")
	private Object lanacl;

	@Column(name="\"laninline\"")
	private long laninline;

	@Column(name="\"lanispl\"")
	private boolean lanispl;

	@Column(name="\"lanname\"")
	private String lanname;

	@Column(name="\"lanowner\"")
	private long lanowner;

	@Column(name="\"lanplcallfoid\"")
	private long lanplcallfoid;

	@Column(name="\"lanpltrusted\"")
	private boolean lanpltrusted;

	@Column(name="\"lanvalidator\"")
	private long lanvalidator;

	@Column(name="\"oid\"")
	private long oid;

	public PgLanguage() {
	}

	public Object getLanacl() {
		return this.lanacl;
	}

	public void setLanacl(Object lanacl) {
		this.lanacl = lanacl;
	}

	public long getLaninline() {
		return this.laninline;
	}

	public void setLaninline(long laninline) {
		this.laninline = laninline;
	}

	public boolean getLanispl() {
		return this.lanispl;
	}

	public void setLanispl(boolean lanispl) {
		this.lanispl = lanispl;
	}

	public String getLanname() {
		return this.lanname;
	}

	public void setLanname(String lanname) {
		this.lanname = lanname;
	}

	public long getLanowner() {
		return this.lanowner;
	}

	public void setLanowner(long lanowner) {
		this.lanowner = lanowner;
	}

	public long getLanplcallfoid() {
		return this.lanplcallfoid;
	}

	public void setLanplcallfoid(long lanplcallfoid) {
		this.lanplcallfoid = lanplcallfoid;
	}

	public boolean getLanpltrusted() {
		return this.lanpltrusted;
	}

	public void setLanpltrusted(boolean lanpltrusted) {
		this.lanpltrusted = lanpltrusted;
	}

	public long getLanvalidator() {
		return this.lanvalidator;
	}

	public void setLanvalidator(long lanvalidator) {
		this.lanvalidator = lanvalidator;
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

}