package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_amproc" database table.
 * 
 */
@Entity
@Table(name="\"pg_amproc\"")
@NamedQuery(name="PgAmproc.findAll", query="SELECT p FROM PgAmproc p")
public class PgAmproc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"amproc\"")
	private Object amproc;

	@Column(name="\"amprocfamily\"")
	private long amprocfamily;

	@Column(name="\"amproclefttype\"")
	private long amproclefttype;

	@Column(name="\"amprocnum\"")
	private short amprocnum;

	@Column(name="\"amprocrighttype\"")
	private long amprocrighttype;

	@Column(name="\"oid\"")
	private long oid;

	public PgAmproc() {
	}

	public Object getAmproc() {
		return this.amproc;
	}

	public void setAmproc(Object amproc) {
		this.amproc = amproc;
	}

	public long getAmprocfamily() {
		return this.amprocfamily;
	}

	public void setAmprocfamily(long amprocfamily) {
		this.amprocfamily = amprocfamily;
	}

	public long getAmproclefttype() {
		return this.amproclefttype;
	}

	public void setAmproclefttype(long amproclefttype) {
		this.amproclefttype = amproclefttype;
	}

	public short getAmprocnum() {
		return this.amprocnum;
	}

	public void setAmprocnum(short amprocnum) {
		this.amprocnum = amprocnum;
	}

	public long getAmprocrighttype() {
		return this.amprocrighttype;
	}

	public void setAmprocrighttype(long amprocrighttype) {
		this.amprocrighttype = amprocrighttype;
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

}