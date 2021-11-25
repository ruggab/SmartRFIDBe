package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "documents_type" database table.
 * 
 */
@Entity
@Table(name="\"documents_type\"")
@NamedQuery(name="DocumentsType.findAll", query="SELECT d FROM DocumentsType d")
public class DocumentsType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"id_doctype\"")
	private int idDoctype;

	@Column(name="\"as_expected\"")
	private boolean asExpected;

	@Column(name="\"can_change_location\"")
	private boolean canChangeLocation;

	@Column(name="\"can_overload\"")
	private boolean canOverload;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"id_customer\"")
	private int idCustomer;

	public DocumentsType() {
	}

	public int getIdDoctype() {
		return this.idDoctype;
	}

	public void setIdDoctype(int idDoctype) {
		this.idDoctype = idDoctype;
	}

	public boolean getAsExpected() {
		return this.asExpected;
	}

	public void setAsExpected(boolean asExpected) {
		this.asExpected = asExpected;
	}

	public boolean getCanChangeLocation() {
		return this.canChangeLocation;
	}

	public void setCanChangeLocation(boolean canChangeLocation) {
		this.canChangeLocation = canChangeLocation;
	}

	public boolean getCanOverload() {
		return this.canOverload;
	}

	public void setCanOverload(boolean canOverload) {
		this.canOverload = canOverload;
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