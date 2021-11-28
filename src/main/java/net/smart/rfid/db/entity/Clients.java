package net.smart.rfid.db.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the "clients" database table.
 * 
 */
@Entity
@Table(name = "clients")
public class Clients {

	@Id
	private Long id;

	private String description;

	private boolean enabled;

	private Long idCustomer;

	private String mac;

	public Clients() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Long getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(Long idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

}