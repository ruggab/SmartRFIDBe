package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "step_type" database table.
 * 
 */
@Entity
@Table(name="\"step_type\"")
@NamedQuery(name="StepType.findAll", query="SELECT s FROM StepType s")
public class StepType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"idstep_type\"")
	private int idstepType;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"id_customer\"")
	private int idCustomer;

	@Column(name="\"id_doctype_default\"")
	private int idDoctypeDefault;

	@Column(name="\"id_doctype_default2\"")
	private int idDoctypeDefault2;

	@Column(name="\"inventory\"")
	private boolean inventory;

	@Column(name="\"power\"")
	private int power;

	@Column(name="\"scan\"")
	private int scan;

	public StepType() {
	}

	public int getIdstepType() {
		return this.idstepType;
	}

	public void setIdstepType(int idstepType) {
		this.idstepType = idstepType;
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

	public int getIdDoctypeDefault() {
		return this.idDoctypeDefault;
	}

	public void setIdDoctypeDefault(int idDoctypeDefault) {
		this.idDoctypeDefault = idDoctypeDefault;
	}

	public int getIdDoctypeDefault2() {
		return this.idDoctypeDefault2;
	}

	public void setIdDoctypeDefault2(int idDoctypeDefault2) {
		this.idDoctypeDefault2 = idDoctypeDefault2;
	}

	public boolean getInventory() {
		return this.inventory;
	}

	public void setInventory(boolean inventory) {
		this.inventory = inventory;
	}

	public int getPower() {
		return this.power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getScan() {
		return this.scan;
	}

	public void setScan(int scan) {
		this.scan = scan;
	}

}