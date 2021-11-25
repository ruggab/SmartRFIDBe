package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "printers" database table.
 * 
 */
@Entity
@Table(name="\"printers\"")
@NamedQuery(name="Printer.findAll", query="SELECT p FROM Printer p")
public class Printer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"id\"")
	private int id;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"enabled\"")
	private boolean enabled;

	@Column(name="\"id_customer\"")
	private int idCustomer;

	@Column(name="\"ip\"")
	private String ip;

	@Column(name="\"port\"")
	private int port;

	public Printer() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public int getIdCustomer() {
		return this.idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPort() {
		return this.port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}