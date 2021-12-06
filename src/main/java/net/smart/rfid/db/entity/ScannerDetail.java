package net.smart.rfid.db.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


/**
 * The persistent class for the "scanner_detail" database table.
 * 
 */
@Entity
public class ScannerDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,  generator = "scanner_detail_id_seq")
	@SequenceGenerator( name = "scanner_detail_id_seq", allocationSize = 1)
	private long id;

	private String epc;

	private Long idclient;

	private Long iddoc;

	private Long idlocation;

	private Long idscan;

	private String sku;

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

	

	public Long getIdclient() {
		return idclient;
	}

	public void setIdclient(Long idclient) {
		this.idclient = idclient;
	}

	public Long getIddoc() {
		return iddoc;
	}

	public void setIddoc(Long iddoc) {
		this.iddoc = iddoc;
	}

	public Long getIdlocation() {
		return idlocation;
	}

	public void setIdlocation(Long idlocation) {
		this.idlocation = idlocation;
	}

	public Long getIdscan() {
		return idscan;
	}

	public void setIdscan(Long idscan) {
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