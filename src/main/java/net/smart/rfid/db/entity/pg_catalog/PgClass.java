package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_class" database table.
 * 
 */
@Entity
@Table(name="\"pg_class\"")
@NamedQuery(name="PgClass.findAll", query="SELECT p FROM PgClass p")
public class PgClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"oid\"")
	private long oid;

	@Column(name="\"relacl\"")
	private Object relacl;

	@Column(name="\"relallvisible\"")
	private int relallvisible;

	@Column(name="\"relam\"")
	private long relam;

	@Column(name="\"relchecks\"")
	private short relchecks;

	@Column(name="\"relfilenode\"")
	private long relfilenode;

	@Column(name="\"relforcerowsecurity\"")
	private boolean relforcerowsecurity;

	@Column(name="\"relfrozenxid\"")
	private Object relfrozenxid;

	@Column(name="\"relhasindex\"")
	private boolean relhasindex;

	@Column(name="\"relhasrules\"")
	private boolean relhasrules;

	@Column(name="\"relhassubclass\"")
	private boolean relhassubclass;

	@Column(name="\"relhastriggers\"")
	private boolean relhastriggers;

	@Column(name="\"relispartition\"")
	private boolean relispartition;

	@Column(name="\"relispopulated\"")
	private boolean relispopulated;

	@Column(name="\"relisshared\"")
	private boolean relisshared;

	@Column(name="\"relkind\"")
	private String relkind;

	@Column(name="\"relminmxid\"")
	private Object relminmxid;

	@Column(name="\"relname\"")
	private String relname;

	@Column(name="\"relnamespace\"")
	private long relnamespace;

	@Column(name="\"relnatts\"")
	private short relnatts;

	@Column(name="\"reloftype\"")
	private long reloftype;

	@Column(name="\"reloptions\"")
	private Object reloptions;

	@Column(name="\"relowner\"")
	private long relowner;

	@Column(name="\"relpages\"")
	private int relpages;

	@Column(name="\"relpartbound\"")
	private Object relpartbound;

	@Column(name="\"relpersistence\"")
	private String relpersistence;

	@Column(name="\"relreplident\"")
	private String relreplident;

	@Column(name="\"relrewrite\"")
	private long relrewrite;

	@Column(name="\"relrowsecurity\"")
	private boolean relrowsecurity;

	@Column(name="\"reltablespace\"")
	private long reltablespace;

	@Column(name="\"reltoastrelid\"")
	private long reltoastrelid;

	@Column(name="\"reltuples\"")
	private float reltuples;

	@Column(name="\"reltype\"")
	private long reltype;

	public PgClass() {
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public Object getRelacl() {
		return this.relacl;
	}

	public void setRelacl(Object relacl) {
		this.relacl = relacl;
	}

	public int getRelallvisible() {
		return this.relallvisible;
	}

	public void setRelallvisible(int relallvisible) {
		this.relallvisible = relallvisible;
	}

	public long getRelam() {
		return this.relam;
	}

	public void setRelam(long relam) {
		this.relam = relam;
	}

	public short getRelchecks() {
		return this.relchecks;
	}

	public void setRelchecks(short relchecks) {
		this.relchecks = relchecks;
	}

	public long getRelfilenode() {
		return this.relfilenode;
	}

	public void setRelfilenode(long relfilenode) {
		this.relfilenode = relfilenode;
	}

	public boolean getRelforcerowsecurity() {
		return this.relforcerowsecurity;
	}

	public void setRelforcerowsecurity(boolean relforcerowsecurity) {
		this.relforcerowsecurity = relforcerowsecurity;
	}

	public Object getRelfrozenxid() {
		return this.relfrozenxid;
	}

	public void setRelfrozenxid(Object relfrozenxid) {
		this.relfrozenxid = relfrozenxid;
	}

	public boolean getRelhasindex() {
		return this.relhasindex;
	}

	public void setRelhasindex(boolean relhasindex) {
		this.relhasindex = relhasindex;
	}

	public boolean getRelhasrules() {
		return this.relhasrules;
	}

	public void setRelhasrules(boolean relhasrules) {
		this.relhasrules = relhasrules;
	}

	public boolean getRelhassubclass() {
		return this.relhassubclass;
	}

	public void setRelhassubclass(boolean relhassubclass) {
		this.relhassubclass = relhassubclass;
	}

	public boolean getRelhastriggers() {
		return this.relhastriggers;
	}

	public void setRelhastriggers(boolean relhastriggers) {
		this.relhastriggers = relhastriggers;
	}

	public boolean getRelispartition() {
		return this.relispartition;
	}

	public void setRelispartition(boolean relispartition) {
		this.relispartition = relispartition;
	}

	public boolean getRelispopulated() {
		return this.relispopulated;
	}

	public void setRelispopulated(boolean relispopulated) {
		this.relispopulated = relispopulated;
	}

	public boolean getRelisshared() {
		return this.relisshared;
	}

	public void setRelisshared(boolean relisshared) {
		this.relisshared = relisshared;
	}

	public String getRelkind() {
		return this.relkind;
	}

	public void setRelkind(String relkind) {
		this.relkind = relkind;
	}

	public Object getRelminmxid() {
		return this.relminmxid;
	}

	public void setRelminmxid(Object relminmxid) {
		this.relminmxid = relminmxid;
	}

	public String getRelname() {
		return this.relname;
	}

	public void setRelname(String relname) {
		this.relname = relname;
	}

	public long getRelnamespace() {
		return this.relnamespace;
	}

	public void setRelnamespace(long relnamespace) {
		this.relnamespace = relnamespace;
	}

	public short getRelnatts() {
		return this.relnatts;
	}

	public void setRelnatts(short relnatts) {
		this.relnatts = relnatts;
	}

	public long getReloftype() {
		return this.reloftype;
	}

	public void setReloftype(long reloftype) {
		this.reloftype = reloftype;
	}

	public Object getReloptions() {
		return this.reloptions;
	}

	public void setReloptions(Object reloptions) {
		this.reloptions = reloptions;
	}

	public long getRelowner() {
		return this.relowner;
	}

	public void setRelowner(long relowner) {
		this.relowner = relowner;
	}

	public int getRelpages() {
		return this.relpages;
	}

	public void setRelpages(int relpages) {
		this.relpages = relpages;
	}

	public Object getRelpartbound() {
		return this.relpartbound;
	}

	public void setRelpartbound(Object relpartbound) {
		this.relpartbound = relpartbound;
	}

	public String getRelpersistence() {
		return this.relpersistence;
	}

	public void setRelpersistence(String relpersistence) {
		this.relpersistence = relpersistence;
	}

	public String getRelreplident() {
		return this.relreplident;
	}

	public void setRelreplident(String relreplident) {
		this.relreplident = relreplident;
	}

	public long getRelrewrite() {
		return this.relrewrite;
	}

	public void setRelrewrite(long relrewrite) {
		this.relrewrite = relrewrite;
	}

	public boolean getRelrowsecurity() {
		return this.relrowsecurity;
	}

	public void setRelrowsecurity(boolean relrowsecurity) {
		this.relrowsecurity = relrowsecurity;
	}

	public long getReltablespace() {
		return this.reltablespace;
	}

	public void setReltablespace(long reltablespace) {
		this.reltablespace = reltablespace;
	}

	public long getReltoastrelid() {
		return this.reltoastrelid;
	}

	public void setReltoastrelid(long reltoastrelid) {
		this.reltoastrelid = reltoastrelid;
	}

	public float getReltuples() {
		return this.reltuples;
	}

	public void setReltuples(float reltuples) {
		this.reltuples = reltuples;
	}

	public long getReltype() {
		return this.reltype;
	}

	public void setReltype(long reltype) {
		this.reltype = reltype;
	}

}