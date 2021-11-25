package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "import_docs" database table.
 * 
 */
@Entity
@Table(name="\"import_docs\"")
@NamedQuery(name="ImportDoc.findAll", query="SELECT i FROM ImportDoc i")
public class ImportDoc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"barcode\"")
	private String barcode;

	@Column(name="\"epc\"")
	private String epc;

	@Column(name="\"id\"")
	private long id;

	@Column(name="\"number\"")
	private String number;

	@Column(name="\"package_id\"")
	private String packageId;

	@Column(name="\"qty\"")
	private int qty;

	@Column(name="\"reason\"")
	private String reason;

	@Column(name="\"series\"")
	private String series;

	@Column(name="\"type\"")
	private String type;

	@Column(name="\"unit_mov\"")
	private String unitMov;

	public ImportDoc() {
	}

	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getEpc() {
		return this.epc;
	}

	public void setEpc(String epc) {
		this.epc = epc;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPackageId() {
		return this.packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public int getQty() {
		return this.qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getSeries() {
		return this.series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUnitMov() {
		return this.unitMov;
	}

	public void setUnitMov(String unitMov) {
		this.unitMov = unitMov;
	}

}