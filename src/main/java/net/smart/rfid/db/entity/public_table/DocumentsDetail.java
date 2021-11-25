package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "documents_detail" database table.
 * 
 */
@Entity
@Table(name="\"documents_detail\"")
@NamedQuery(name="DocumentsDetail.findAll", query="SELECT d FROM DocumentsDetail d")
public class DocumentsDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"id\"")
	private int id;

	@Column(name="\"epc\"")
	private String epc;

	@Column(name="\"iddoc\"")
	private int iddoc;

	@Column(name="\"package_id\"")
	private String packageId;

	@Column(name="\"sku\"")
	private String sku;

	public DocumentsDetail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPackageId() {
		return this.packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

}