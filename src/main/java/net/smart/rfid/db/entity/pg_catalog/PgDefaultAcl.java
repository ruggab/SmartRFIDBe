package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_default_acl" database table.
 * 
 */
@Entity
@Table(name="\"pg_default_acl\"")
@NamedQuery(name="PgDefaultAcl.findAll", query="SELECT p FROM PgDefaultAcl p")
public class PgDefaultAcl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"defaclacl\"")
	private Object defaclacl;

	@Column(name="\"defaclnamespace\"")
	private long defaclnamespace;

	@Column(name="\"defaclobjtype\"")
	private String defaclobjtype;

	@Column(name="\"defaclrole\"")
	private long defaclrole;

	@Column(name="\"oid\"")
	private long oid;

	public PgDefaultAcl() {
	}

	public Object getDefaclacl() {
		return this.defaclacl;
	}

	public void setDefaclacl(Object defaclacl) {
		this.defaclacl = defaclacl;
	}

	public long getDefaclnamespace() {
		return this.defaclnamespace;
	}

	public void setDefaclnamespace(long defaclnamespace) {
		this.defaclnamespace = defaclnamespace;
	}

	public String getDefaclobjtype() {
		return this.defaclobjtype;
	}

	public void setDefaclobjtype(String defaclobjtype) {
		this.defaclobjtype = defaclobjtype;
	}

	public long getDefaclrole() {
		return this.defaclrole;
	}

	public void setDefaclrole(long defaclrole) {
		this.defaclrole = defaclrole;
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

}