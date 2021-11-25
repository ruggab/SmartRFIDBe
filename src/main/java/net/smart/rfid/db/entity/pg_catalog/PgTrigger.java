package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_trigger" database table.
 * 
 */
@Entity
@Table(name="\"pg_trigger\"")
@NamedQuery(name="PgTrigger.findAll", query="SELECT p FROM PgTrigger p")
public class PgTrigger implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"oid\"")
	private long oid;

	@Column(name="\"tgargs\"")
	private byte[] tgargs;

	@Column(name="\"tgattr\"")
	private Object tgattr;

	@Column(name="\"tgconstraint\"")
	private long tgconstraint;

	@Column(name="\"tgconstrindid\"")
	private long tgconstrindid;

	@Column(name="\"tgconstrrelid\"")
	private long tgconstrrelid;

	@Column(name="\"tgdeferrable\"")
	private boolean tgdeferrable;

	@Column(name="\"tgenabled\"")
	private String tgenabled;

	@Column(name="\"tgfoid\"")
	private long tgfoid;

	@Column(name="\"tginitdeferred\"")
	private boolean tginitdeferred;

	@Column(name="\"tgisinternal\"")
	private boolean tgisinternal;

	@Column(name="\"tgname\"")
	private String tgname;

	@Column(name="\"tgnargs\"")
	private short tgnargs;

	@Column(name="\"tgnewtable\"")
	private String tgnewtable;

	@Column(name="\"tgoldtable\"")
	private String tgoldtable;

	@Column(name="\"tgparentid\"")
	private long tgparentid;

	@Column(name="\"tgqual\"")
	private Object tgqual;

	@Column(name="\"tgrelid\"")
	private long tgrelid;

	@Column(name="\"tgtype\"")
	private short tgtype;

	public PgTrigger() {
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public byte[] getTgargs() {
		return this.tgargs;
	}

	public void setTgargs(byte[] tgargs) {
		this.tgargs = tgargs;
	}

	public Object getTgattr() {
		return this.tgattr;
	}

	public void setTgattr(Object tgattr) {
		this.tgattr = tgattr;
	}

	public long getTgconstraint() {
		return this.tgconstraint;
	}

	public void setTgconstraint(long tgconstraint) {
		this.tgconstraint = tgconstraint;
	}

	public long getTgconstrindid() {
		return this.tgconstrindid;
	}

	public void setTgconstrindid(long tgconstrindid) {
		this.tgconstrindid = tgconstrindid;
	}

	public long getTgconstrrelid() {
		return this.tgconstrrelid;
	}

	public void setTgconstrrelid(long tgconstrrelid) {
		this.tgconstrrelid = tgconstrrelid;
	}

	public boolean getTgdeferrable() {
		return this.tgdeferrable;
	}

	public void setTgdeferrable(boolean tgdeferrable) {
		this.tgdeferrable = tgdeferrable;
	}

	public String getTgenabled() {
		return this.tgenabled;
	}

	public void setTgenabled(String tgenabled) {
		this.tgenabled = tgenabled;
	}

	public long getTgfoid() {
		return this.tgfoid;
	}

	public void setTgfoid(long tgfoid) {
		this.tgfoid = tgfoid;
	}

	public boolean getTginitdeferred() {
		return this.tginitdeferred;
	}

	public void setTginitdeferred(boolean tginitdeferred) {
		this.tginitdeferred = tginitdeferred;
	}

	public boolean getTgisinternal() {
		return this.tgisinternal;
	}

	public void setTgisinternal(boolean tgisinternal) {
		this.tgisinternal = tgisinternal;
	}

	public String getTgname() {
		return this.tgname;
	}

	public void setTgname(String tgname) {
		this.tgname = tgname;
	}

	public short getTgnargs() {
		return this.tgnargs;
	}

	public void setTgnargs(short tgnargs) {
		this.tgnargs = tgnargs;
	}

	public String getTgnewtable() {
		return this.tgnewtable;
	}

	public void setTgnewtable(String tgnewtable) {
		this.tgnewtable = tgnewtable;
	}

	public String getTgoldtable() {
		return this.tgoldtable;
	}

	public void setTgoldtable(String tgoldtable) {
		this.tgoldtable = tgoldtable;
	}

	public long getTgparentid() {
		return this.tgparentid;
	}

	public void setTgparentid(long tgparentid) {
		this.tgparentid = tgparentid;
	}

	public Object getTgqual() {
		return this.tgqual;
	}

	public void setTgqual(Object tgqual) {
		this.tgqual = tgqual;
	}

	public long getTgrelid() {
		return this.tgrelid;
	}

	public void setTgrelid(long tgrelid) {
		this.tgrelid = tgrelid;
	}

	public short getTgtype() {
		return this.tgtype;
	}

	public void setTgtype(short tgtype) {
		this.tgtype = tgtype;
	}

}