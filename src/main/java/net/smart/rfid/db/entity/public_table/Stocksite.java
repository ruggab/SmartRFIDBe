package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "stocksite" database table.
 * 
 */
@Entity
@Table(name="\"stocksite\"")
@NamedQuery(name="Stocksite.findAll", query="SELECT s FROM Stocksite s")
public class Stocksite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"epc\"")
	private String epc;

	@Column(name="\"idsite\"")
	private int idsite;

	@Column(name="\"max\"")
	private long max;

	@Column(name="\"units\"")
	private long units;

	public Stocksite() {
	}

	public String getEpc() {
		return this.epc;
	}

	public void setEpc(String epc) {
		this.epc = epc;
	}

	public int getIdsite() {
		return this.idsite;
	}

	public void setIdsite(int idsite) {
		this.idsite = idsite;
	}

	public long getMax() {
		return this.max;
	}

	public void setMax(long max) {
		this.max = max;
	}

	public long getUnits() {
		return this.units;
	}

	public void setUnits(long units) {
		this.units = units;
	}

}