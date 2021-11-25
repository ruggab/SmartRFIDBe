package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "pg_authid" database table.
 * 
 */
@Entity
@Table(name="\"pg_authid\"")
@NamedQuery(name="PgAuthid.findAll", query="SELECT p FROM PgAuthid p")
public class PgAuthid implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"oid\"")
	private long oid;

	@Column(name="\"rolbypassrls\"")
	private boolean rolbypassrls;

	@Column(name="\"rolcanlogin\"")
	private boolean rolcanlogin;

	@Column(name="\"rolconnlimit\"")
	private int rolconnlimit;

	@Column(name="\"rolcreatedb\"")
	private boolean rolcreatedb;

	@Column(name="\"rolcreaterole\"")
	private boolean rolcreaterole;

	@Column(name="\"rolinherit\"")
	private boolean rolinherit;

	@Column(name="\"rolname\"")
	private String rolname;

	@Column(name="\"rolpassword\"")
	private String rolpassword;

	@Column(name="\"rolreplication\"")
	private boolean rolreplication;

	@Column(name="\"rolsuper\"")
	private boolean rolsuper;

	@Column(name="\"rolvaliduntil\"")
	private Timestamp rolvaliduntil;

	public PgAuthid() {
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public boolean getRolbypassrls() {
		return this.rolbypassrls;
	}

	public void setRolbypassrls(boolean rolbypassrls) {
		this.rolbypassrls = rolbypassrls;
	}

	public boolean getRolcanlogin() {
		return this.rolcanlogin;
	}

	public void setRolcanlogin(boolean rolcanlogin) {
		this.rolcanlogin = rolcanlogin;
	}

	public int getRolconnlimit() {
		return this.rolconnlimit;
	}

	public void setRolconnlimit(int rolconnlimit) {
		this.rolconnlimit = rolconnlimit;
	}

	public boolean getRolcreatedb() {
		return this.rolcreatedb;
	}

	public void setRolcreatedb(boolean rolcreatedb) {
		this.rolcreatedb = rolcreatedb;
	}

	public boolean getRolcreaterole() {
		return this.rolcreaterole;
	}

	public void setRolcreaterole(boolean rolcreaterole) {
		this.rolcreaterole = rolcreaterole;
	}

	public boolean getRolinherit() {
		return this.rolinherit;
	}

	public void setRolinherit(boolean rolinherit) {
		this.rolinherit = rolinherit;
	}

	public String getRolname() {
		return this.rolname;
	}

	public void setRolname(String rolname) {
		this.rolname = rolname;
	}

	public String getRolpassword() {
		return this.rolpassword;
	}

	public void setRolpassword(String rolpassword) {
		this.rolpassword = rolpassword;
	}

	public boolean getRolreplication() {
		return this.rolreplication;
	}

	public void setRolreplication(boolean rolreplication) {
		this.rolreplication = rolreplication;
	}

	public boolean getRolsuper() {
		return this.rolsuper;
	}

	public void setRolsuper(boolean rolsuper) {
		this.rolsuper = rolsuper;
	}

	public Timestamp getRolvaliduntil() {
		return this.rolvaliduntil;
	}

	public void setRolvaliduntil(Timestamp rolvaliduntil) {
		this.rolvaliduntil = rolvaliduntil;
	}

}