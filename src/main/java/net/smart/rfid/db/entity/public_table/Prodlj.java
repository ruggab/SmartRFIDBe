package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "prodlj" database table.
 * 
 */
@Entity
@Table(name="\"prodlj\"")
@NamedQuery(name="Prodlj.findAll", query="SELECT p FROM Prodlj p")
public class Prodlj implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"category\"")
	private String category;

	@Column(name="\"codlinea\"")
	private String codlinea;

	@Column(name="\"colordesc\"")
	private String colordesc;

	@Column(name="\"colourcode\"")
	private String colourcode;

	@Column(name="\"desclinea\"")
	private String desclinea;

	@Column(name="\"name\"")
	private String name;

	@Column(name="\"reference\"")
	private String reference;

	@Column(name="\"season\"")
	private String season;

	@Column(name="\"size\"")
	private String size;

	@Column(name="\"sizecod\"")
	private String sizecod;

	@Column(name="\"sku\"")
	private String sku;

	public Prodlj() {
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCodlinea() {
		return this.codlinea;
	}

	public void setCodlinea(String codlinea) {
		this.codlinea = codlinea;
	}

	public String getColordesc() {
		return this.colordesc;
	}

	public void setColordesc(String colordesc) {
		this.colordesc = colordesc;
	}

	public String getColourcode() {
		return this.colourcode;
	}

	public void setColourcode(String colourcode) {
		this.colourcode = colourcode;
	}

	public String getDesclinea() {
		return this.desclinea;
	}

	public void setDesclinea(String desclinea) {
		this.desclinea = desclinea;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getSeason() {
		return this.season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSizecod() {
		return this.sizecod;
	}

	public void setSizecod(String sizecod) {
		this.sizecod = sizecod;
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

}