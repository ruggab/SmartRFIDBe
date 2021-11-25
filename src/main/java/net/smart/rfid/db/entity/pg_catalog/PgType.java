package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_type" database table.
 * 
 */
@Entity
@Table(name="\"pg_type\"")
@NamedQuery(name="PgType.findAll", query="SELECT p FROM PgType p")
public class PgType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"oid\"")
	private long oid;

	@Column(name="\"typacl\"")
	private Object typacl;

	@Column(name="\"typalign\"")
	private String typalign;

	@Column(name="\"typanalyze\"")
	private Object typanalyze;

	@Column(name="\"typarray\"")
	private long typarray;

	@Column(name="\"typbasetype\"")
	private long typbasetype;

	@Column(name="\"typbyval\"")
	private boolean typbyval;

	@Column(name="\"typcategory\"")
	private String typcategory;

	@Column(name="\"typcollation\"")
	private long typcollation;

	@Column(name="\"typdefault\"")
	private String typdefault;

	@Column(name="\"typdefaultbin\"")
	private Object typdefaultbin;

	@Column(name="\"typdelim\"")
	private String typdelim;

	@Column(name="\"typelem\"")
	private long typelem;

	@Column(name="\"typinput\"")
	private Object typinput;

	@Column(name="\"typisdefined\"")
	private boolean typisdefined;

	@Column(name="\"typispreferred\"")
	private boolean typispreferred;

	@Column(name="\"typlen\"")
	private short typlen;

	@Column(name="\"typmodin\"")
	private Object typmodin;

	@Column(name="\"typmodout\"")
	private Object typmodout;

	@Column(name="\"typname\"")
	private String typname;

	@Column(name="\"typnamespace\"")
	private long typnamespace;

	@Column(name="\"typndims\"")
	private int typndims;

	@Column(name="\"typnotnull\"")
	private boolean typnotnull;

	@Column(name="\"typoutput\"")
	private Object typoutput;

	@Column(name="\"typowner\"")
	private long typowner;

	@Column(name="\"typreceive\"")
	private Object typreceive;

	@Column(name="\"typrelid\"")
	private long typrelid;

	@Column(name="\"typsend\"")
	private Object typsend;

	@Column(name="\"typstorage\"")
	private String typstorage;

	@Column(name="\"typtype\"")
	private String typtype;

	@Column(name="\"typtypmod\"")
	private int typtypmod;

	public PgType() {
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public Object getTypacl() {
		return this.typacl;
	}

	public void setTypacl(Object typacl) {
		this.typacl = typacl;
	}

	public String getTypalign() {
		return this.typalign;
	}

	public void setTypalign(String typalign) {
		this.typalign = typalign;
	}

	public Object getTypanalyze() {
		return this.typanalyze;
	}

	public void setTypanalyze(Object typanalyze) {
		this.typanalyze = typanalyze;
	}

	public long getTyparray() {
		return this.typarray;
	}

	public void setTyparray(long typarray) {
		this.typarray = typarray;
	}

	public long getTypbasetype() {
		return this.typbasetype;
	}

	public void setTypbasetype(long typbasetype) {
		this.typbasetype = typbasetype;
	}

	public boolean getTypbyval() {
		return this.typbyval;
	}

	public void setTypbyval(boolean typbyval) {
		this.typbyval = typbyval;
	}

	public String getTypcategory() {
		return this.typcategory;
	}

	public void setTypcategory(String typcategory) {
		this.typcategory = typcategory;
	}

	public long getTypcollation() {
		return this.typcollation;
	}

	public void setTypcollation(long typcollation) {
		this.typcollation = typcollation;
	}

	public String getTypdefault() {
		return this.typdefault;
	}

	public void setTypdefault(String typdefault) {
		this.typdefault = typdefault;
	}

	public Object getTypdefaultbin() {
		return this.typdefaultbin;
	}

	public void setTypdefaultbin(Object typdefaultbin) {
		this.typdefaultbin = typdefaultbin;
	}

	public String getTypdelim() {
		return this.typdelim;
	}

	public void setTypdelim(String typdelim) {
		this.typdelim = typdelim;
	}

	public long getTypelem() {
		return this.typelem;
	}

	public void setTypelem(long typelem) {
		this.typelem = typelem;
	}

	public Object getTypinput() {
		return this.typinput;
	}

	public void setTypinput(Object typinput) {
		this.typinput = typinput;
	}

	public boolean getTypisdefined() {
		return this.typisdefined;
	}

	public void setTypisdefined(boolean typisdefined) {
		this.typisdefined = typisdefined;
	}

	public boolean getTypispreferred() {
		return this.typispreferred;
	}

	public void setTypispreferred(boolean typispreferred) {
		this.typispreferred = typispreferred;
	}

	public short getTyplen() {
		return this.typlen;
	}

	public void setTyplen(short typlen) {
		this.typlen = typlen;
	}

	public Object getTypmodin() {
		return this.typmodin;
	}

	public void setTypmodin(Object typmodin) {
		this.typmodin = typmodin;
	}

	public Object getTypmodout() {
		return this.typmodout;
	}

	public void setTypmodout(Object typmodout) {
		this.typmodout = typmodout;
	}

	public String getTypname() {
		return this.typname;
	}

	public void setTypname(String typname) {
		this.typname = typname;
	}

	public long getTypnamespace() {
		return this.typnamespace;
	}

	public void setTypnamespace(long typnamespace) {
		this.typnamespace = typnamespace;
	}

	public int getTypndims() {
		return this.typndims;
	}

	public void setTypndims(int typndims) {
		this.typndims = typndims;
	}

	public boolean getTypnotnull() {
		return this.typnotnull;
	}

	public void setTypnotnull(boolean typnotnull) {
		this.typnotnull = typnotnull;
	}

	public Object getTypoutput() {
		return this.typoutput;
	}

	public void setTypoutput(Object typoutput) {
		this.typoutput = typoutput;
	}

	public long getTypowner() {
		return this.typowner;
	}

	public void setTypowner(long typowner) {
		this.typowner = typowner;
	}

	public Object getTypreceive() {
		return this.typreceive;
	}

	public void setTypreceive(Object typreceive) {
		this.typreceive = typreceive;
	}

	public long getTyprelid() {
		return this.typrelid;
	}

	public void setTyprelid(long typrelid) {
		this.typrelid = typrelid;
	}

	public Object getTypsend() {
		return this.typsend;
	}

	public void setTypsend(Object typsend) {
		this.typsend = typsend;
	}

	public String getTypstorage() {
		return this.typstorage;
	}

	public void setTypstorage(String typstorage) {
		this.typstorage = typstorage;
	}

	public String getTyptype() {
		return this.typtype;
	}

	public void setTyptype(String typtype) {
		this.typtype = typtype;
	}

	public int getTyptypmod() {
		return this.typtypmod;
	}

	public void setTyptypmod(int typtypmod) {
		this.typtypmod = typtypmod;
	}

}