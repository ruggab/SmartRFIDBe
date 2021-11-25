package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_ts_config_map" database table.
 * 
 */
@Entity
@Table(name="\"pg_ts_config_map\"")
@NamedQuery(name="PgTsConfigMap.findAll", query="SELECT p FROM PgTsConfigMap p")
public class PgTsConfigMap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"mapcfg\"")
	private long mapcfg;

	@Column(name="\"mapdict\"")
	private long mapdict;

	@Column(name="\"mapseqno\"")
	private int mapseqno;

	@Column(name="\"maptokentype\"")
	private int maptokentype;

	public PgTsConfigMap() {
	}

	public long getMapcfg() {
		return this.mapcfg;
	}

	public void setMapcfg(long mapcfg) {
		this.mapcfg = mapcfg;
	}

	public long getMapdict() {
		return this.mapdict;
	}

	public void setMapdict(long mapdict) {
		this.mapdict = mapdict;
	}

	public int getMapseqno() {
		return this.mapseqno;
	}

	public void setMapseqno(int mapseqno) {
		this.mapseqno = mapseqno;
	}

	public int getMaptokentype() {
		return this.maptokentype;
	}

	public void setMaptokentype(int maptokentype) {
		this.maptokentype = maptokentype;
	}

}