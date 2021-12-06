package net.smart.rfid.db.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


/**
 * The persistent class for the "scanner" database table.
 * 
 */
@Entity
public class Scanner  {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,  generator = "scanner_idscan_seq")
	@SequenceGenerator( name = "scanner_idscan_seq", allocationSize = 1)
	private Long idscan;

	
	private Long idclient;


	private Long iddoc;

	
	private Timestamp scanDate;

	public Scanner() {
	}



	public Timestamp getScanDate() {
		return this.scanDate;
	}

	public void setScanDate(Timestamp scanDate) {
		this.scanDate = scanDate;
	}



	public Long getIdscan() {
		return idscan;
	}



	public void setIdscan(Long idscan) {
		this.idscan = idscan;
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
	
	

}