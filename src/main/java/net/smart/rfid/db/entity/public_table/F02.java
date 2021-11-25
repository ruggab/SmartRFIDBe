package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "f02" database table.
 * 
 */
@Entity
@Table(name="\"f02\"")
@NamedQuery(name="F02.findAll", query="SELECT f FROM F02 f")
public class F02 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"id\"")
	private int id;

	@Column(name="\"doc_date\"")
	private String docDate;

	@Column(name="\"doc_ref\"")
	private String docRef;

	@Column(name="\"doc_type\"")
	private String docType;

	@Column(name="\"exported\"")
	private boolean exported;

	@Column(name="\"qty\"")
	private int qty;

	@Column(name="\"reference\"")
	private String reference;

	@Column(name="\"serial\"")
	private String serial;

	@Column(name="\"warehouse_code\"")
	private String warehouseCode;

	public F02() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDocDate() {
		return this.docDate;
	}

	public void setDocDate(String docDate) {
		this.docDate = docDate;
	}

	public String getDocRef() {
		return this.docRef;
	}

	public void setDocRef(String docRef) {
		this.docRef = docRef;
	}

	public String getDocType() {
		return this.docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public boolean getExported() {
		return this.exported;
	}

	public void setExported(boolean exported) {
		this.exported = exported;
	}

	public int getQty() {
		return this.qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getSerial() {
		return this.serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

}