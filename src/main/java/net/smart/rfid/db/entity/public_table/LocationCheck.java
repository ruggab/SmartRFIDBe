package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "location_check" database table.
 * 
 */
@Entity
@Table(name="\"location_check\"")
@NamedQuery(name="LocationCheck.findAll", query="SELECT l FROM LocationCheck l")
public class LocationCheck implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"diary_last_location\"")
	private int diaryLastLocation;

	@Column(name="\"epc\"")
	private String epc;

	@Column(name="\"iddoc\"")
	private int iddoc;

	@Column(name="\"idlocation\"")
	private int idlocation;

	@Column(name="\"sku\"")
	private String sku;

	public LocationCheck() {
	}

	public int getDiaryLastLocation() {
		return this.diaryLastLocation;
	}

	public void setDiaryLastLocation(int diaryLastLocation) {
		this.diaryLastLocation = diaryLastLocation;
	}

	public String getEpc() {
		return this.epc;
	}

	public void setEpc(String epc) {
		this.epc = epc;
	}

	public int getIddoc() {
		return this.iddoc;
	}

	public void setIddoc(int iddoc) {
		this.iddoc = iddoc;
	}

	public int getIdlocation() {
		return this.idlocation;
	}

	public void setIdlocation(int idlocation) {
		this.idlocation = idlocation;
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

}