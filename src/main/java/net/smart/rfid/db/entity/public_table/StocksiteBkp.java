package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "stocksite_bkp" database table.
 * 
 */
@Entity
@Table(name="\"stocksite_bkp\"")
@NamedQuery(name="StocksiteBkp.findAll", query="SELECT s FROM StocksiteBkp s")
public class StocksiteBkp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"epc\"")
	private String epc;

	@Column(name="\"idsite\"")
	private int idsite;

	@Column(name="\"units\"")
	private long units;

	public StocksiteBkp() {
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

	public long getUnits() {
		return this.units;
	}

	public void setUnits(long units) {
		this.units = units;
	}

}