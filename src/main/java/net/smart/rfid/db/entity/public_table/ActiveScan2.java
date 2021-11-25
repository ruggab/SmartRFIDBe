package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "active_scan2" database table.
 * 
 */
@Entity
@Table(name="\"active_scan2\"")
@NamedQuery(name="ActiveScan2.findAll", query="SELECT a FROM ActiveScan2 a")
public class ActiveScan2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"iddoc\"")
	private int iddoc;

	@Column(name="\"idscan\"")
	private int idscan;

	@Column(name="\"scanner_detail\"")
	private Object scannerDetail;

	public ActiveScan2() {
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