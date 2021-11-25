package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_constraint" database table.
 * 
 */
@Entity
@Table(name="\"pg_constraint\"")
@NamedQuery(name="PgConstraint.findAll", query="SELECT p FROM PgConstraint p")
public class PgConstraint implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"conbin\"")
	private Object conbin;

	@Column(name="\"condeferrable\"")
	private boolean condeferrable;

	@Column(name="\"condeferred\"")
	private boolean condeferred;

	@Column(name="\"conexclop\"")
	private Object conexclop;

	@Column(name="\"confdeltype\"")
	private String confdeltype;

	@Column(name="\"conffeqop\"")
	private Object conffeqop;

	@Column(name="\"confkey\"")
	private Object confkey;

	@Column(name="\"confmatchtype\"")
	private String confmatchtype;

	@Column(name="\"confrelid\"")
	private long confrelid;

	@Column(name="\"confupdtype\"")
	private String confupdtype;

	@Column(name="\"conindid\"")
	private long conindid;

	@Column(name="\"coninhcount\"")
	private int coninhcount;

	@Column(name="\"conislocal\"")
	private boolean conislocal;

	@Column(name="\"conkey\"")
	private Object conkey;

	@Column(name="\"conname\"")
	private String conname;

	@Column(name="\"connamespace\"")
	private long connamespace;

	@Column(name="\"connoinherit\"")
	private boolean connoinherit;

	@Column(name="\"conparentid\"")
	private long conparentid;

	@Column(name="\"conpfeqop\"")
	private Object conpfeqop;

	@Column(name="\"conppeqop\"")
	private Object conppeqop;

	@Column(name="\"conrelid\"")
	private long conrelid;

	@Column(name="\"contype\"")
	private String contype;

	@Column(name="\"contypid\"")
	private long contypid;

	@Column(name="\"convalidated\"")
	private boolean convalidated;

	@Column(name="\"oid\"")
	private long oid;

	public PgConstraint() {
	}

	public Object getConbin() {
		return this.conbin;
	}

	public void setConbin(Object conbin) {
		this.conbin = conbin;
	}

	public boolean getCondeferrable() {
		return this.condeferrable;
	}

	public void setCondeferrable(boolean condeferrable) {
		this.condeferrable = condeferrable;
	}

	public boolean getCondeferred() {
		return this.condeferred;
	}

	public void setCondeferred(boolean condeferred) {
		this.condeferred = condeferred;
	}

	public Object getConexclop() {
		return this.conexclop;
	}

	public void setConexclop(Object conexclop) {
		this.conexclop = conexclop;
	}

	public String getConfdeltype() {
		return this.confdeltype;
	}

	public void setConfdeltype(String confdeltype) {
		this.confdeltype = confdeltype;
	}

	public Object getConffeqop() {
		return this.conffeqop;
	}

	public void setConffeqop(Object conffeqop) {
		this.conffeqop = conffeqop;
	}

	public Object getConfkey() {
		return this.confkey;
	}

	public void setConfkey(Object confkey) {
		this.confkey = confkey;
	}

	public String getConfmatchtype() {
		return this.confmatchtype;
	}

	public void setConfmatchtype(String confmatchtype) {
		this.confmatchtype = confmatchtype;
	}

	public long getConfrelid() {
		return this.confrelid;
	}

	public void setConfrelid(long confrelid) {
		this.confrelid = confrelid;
	}

	public String getConfupdtype() {
		return this.confupdtype;
	}

	public void setConfupdtype(String confupdtype) {
		this.confupdtype = confupdtype;
	}

	public long getConindid() {
		return this.conindid;
	}

	public void setConindid(long conindid) {
		this.conindid = conindid;
	}

	public int getConinhcount() {
		return this.coninhcount;
	}

	public void setConinhcount(int coninhcount) {
		this.coninhcount = coninhcount;
	}

	public boolean getConislocal() {
		return this.conislocal;
	}

	public void setConislocal(boolean conislocal) {
		this.conislocal = conislocal;
	}

	public Object getConkey() {
		return this.conkey;
	}

	public void setConkey(Object conkey) {
		this.conkey = conkey;
	}

	public String getConname() {
		return this.conname;
	}

	public void setConname(String conname) {
		this.conname = conname;
	}

	public long getConnamespace() {
		return this.connamespace;
	}

	public void setConnamespace(long connamespace) {
		this.connamespace = connamespace;
	}

	public boolean getConnoinherit() {
		return this.connoinherit;
	}

	public void setConnoinherit(boolean connoinherit) {
		this.connoinherit = connoinherit;
	}

	public long getConparentid() {
		return this.conparentid;
	}

	public void setConparentid(long conparentid) {
		this.conparentid = conparentid;
	}

	public Object getConpfeqop() {
		return this.conpfeqop;
	}

	public void setConpfeqop(Object conpfeqop) {
		this.conpfeqop = conpfeqop;
	}

	public Object getConppeqop() {
		return this.conppeqop;
	}

	public void setConppeqop(Object conppeqop) {
		this.conppeqop = conppeqop;
	}

	public long getConrelid() {
		return this.conrelid;
	}

	public void setConrelid(long conrelid) {
		this.conrelid = conrelid;
	}

	public String getContype() {
		return this.contype;
	}

	public void setContype(String contype) {
		this.contype = contype;
	}

	public long getContypid() {
		return this.contypid;
	}

	public void setContypid(long contypid) {
		this.contypid = contypid;
	}

	public boolean getConvalidated() {
		return this.convalidated;
	}

	public void setConvalidated(boolean convalidated) {
		this.convalidated = convalidated;
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

}