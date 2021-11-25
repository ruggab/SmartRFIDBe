package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_statistic_ext_data" database table.
 * 
 */
@Entity
@Table(name="\"pg_statistic_ext_data\"")
@NamedQuery(name="PgStatisticExtData.findAll", query="SELECT p FROM PgStatisticExtData p")
public class PgStatisticExtData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"stxddependencies\"")
	private Object stxddependencies;

	@Column(name="\"stxdmcv\"")
	private Object stxdmcv;

	@Column(name="\"stxdndistinct\"")
	private Object stxdndistinct;

	@Column(name="\"stxoid\"")
	private long stxoid;

	public PgStatisticExtData() {
	}

	public Object getStxddependencies() {
		return this.stxddependencies;
	}

	public void setStxddependencies(Object stxddependencies) {
		this.stxddependencies = stxddependencies;
	}

	public Object getStxdmcv() {
		return this.stxdmcv;
	}

	public void setStxdmcv(Object stxdmcv) {
		this.stxdmcv = stxdmcv;
	}

	public Object getStxdndistinct() {
		return this.stxdndistinct;
	}

	public void setStxdndistinct(Object stxdndistinct) {
		this.stxdndistinct = stxdndistinct;
	}

	public long getStxoid() {
		return this.stxoid;
	}

	public void setStxoid(long stxoid) {
		this.stxoid = stxoid;
	}

}