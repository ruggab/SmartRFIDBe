package net.smart.rfid.db.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * The persistent class for the "step_type" database table.
 * 
 */
@Entity
public class StepType {

	@Id
	private Integer idstepType;

	private String description;

	private Integer idCustomer;

	private Integer idDoctypeDefault;

	private Integer idDoctypeDefault2;

	private boolean inventory;

	private Integer power;

	private Integer scan;

	public StepType() {
	}

	public Integer getIdstepType() {
		return idstepType;
	}

	public void setIdstepType(Integer idstepType) {
		this.idstepType = idstepType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(Integer idCustomer) {
		this.idCustomer = idCustomer;
	}

	public Integer getIdDoctypeDefault() {
		return idDoctypeDefault;
	}

	public void setIdDoctypeDefault(Integer idDoctypeDefault) {
		this.idDoctypeDefault = idDoctypeDefault;
	}

	public Integer getIdDoctypeDefault2() {
		return idDoctypeDefault2;
	}

	public void setIdDoctypeDefault2(Integer idDoctypeDefault2) {
		this.idDoctypeDefault2 = idDoctypeDefault2;
	}

	public boolean isInventory() {
		return inventory;
	}

	public void setInventory(boolean inventory) {
		this.inventory = inventory;
	}

	public Integer getPower() {
		return power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

	public Integer getScan() {
		return scan;
	}

	public void setScan(Integer scan) {
		this.scan = scan;
	}

}