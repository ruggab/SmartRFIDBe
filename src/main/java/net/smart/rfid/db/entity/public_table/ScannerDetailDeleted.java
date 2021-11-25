package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "scanner_detail_deleted" database table.
 * 
 */
@Entity
@Table(name="\"scanner_detail_deleted\"")
@NamedQuery(name="ScannerDetailDeleted.findAll", query="SELECT s FROM ScannerDetailDeleted s")
public class ScannerDetailDeleted implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"epc\"")
	private String epc;

	@Column(name="\"id\"")
	private long id;

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

	@Column(name="\"ts_deleted\"")
	private Timestamp tsDeleted;

	public ScannerDetailDeleted() {
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

	public Timestamp getTsDeleted() {
		return this.tsDeleted;
	}

	public void setTsDeleted(Timestamp tsDeleted) {
		this.tsDeleted = tsDeleted;
	}

}