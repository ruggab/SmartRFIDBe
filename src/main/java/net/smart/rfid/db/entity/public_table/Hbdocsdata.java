package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the "hbdocsdata" database table.
 * 
 */
@Entity
@Table(name="\"hbdocsdata\"")
@NamedQuery(name="Hbdocsdata.findAll", query="SELECT h FROM Hbdocsdata h")
public class Hbdocsdata implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"anno\"")
	private String anno;

	@Column(name="\"barcode\"")
	private String barcode;

	@Column(name="\"causale\"")
	private String causale;

	@Column(name="\"datadoc\"")
	private String datadoc;

	@Column(name="\"datasc\"")
	private String datasc;

	@Column(name="\"ddtanno\"")
	private String ddtanno;

	@Column(name="\"ddtnumero\"")
	private String ddtnumero;

	@Column(name="\"exported\"")
	private BigDecimal exported;

	@Column(name="\"nodo\"")
	private String nodo;

	@Column(name="\"numero\"")
	private String numero;

	@Column(name="\"numsc\"")
	private String numsc;

	@Column(name="\"prodotto\"")
	private String prodotto;

	@Column(name="\"qta\"")
	private String qta;

	@Column(name="\"riga\"")
	private String riga;

	@Column(name="\"taglia\"")
	private String taglia;

	@Column(name="\"tipo\"")
	private String tipo;

	@Column(name="\"variante\"")
	private String variante;

	public Hbdocsdata() {
	}

	public String getAnno() {
		return this.anno;
	}

	public void setAnno(String anno) {
		this.anno = anno;
	}

	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getCausale() {
		return this.causale;
	}

	public void setCausale(String causale) {
		this.causale = causale;
	}

	public String getDatadoc() {
		return this.datadoc;
	}

	public void setDatadoc(String datadoc) {
		this.datadoc = datadoc;
	}

	public String getDatasc() {
		return this.datasc;
	}

	public void setDatasc(String datasc) {
		this.datasc = datasc;
	}

	public String getDdtanno() {
		return this.ddtanno;
	}

	public void setDdtanno(String ddtanno) {
		this.ddtanno = ddtanno;
	}

	public String getDdtnumero() {
		return this.ddtnumero;
	}

	public void setDdtnumero(String ddtnumero) {
		this.ddtnumero = ddtnumero;
	}

	public BigDecimal getExported() {
		return this.exported;
	}

	public void setExported(BigDecimal exported) {
		this.exported = exported;
	}

	public String getNodo() {
		return this.nodo;
	}

	public void setNodo(String nodo) {
		this.nodo = nodo;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumsc() {
		return this.numsc;
	}

	public void setNumsc(String numsc) {
		this.numsc = numsc;
	}

	public String getProdotto() {
		return this.prodotto;
	}

	public void setProdotto(String prodotto) {
		this.prodotto = prodotto;
	}

	public String getQta() {
		return this.qta;
	}

	public void setQta(String qta) {
		this.qta = qta;
	}

	public String getRiga() {
		return this.riga;
	}

	public void setRiga(String riga) {
		this.riga = riga;
	}

	public String getTaglia() {
		return this.taglia;
	}

	public void setTaglia(String taglia) {
		this.taglia = taglia;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getVariante() {
		return this.variante;
	}

	public void setVariante(String variante) {
		this.variante = variante;
	}

}