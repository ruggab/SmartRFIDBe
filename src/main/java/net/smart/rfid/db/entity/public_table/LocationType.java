package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "location_type" database table.
 * 
 */
@Entity
@Table(name="\"location_type\"")
@NamedQuery(name="LocationType.findAll", query="SELECT l FROM LocationType l")
public class LocationType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"id_locationtype\"")
	private int idLocationtype;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"id_customer\"")
	private int idCustomer;

	public LocationType() {
	}

	public int getIdLocationtype() {
		return this.idLocationtype;
	}

	public void setIdLocationtype(int idLocationtype) {
		this.idLocationtype = idLocationtype;
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

}