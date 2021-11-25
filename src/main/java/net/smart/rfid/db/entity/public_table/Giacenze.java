package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the "giacenze" database table.
 * 
 */
@Entity
@Table(name="\"giacenze\"")
@NamedQuery(name="Giacenze.findAll", query="SELECT g FROM Giacenze g")
public class Giacenze implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"nodo\"")
	private String nodo;

	@Column(name="\"parametrose\"")
	private String parametrose;

	@Column(name="\"prodotto\"")
	private String prodotto;

	@Column(name="\"qta\"")
	private BigDecimal qta;

	@Column(name="\"taglia\"")
	private String taglia;

	@Column(name="\"variante\"")
	private String variante;

	public Giacenze() {
	}

	public String getNodo() {
		return this.nodo;
	}

	public void setNodo(String nodo) {
		this.nodo = nodo;
	}

	public String getParametrose() {
		return this.parametrose;
	}

	public void setParametrose(String parametrose) {
		this.parametrose = parametrose;
	}

	public String getProdotto() {
		return this.prodotto;
	}

	public void setProdotto(String prodotto) {
		this.prodotto = prodotto;
	}

	public BigDecimal getQta() {
		return this.qta;
	}

	public void setQta(BigDecimal qta) {
		this.qta = qta;
	}

	public String getTaglia() {
		return this.taglia;
	}

	public void setTaglia(String taglia) {
		this.taglia = taglia;
	}

	public String getVariante() {
		return this.variante;
	}

	public void setVariante(String variante) {
		this.variante = variante;
	}

}