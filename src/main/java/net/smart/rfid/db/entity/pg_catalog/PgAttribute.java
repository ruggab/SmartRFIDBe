package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_attribute" database table.
 * 
 */
@Entity
@Table(name="\"pg_attribute\"")
@NamedQuery(name="PgAttribute.findAll", query="SELECT p FROM PgAttribute p")
public class PgAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"attacl\"")
	private Object attacl;

	@Column(name="\"attalign\"")
	private String attalign;

	@Column(name="\"attbyval\"")
	private boolean attbyval;

	@Column(name="\"attcacheoff\"")
	private int attcacheoff;

	@Column(name="\"attcollation\"")
	private long attcollation;

	@Column(name="\"attfdwoptions\"")
	private Object attfdwoptions;

	@Column(name="\"attgenerated\"")
	private String attgenerated;

	@Column(name="\"atthasdef\"")
	private boolean atthasdef;

	@Column(name="\"atthasmissing\"")
	private boolean atthasmissing;

	@Column(name="\"attidentity\"")
	private String attidentity;

	@Column(name="\"attinhcount\"")
	private int attinhcount;

	@Column(name="\"attisdropped\"")
	private boolean attisdropped;

	@Column(name="\"attislocal\"")
	private boolean attislocal;

	@Column(name="\"attlen\"")
	private short attlen;

	@Column(name="\"attmissingval\"")
	private Object attmissingval;

	@Column(name="\"attname\"")
	private String attname;

	@Column(name="\"attndims\"")
	private int attndims;

	@Column(name="\"attnotnull\"")
	private boolean attnotnull;

	@Column(name="\"attnum\"")
	private short attnum;

	@Column(name="\"attoptions\"")
	private Object attoptions;

	@Column(name="\"attrelid\"")
	private long attrelid;

	@Column(name="\"attstattarget\"")
	private int attstattarget;

	@Column(name="\"attstorage\"")
	private String attstorage;

	@Column(name="\"atttypid\"")
	private long atttypid;

	@Column(name="\"atttypmod\"")
	private int atttypmod;

	public PgAttribute() {
	}

	public Object getAttacl() {
		return this.attacl;
	}

	public void setAttacl(Object attacl) {
		this.attacl = attacl;
	}

	public String getAttalign() {
		return this.attalign;
	}

	public void setAttalign(String attalign) {
		this.attalign = attalign;
	}

	public boolean getAttbyval() {
		return this.attbyval;
	}

	public void setAttbyval(boolean attbyval) {
		this.attbyval = attbyval;
	}

	public int getAttcacheoff() {
		return this.attcacheoff;
	}

	public void setAttcacheoff(int attcacheoff) {
		this.attcacheoff = attcacheoff;
	}

	public long getAttcollation() {
		return this.attcollation;
	}

	public void setAttcollation(long attcollation) {
		this.attcollation = attcollation;
	}

	public Object getAttfdwoptions() {
		return this.attfdwoptions;
	}

	public void setAttfdwoptions(Object attfdwoptions) {
		this.attfdwoptions = attfdwoptions;
	}

	public String getAttgenerated() {
		return this.attgenerated;
	}

	public void setAttgenerated(String attgenerated) {
		this.attgenerated = attgenerated;
	}

	public boolean getAtthasdef() {
		return this.atthasdef;
	}

	public void setAtthasdef(boolean atthasdef) {
		this.atthasdef = atthasdef;
	}

	public boolean getAtthasmissing() {
		return this.atthasmissing;
	}

	public void setAtthasmissing(boolean atthasmissing) {
		this.atthasmissing = atthasmissing;
	}

	public String getAttidentity() {
		return this.attidentity;
	}

	public void setAttidentity(String attidentity) {
		this.attidentity = attidentity;
	}

	public int getAttinhcount() {
		return this.attinhcount;
	}

	public void setAttinhcount(int attinhcount) {
		this.attinhcount = attinhcount;
	}

	public boolean getAttisdropped() {
		return this.attisdropped;
	}

	public void setAttisdropped(boolean attisdropped) {
		this.attisdropped = attisdropped;
	}

	public boolean getAttislocal() {
		return this.attislocal;
	}

	public void setAttislocal(boolean attislocal) {
		this.attislocal = attislocal;
	}

	public short getAttlen() {
		return this.attlen;
	}

	public void setAttlen(short attlen) {
		this.attlen = attlen;
	}

	public Object getAttmissingval() {
		return this.attmissingval;
	}

	public void setAttmissingval(Object attmissingval) {
		this.attmissingval = attmissingval;
	}

	public String getAttname() {
		return this.attname;
	}

	public void setAttname(String attname) {
		this.attname = attname;
	}

	public int getAttndims() {
		return this.attndims;
	}

	public void setAttndims(int attndims) {
		this.attndims = attndims;
	}

	public boolean getAttnotnull() {
		return this.attnotnull;
	}

	public void setAttnotnull(boolean attnotnull) {
		this.attnotnull = attnotnull;
	}

	public short getAttnum() {
		return this.attnum;
	}

	public void setAttnum(short attnum) {
		this.attnum = attnum;
	}

	public Object getAttoptions() {
		return this.attoptions;
	}

	public void setAttoptions(Object attoptions) {
		this.attoptions = attoptions;
	}

	public long getAttrelid() {
		return this.attrelid;
	}

	public void setAttrelid(long attrelid) {
		this.attrelid = attrelid;
	}

	public int getAttstattarget() {
		return this.attstattarget;
	}

	public void setAttstattarget(int attstattarget) {
		this.attstattarget = attstattarget;
	}

	public String getAttstorage() {
		return this.attstorage;
	}

	public void setAttstorage(String attstorage) {
		this.attstorage = attstorage;
	}

	public long getAtttypid() {
		return this.atttypid;
	}

	public void setAtttypid(long atttypid) {
		this.atttypid = atttypid;
	}

	public int getAtttypmod() {
		return this.atttypmod;
	}

	public void setAtttypmod(int atttypmod) {
		this.atttypmod = atttypmod;
	}

}