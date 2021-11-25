package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "location" database table.
 * 
 */
@Entity
@Table(name="\"location\"")
@NamedQuery(name="Location.findAll", query="SELECT l FROM Location l")
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"id\"")
	private int id;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"id_customer\"")
	private int idCustomer;

	@Column(name="\"id_locationtype\"")
	private int idLocationtype;

	@Column(name="\"idsite\"")
	private int idsite;

	@Column(name="\"location_dft\"")
	private boolean locationDft;

	public Location() {
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

	public int getIdCustomer() {
		return this.idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	public int getIdLocationtype() {
		return this.idLocationtype;
	}

	public void setIdLocationtype(int idLocationtype) {
		this.idLocationtype = idLocationtype;
	}

	public int getIdsite() {
		return this.idsite;
	}

	public void setIdsite(int idsite) {
		this.idsite = idsite;
	}

	public boolean getLocationDft() {
		return this.locationDft;
	}

	public void setLocationDft(boolean locationDft) {
		this.locationDft = locationDft;
	}

}