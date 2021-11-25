package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "anahb" database table.
 * 
 */
@Entity
@Table(name="\"anahb\"")
@NamedQuery(name="Anahb.findAll", query="SELECT a FROM Anahb a")
public class Anahb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"codice\"")
	private String codice;

	@Column(name="\"colore\"")
	private String colore;

	@Column(name="\"coloredesc\"")
	private String coloredesc;

	@Column(name="\"descprod\"")
	private String descprod;

	@Column(name="\"ean\"")
	private String ean;

	@Column(name="\"postg\"")
	private String postg;

	@Column(name="\"stagione\"")
	private String stagione;

	@Column(name="\"tg\"")
	private String tg;

	@Column(name="\"variante\"")
	private String variante;

	public Anahb() {
	}

	public String getCodice() {
		return this.codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getColore() {
		return this.colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String getColoredesc() {
		return this.coloredesc;
	}

	public void setColoredesc(String coloredesc) {
		this.coloredesc = coloredesc;
	}

	public String getDescprod() {
		return this.descprod;
	}

	public void setDescprod(String descprod) {
		this.descprod = descprod;
	}

	public String getEan() {
		return this.ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public String getPostg() {
		return this.postg;
	}

	public void setPostg(String postg) {
		this.postg = postg;
	}

	public String getStagione() {
		return this.stagione;
	}

	public void setStagione(String stagione) {
		this.stagione = stagione;
	}

	public String getTg() {
		return this.tg;
	}

	public void setTg(String tg) {
		this.tg = tg;
	}

	public String getVariante() {
		return this.variante;
	}

	public void setVariante(String variante) {
		this.variante = variante;
	}

}