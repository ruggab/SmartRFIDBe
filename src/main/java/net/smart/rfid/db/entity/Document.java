package net.smart.rfid.db.entity.gj_import;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "documents" database table.
 * 
 */
@Entity
@Table(name="\"documents\"")
@NamedQuery(name="Document.findAll", query="SELECT d FROM Document d")
public class Document implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"id_document\"")
	private String idDocument;

	@Column(name="\"package_id\"")
	private String packageId;

	@Column(name="\"qty\"")
	private int qty;

	@Column(name="\"sku\"")
	private String sku;

	public Document() {
	}

	public String getIdDocument() {
		return this.idDocument;
	}

	public void setIdDocument(String idDocument) {
		this.idDocument = idDocument;
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

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

}