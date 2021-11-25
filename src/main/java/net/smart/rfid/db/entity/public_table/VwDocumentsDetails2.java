package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the "vw_documents_details2" database table.
 * 
 */
@Entity
@Table(name="\"vw_documents_details2\"")
@NamedQuery(name="VwDocumentsDetails2.findAll", query="SELECT v FROM VwDocumentsDetails2 v")
public class VwDocumentsDetails2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"code\"")
	private String code;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"iddoc\"")
	private int iddoc;

	@Column(name="\"package_id\"")
	private String packageId;

	@Column(name="\"qty_read\"")
	private BigDecimal qtyRead;

	@Column(name="\"qty_theo\"")
	private BigDecimal qtyTheo;

	@Column(name="\"sku\"")
	private String sku;

	public VwDocumentsDetails2() {
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

	public BigDecimal getQtyRead() {
		return this.qtyRead;
	}

	public void setQtyRead(BigDecimal qtyRead) {
		this.qtyRead = qtyRead;
	}

	public BigDecimal getQtyTheo() {
		return this.qtyTheo;
	}

	public void setQtyTheo(BigDecimal qtyTheo) {
		this.qtyTheo = qtyTheo;
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

}