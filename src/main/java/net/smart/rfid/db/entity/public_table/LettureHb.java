package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "letture_hb" database table.
 * 
 */
@Entity
@Table(name="\"letture_hb\"")
@NamedQuery(name="LettureHb.findAll", query="SELECT l FROM LettureHb l")
public class LettureHb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"epc\"")
	private String epc;

	public LettureHb() {
	}

	public String getEpc() {
		return this.epc;
	}

	public void setEpc(String epc) {
		this.epc = epc;
	}

}