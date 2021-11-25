package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "barcodep" database table.
 * 
 */
@Entity
@Table(name="\"barcodep\"")
@NamedQuery(name="Barcodep.findAll", query="SELECT b FROM Barcodep b")
public class Barcodep implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"ean11\"")
	private String ean11;

	@Column(name="\"eantp\"")
	private String eantp;

	@Column(name="\"hpean\"")
	private String hpean;

	@Column(name="\"lfnum\"")
	private String lfnum;

	@Column(name="\"mandt\"")
	private String mandt;

	@Column(name="\"matnr\"")
	private String matnr;

	@Column(name="\"meinh\"")
	private String meinh;

	@Column(name="\"sgt_catv\"")
	private String sgtCatv;

	public Barcodep() {
	}

	public String getEan11() {
		return this.ean11;
	}

	public void setEan11(String ean11) {
		this.ean11 = ean11;
	}

	public String getEantp() {
		return this.eantp;
	}

	public void setEantp(String eantp) {
		this.eantp = eantp;
	}

	public String getHpean() {
		return this.hpean;
	}

	public void setHpean(String hpean) {
		this.hpean = hpean;
	}

	public String getLfnum() {
		return this.lfnum;
	}

	public void setLfnum(String lfnum) {
		this.lfnum = lfnum;
	}

	public String getMandt() {
		return this.mandt;
	}

	public void setMandt(String mandt) {
		this.mandt = mandt;
	}

	public String getMatnr() {
		return this.matnr;
	}

	public void setMatnr(String matnr) {
		this.matnr = matnr;
	}

	public String getMeinh() {
		return this.meinh;
	}

	public void setMeinh(String meinh) {
		this.meinh = meinh;
	}

	public String getSgtCatv() {
		return this.sgtCatv;
	}

	public void setSgtCatv(String sgtCatv) {
		this.sgtCatv = sgtCatv;
	}

}