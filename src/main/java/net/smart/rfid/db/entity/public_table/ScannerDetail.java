package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "scanner_detail" database table.
 * 
 */
@Entity
@Table(name="\"scanner_detail\"")
@NamedQuery(name="ScannerDetail.findAll", query="SELECT s FROM ScannerDetail s")
public class ScannerDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"id\"")
	private long id;

	@Column(name="\"epc\"")
	private String epc;

	@Column(name="\"idclient\"")
	private int idclient;

	@Column(name="\"iddoc\"")
	private int iddoc;

	@Column(name="\"idlocation\"")
	private int idlocation;

	@Column(name="\"idscan\"")
	private int idscan;

	@Column(name="\"sku\"")
	private String sku;

	@Column(name="\"ts\"")
	private String ts;

	public ScannerDetail() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEpc() {
		return this.epc;
	}

	public void setEpc(String epc) {
		this.epc = epc;
	}

	public int getIdclient() {
		return this.idclient;
	}

	public void setIdclient(int idclient) {
		this.idclient = idclient;
	}

	public int getIddoc() {
		return this.iddoc;
	}

	public void setIddoc(int iddoc) {
		this.iddoc = iddoc;
	}

	public int getIdlocation() {
		return this.idlocation;
	}

	public void setIdlocation(int idlocation) {
		this.idlocation = idlocation;
	}

	public int getIdscan() {
		return this.idscan;
	}

	public void setIdscan(int idscan) {
		this.idscan = idscan;
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getTs() {
		return this.ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

}