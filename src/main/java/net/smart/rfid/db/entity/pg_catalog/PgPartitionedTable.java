package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_partitioned_table" database table.
 * 
 */
@Entity
@Table(name="\"pg_partitioned_table\"")
@NamedQuery(name="PgPartitionedTable.findAll", query="SELECT p FROM PgPartitionedTable p")
public class PgPartitionedTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"partattrs\"")
	private Object partattrs;

	@Column(name="\"partclass\"")
	private Object partclass;

	@Column(name="\"partcollation\"")
	private Object partcollation;

	@Column(name="\"partdefid\"")
	private long partdefid;

	@Column(name="\"partexprs\"")
	private Object partexprs;

	@Column(name="\"partnatts\"")
	private short partnatts;

	@Column(name="\"partrelid\"")
	private long partrelid;

	@Column(name="\"partstrat\"")
	private String partstrat;

	public PgPartitionedTable() {
	}

	public Object getPartattrs() {
		return this.partattrs;
	}

	public void setPartattrs(Object partattrs) {
		this.partattrs = partattrs;
	}

	public Object getPartclass() {
		return this.partclass;
	}

	public void setPartclass(Object partclass) {
		this.partclass = partclass;
	}

	public Object getPartcollation() {
		return this.partcollation;
	}

	public void setPartcollation(Object partcollation) {
		this.partcollation = partcollation;
	}

	public long getPartdefid() {
		return this.partdefid;
	}

	public void setPartdefid(long partdefid) {
		this.partdefid = partdefid;
	}

	public Object getPartexprs() {
		return this.partexprs;
	}

	public void setPartexprs(Object partexprs) {
		this.partexprs = partexprs;
	}

	public short getPartnatts() {
		return this.partnatts;
	}

	public void setPartnatts(short partnatts) {
		this.partnatts = partnatts;
	}

	public long getPartrelid() {
		return this.partrelid;
	}

	public void setPartrelid(long partrelid) {
		this.partrelid = partrelid;
	}

	public String getPartstrat() {
		return this.partstrat;
	}

	public void setPartstrat(String partstrat) {
		this.partstrat = partstrat;
	}

}