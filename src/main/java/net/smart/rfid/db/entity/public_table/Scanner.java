package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "scanner" database table.
 * 
 */
@Entity
@Table(name="\"scanner\"")
@NamedQuery(name="Scanner.findAll", query="SELECT s FROM Scanner s")
public class Scanner implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"idscan\"")
	private int idscan;

	@Column(name="\"idclient\"")
	private int idclient;

	@Column(name="\"iddoc\"")
	private int iddoc;

	@Column(name="\"scan_date\"")
	private Timestamp scanDate;

	public Scanner() {
	}

	public int getIdscan() {
		return this.idscan;
	}

	public void setIdscan(int idscan) {
		this.idscan = idscan;
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

	public Timestamp getScanDate() {
		return this.scanDate;
	}

	public void setScanDate(Timestamp scanDate) {
		this.scanDate = scanDate;
	}

}