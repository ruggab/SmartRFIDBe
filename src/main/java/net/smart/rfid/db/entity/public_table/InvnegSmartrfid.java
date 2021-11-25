package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "invneg_smartrfid" database table.
 * 
 */
@Entity
@Table(name="\"invneg_smartrfid\"")
@NamedQuery(name="InvnegSmartrfid.findAll", query="SELECT i FROM InvnegSmartrfid i")
public class InvnegSmartrfid implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"art\"")
	private String art;

	@Column(name="\"category\"")
	private String category;

	@Column(name="\"epc\"")
	private String epc;

	@Column(name="\"idscelta\"")
	private String idscelta;

	@Column(name="\"qt\"")
	private int qt;

	@Column(name="\"scelta\"")
	private String scelta;

	@Column(name="\"si\"")
	private String si;

	@Column(name="\"sku\"")
	private String sku;

	@Column(name="\"tg\"")
	private String tg;

	public InvnegSmartrfid() {
	}

	public String getArt() {
		return this.art;
	}

	public void setArt(String art) {
		this.art = art;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getEpc() {
		return this.epc;
	}

	public void setEpc(String epc) {
		this.epc = epc;
	}

	public String getIdscelta() {
		return this.idscelta;
	}

	public void setIdscelta(String idscelta) {
		this.idscelta = idscelta;
	}

	public int getQt() {
		return this.qt;
	}

	public void setQt(int qt) {
		this.qt = qt;
	}

	public String getScelta() {
		return this.scelta;
	}

	public void setScelta(String scelta) {
		this.scelta = scelta;
	}

	public String getSi() {
		return this.si;
	}

	public void setSi(String si) {
		this.si = si;
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getTg() {
		return this.tg;
	}

	public void setTg(String tg) {
		this.tg = tg;
	}

}