package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "cocama_docs" database table.
 * 
 */
@Entity
@Table(name="\"cocama_docs\"")
@NamedQuery(name="CocamaDoc.findAll", query="SELECT c FROM CocamaDoc c")
public class CocamaDoc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"id\"")
	private int id;

	@Column(name="\"doc_ref\"")
	private String docRef;

	@Column(name="\"exported\"")
	private boolean exported;

	@Column(name="\"package_id\"")
	private String packageId;

	@Column(name="\"qty\"")
	private int qty;

	@Column(name="\"sku\"")
	private String sku;

	public CocamaDoc() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDocRef() {
		return this.docRef;
	}

	public void setDocRef(String docRef) {
		this.docRef = docRef;
	}

	public boolean getExported() {
		return this.exported;
	}

	public void setExported(boolean exported) {
		this.exported = exported;
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