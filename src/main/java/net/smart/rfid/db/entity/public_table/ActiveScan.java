package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "active_scan" database table.
 * 
 */
@Entity
@Table(name="\"active_scan\"")
@NamedQuery(name="ActiveScan.findAll", query="SELECT a FROM ActiveScan a")
public class ActiveScan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"iddoc\"")
	private int iddoc;

	@Column(name="\"idscan\"")
	private int idscan;

	@Column(name="\"scanner_detail\"")
	private Object scannerDetail;

	public ActiveScan() {
	}

	public int getIddoc() {
		return this.iddoc;
	}

	public void setIddoc(int iddoc) {
		this.iddoc = iddoc;
	}

	public int getIdscan() {
		return this.idscan;
	}

	public void setIdscan(int idscan) {
		this.idscan = idscan;
	}

	public Object getScannerDetail() {
		return this.scannerDetail;
	}

	public void setScannerDetail(Object scannerDetail) {
		this.scannerDetail = scannerDetail;
	}

}