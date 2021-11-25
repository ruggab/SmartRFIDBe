package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "documents_destination" database table.
 * 
 */
@Embeddable
public class DocumentsDestinationPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"id_customer\"")
	private int idCustomer;

	@Column(name="\"idstep\"")
	private int idstep;

	@Column(name="\"origin\"")
	private String origin;

	@Column(name="\"destination\"")
	private String destination;

	public DocumentsDestinationPK() {
	}
	public int getIdCustomer() {
		return this.idCustomer;
	}
	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}
	public int getIdstep() {
		return this.idstep;
	}
	public void setIdstep(int idstep) {
		this.idstep = idstep;
	}
	public String getOrigin() {
		return this.origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return this.destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DocumentsDestinationPK)) {
			return false;
		}
		DocumentsDestinationPK castOther = (DocumentsDestinationPK)other;
		return 
			(this.idCustomer == castOther.idCustomer)
			&& (this.idstep == castOther.idstep)
			&& this.origin.equals(castOther.origin)
			&& this.destination.equals(castOther.destination);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idCustomer;
		hash = hash * prime + this.idstep;
		hash = hash * prime + this.origin.hashCode();
		hash = hash * prime + this.destination.hashCode();
		
		return hash;
	}
}