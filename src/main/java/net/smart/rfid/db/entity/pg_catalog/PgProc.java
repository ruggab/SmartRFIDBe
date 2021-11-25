package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_proc" database table.
 * 
 */
@Entity
@Table(name="\"pg_proc\"")
@NamedQuery(name="PgProc.findAll", query="SELECT p FROM PgProc p")
public class PgProc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"oid\"")
	private long oid;

	@Column(name="\"proacl\"")
	private Object proacl;

	@Column(name="\"proallargtypes\"")
	private Object proallargtypes;

	@Column(name="\"proargdefaults\"")
	private Object proargdefaults;

	@Column(name="\"proargmodes\"")
	private Object proargmodes;

	@Column(name="\"proargnames\"")
	private Object proargnames;

	@Column(name="\"proargtypes\"")
	private Object proargtypes;

	@Column(name="\"probin\"")
	private String probin;

	@Column(name="\"proconfig\"")
	private Object proconfig;

	@Column(name="\"procost\"")
	private float procost;

	@Column(name="\"proisstrict\"")
	private boolean proisstrict;

	@Column(name="\"prokind\"")
	private String prokind;

	@Column(name="\"prolang\"")
	private long prolang;

	@Column(name="\"proleakproof\"")
	private boolean proleakproof;

	@Column(name="\"proname\"")
	private String proname;

	@Column(name="\"pronamespace\"")
	private long pronamespace;

	@Column(name="\"pronargdefaults\"")
	private short pronargdefaults;

	@Column(name="\"pronargs\"")
	private short pronargs;

	@Column(name="\"proowner\"")
	private long proowner;

	@Column(name="\"proparallel\"")
	private String proparallel;

	@Column(name="\"proretset\"")
	private boolean proretset;

	@Column(name="\"prorettype\"")
	private long prorettype;

	@Column(name="\"prorows\"")
	private float prorows;

	@Column(name="\"prosecdef\"")
	private boolean prosecdef;

	@Column(name="\"prosrc\"")
	private String prosrc;

	@Column(name="\"prosupport\"")
	private Object prosupport;

	@Column(name="\"protrftypes\"")
	private Object protrftypes;

	@Column(name="\"provariadic\"")
	private long provariadic;

	@Column(name="\"provolatile\"")
	private String provolatile;

	public PgProc() {
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public Object getProacl() {
		return this.proacl;
	}

	public void setProacl(Object proacl) {
		this.proacl = proacl;
	}

	public Object getProallargtypes() {
		return this.proallargtypes;
	}

	public void setProallargtypes(Object proallargtypes) {
		this.proallargtypes = proallargtypes;
	}

	public Object getProargdefaults() {
		return this.proargdefaults;
	}

	public void setProargdefaults(Object proargdefaults) {
		this.proargdefaults = proargdefaults;
	}

	public Object getProargmodes() {
		return this.proargmodes;
	}

	public void setProargmodes(Object proargmodes) {
		this.proargmodes = proargmodes;
	}

	public Object getProargnames() {
		return this.proargnames;
	}

	public void setProargnames(Object proargnames) {
		this.proargnames = proargnames;
	}

	public Object getProargtypes() {
		return this.proargtypes;
	}

	public void setProargtypes(Object proargtypes) {
		this.proargtypes = proargtypes;
	}

	public String getProbin() {
		return this.probin;
	}

	public void setProbin(String probin) {
		this.probin = probin;
	}

	public Object getProconfig() {
		return this.proconfig;
	}

	public void setProconfig(Object proconfig) {
		this.proconfig = proconfig;
	}

	public float getProcost() {
		return this.procost;
	}

	public void setProcost(float procost) {
		this.procost = procost;
	}

	public boolean getProisstrict() {
		return this.proisstrict;
	}

	public void setProisstrict(boolean proisstrict) {
		this.proisstrict = proisstrict;
	}

	public String getProkind() {
		return this.prokind;
	}

	public void setProkind(String prokind) {
		this.prokind = prokind;
	}

	public long getProlang() {
		return this.prolang;
	}

	public void setProlang(long prolang) {
		this.prolang = prolang;
	}

	public boolean getProleakproof() {
		return this.proleakproof;
	}

	public void setProleakproof(boolean proleakproof) {
		this.proleakproof = proleakproof;
	}

	public String getProname() {
		return this.proname;
	}

	public void setProname(String proname) {
		this.proname = proname;
	}

	public long getPronamespace() {
		return this.pronamespace;
	}

	public void setPronamespace(long pronamespace) {
		this.pronamespace = pronamespace;
	}

	public short getPronargdefaults() {
		return this.pronargdefaults;
	}

	public void setPronargdefaults(short pronargdefaults) {
		this.pronargdefaults = pronargdefaults;
	}

	public short getPronargs() {
		return this.pronargs;
	}

	public void setPronargs(short pronargs) {
		this.pronargs = pronargs;
	}

	public long getProowner() {
		return this.proowner;
	}

	public void setProowner(long proowner) {
		this.proowner = proowner;
	}

	public String getProparallel() {
		return this.proparallel;
	}

	public void setProparallel(String proparallel) {
		this.proparallel = proparallel;
	}

	public boolean getProretset() {
		return this.proretset;
	}

	public void setProretset(boolean proretset) {
		this.proretset = proretset;
	}

	public long getProrettype() {
		return this.prorettype;
	}

	public void setProrettype(long prorettype) {
		this.prorettype = prorettype;
	}

	public float getProrows() {
		return this.prorows;
	}

	public void setProrows(float prorows) {
		this.prorows = prorows;
	}

	public boolean getProsecdef() {
		return this.prosecdef;
	}

	public void setProsecdef(boolean prosecdef) {
		this.prosecdef = prosecdef;
	}

	public String getProsrc() {
		return this.prosrc;
	}

	public void setProsrc(String prosrc) {
		this.prosrc = prosrc;
	}

	public Object getProsupport() {
		return this.prosupport;
	}

	public void setProsupport(Object prosupport) {
		this.prosupport = prosupport;
	}

	public Object getProtrftypes() {
		return this.protrftypes;
	}

	public void setProtrftypes(Object protrftypes) {
		this.protrftypes = protrftypes;
	}

	public long getProvariadic() {
		return this.provariadic;
	}

	public void setProvariadic(long provariadic) {
		this.provariadic = provariadic;
	}

	public String getProvolatile() {
		return this.provolatile;
	}

	public void setProvolatile(String provolatile) {
		this.provolatile = provolatile;
	}

}