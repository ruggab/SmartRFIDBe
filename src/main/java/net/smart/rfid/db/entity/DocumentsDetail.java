package net.smart.rfid.db.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


/**
 * The persistent class for the "documents_detail" database table.
 * 
 */
@Entity
public class DocumentsDetail  {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,  generator = "documents_detail_id_seq")
	@SequenceGenerator( name = "documents_detail_id_seq", allocationSize = 1)
	private int id;


	private String epc;


	private int iddoc;


	private String packageId;


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