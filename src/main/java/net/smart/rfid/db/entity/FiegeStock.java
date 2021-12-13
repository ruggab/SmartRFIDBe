package net.smart.rfid.db.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the "fiege_stock" database table.
 * 
 */
@Entity
public class FiegeStock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String ares;

	private String blk;

	private String description;

	private String fila;

	private String mag;

	private String mand;

	private String piano;

	private String prop;

	private int qty;

	private String reference;

	private String scaf;

	private String sett;

	private String sku;

	private String stato;

	public FiegeStock() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAres() {
		return this.ares;
	}

	public void setAres(String ares) {
		this.ares = ares;
	}

	public String getBlk() {
		return this.blk;
	}

	public void setBlk(String blk) {
		this.blk = blk;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFila() {
		return this.fila;
	}

	public void setFila(String fila) {
		this.fila = fila;
	}

	public String getMag() {
		return this.mag;
	}

	public void setMag(String mag) {
		this.mag = mag;
	}

	public String getMand() {
		return this.mand;
	}

	public void setMand(String mand) {
		this.mand = mand;
	}

	public String getPiano() {
		return this.piano;
	}

	public void setPiano(String piano) {
		this.piano = piano;
	}

	public String getProp() {
		return this.prop;
	}

	public void setProp(String prop) {
		this.prop = prop;
	}

	public int getQty() {
		return this.qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getScaf() {
		return this.scaf;
	}

	public void setScaf(String scaf) {
		this.scaf = scaf;
	}

	public String getSett() {
		return this.sett;
	}

	public void setSett(String sett) {
		this.sett = sett;
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getStato() {
		return this.stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

}