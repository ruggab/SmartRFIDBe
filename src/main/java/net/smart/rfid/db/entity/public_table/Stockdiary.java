package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "stockdiary" database table.
 * 
 */
@Entity
@Table(name="\"stockdiary\"")
@NamedQuery(name="Stockdiary.findAll", query="SELECT s FROM Stockdiary s")
public class Stockdiary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"id\"")
	private long id;

	@Column(name="\"barcode\"")
	private String barcode;

	@Column(name="\"epc\"")
	private String epc;

	@Column(name="\"id_document\"")
	private int idDocument;

	@Column(name="\"id_location\"")
	private int idLocation;

	@Column(name="\"id_reason\"")
	private int idReason;

	@Column(name="\"id_site\"")
	private int idSite;

	@Column(name="\"ts\"")
	private Timestamp ts;

	@Column(name="\"units\"")
	private int units;

	public Stockdiary() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
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

	public int getIdDocument() {
		return this.idDocument;
	}

	public void setIdDocument(int idDocument) {
		this.idDocument = idDocument;
	}

	public int getIdLocation() {
		return this.idLocation;
	}

	public void setIdLocation(int idLocation) {
		this.idLocation = idLocation;
	}

	public int getIdReason() {
		return this.idReason;
	}

	public void setIdReason(int idReason) {
		this.idReason = idReason;
	}

	public int getIdSite() {
		return this.idSite;
	}

	public void setIdSite(int idSite) {
		this.idSite = idSite;
	}

	public Timestamp getTs() {
		return this.ts;
	}

	public void setTs(Timestamp ts) {
		this.ts = ts;
	}

	public int getUnits() {
		return this.units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

}