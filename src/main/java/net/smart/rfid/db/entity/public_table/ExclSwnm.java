package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "excl_swnm" database table.
 * 
 */
@Entity
@Table(name="\"excl_swnm\"")
@NamedQuery(name="ExclSwnm.findAll", query="SELECT e FROM ExclSwnm e")
public class ExclSwnm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"epc\"")
	private String epc;

	@Column(name="\"min\"")
	private Timestamp min;

	@Column(name="\"mov\"")
	private long mov;

	public ExclSwnm() {
	}

	public String getEpc() {
		return this.epc;
	}

	public void setEpc(String epc) {
		this.epc = epc;
	}

	public Timestamp getMin() {
		return this.min;
	}

	public void setMin(Timestamp min) {
		this.min = min;
	}

	public long getMov() {
		return this.mov;
	}

	public void setMov(long mov) {
		this.mov = mov;
	}

}