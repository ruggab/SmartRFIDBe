package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "teststampa" database table.
 * 
 */
@Entity
@Table(name="\"teststampa\"")
@NamedQuery(name="Teststampa.findAll", query="SELECT t FROM Teststampa t")
public class Teststampa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"ean\"")
	private String ean;

	@Column(name="\"pack\"")
	private String pack;

	@Column(name="\"qty\"")
	private int qty;

	@Column(name="\"reference\"")
	private String reference;

	public Teststampa() {
	}

	public String getEan() {
		return this.ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public String getPack() {
		return this.pack;
	}

	public void setPack(String pack) {
		this.pack = pack;
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

}