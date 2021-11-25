package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "vw_documents_details" database table.
 * 
 */
@Entity
@Table(name="\"vw_documents_details\"")
@NamedQuery(name="VwDocumentsDetail.findAll", query="SELECT v FROM VwDocumentsDetail v")
public class VwDocumentsDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"code\"")
	private String code;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"epc\"")
	private String epc;

	@Column(name="\"id\"")
	private int id;

	@Column(name="\"iddoc\"")
	private int iddoc;

	@Column(name="\"package_id\"")
	private String packageId;

	@Column(name="\"reference\"")
	private String reference;

	@Column(name="\"sku\"")
	private String sku;

	public VwDocumentsDetail() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEpc() {
		return this.epc;
	}

	public void setEpc(String epc) {
		this.epc = epc;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIddoc() {
		return this.iddoc;
	}

	public void setIddoc(int iddoc) {
		this.iddoc = iddoc;
	}

	public String getPackageId() {
		return this.packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

}