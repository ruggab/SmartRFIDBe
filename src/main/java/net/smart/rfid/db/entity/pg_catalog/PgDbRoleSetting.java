package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_db_role_setting" database table.
 * 
 */
@Entity
@Table(name="\"pg_db_role_setting\"")
@NamedQuery(name="PgDbRoleSetting.findAll", query="SELECT p FROM PgDbRoleSetting p")
public class PgDbRoleSetting implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"setconfig\"")
	private Object setconfig;

	@Column(name="\"setdatabase\"")
	private long setdatabase;

	@Column(name="\"setrole\"")
	private long setrole;

	public PgDbRoleSetting() {
	}

	public Object getSetconfig() {
		return this.setconfig;
	}

	public void setSetconfig(Object setconfig) {
		this.setconfig = setconfig;
	}

	public long getSetdatabase() {
		return this.setdatabase;
	}

	public void setSetdatabase(long setdatabase) {
		this.setdatabase = setdatabase;
	}

	public long getSetrole() {
		return this.setrole;
	}

	public void setSetrole(long setrole) {
		this.setrole = setrole;
	}

}