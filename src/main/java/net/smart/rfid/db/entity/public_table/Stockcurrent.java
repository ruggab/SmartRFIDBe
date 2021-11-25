package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "stockcurrent" database table.
 * 
 */
@Entity
@Table(name="\"stockcurrent\"")
@NamedQuery(name="Stockcurrent.findAll", query="SELECT s FROM Stockcurrent s")
public class Stockcurrent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"barcode\"")
	private String barcode;

	@Column(name="\"colourcode\"")
	private String colourcode;

	@Column(name="\"epc\"")
	private String epc;

	@Column(name="\"id_location\"")
	private int idLocation;

	@Column(name="\"id_site\"")
	private int idSite;

	@Column(name="\"itemcode\"")
	private String itemcode;

	@Column(name="\"part\"")
	private String part;

	@Column(name="\"size\"")
	private String size;

	@Column(name="\"sizecod\"")
	private String sizecod;

	@Column(name="\"units\"")
	private long units;

	@Column(name="\"variant\"")
	private String variant;

	@Column(name="\"varianttype\"")
	private String varianttype;

	public Stockcurrent() {
	}

	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getColourcode() {
		return this.colourcode;
	}

	public void setColourcode(String colourcode) {
		this.colourcode = colourcode;
	}

	public String getEpc() {
		return this.epc;
	}

	public void setEpc(String epc) {
		this.epc = epc;
	}

	public int getIdLocation() {
		return this.idLocation;
	}

	public void setIdLocation(int idLocation) {
		this.idLocation = idLocation;
	}

	public int getIdSite() {
		return this.idSite;
	}

	public void setIdSite(int idSite) {
		this.idSite = idSite;
	}

	public String getItemcode() {
		return this.itemcode;
	}

	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}

	public String getPart() {
		return this.part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSizecod() {
		return this.sizecod;
	}

	public void setSizecod(String sizecod) {
		this.sizecod = sizecod;
	}

	public long getUnits() {
		return this.units;
	}

	public void setUnits(long units) {
		this.units = units;
	}

	public String getVariant() {
		return this.variant;
	}

	public void setVariant(String variant) {
		this.variant = variant;
	}

	public String getVarianttype() {
		return this.varianttype;
	}

	public void setVarianttype(String varianttype) {
		this.varianttype = varianttype;
	}

}