package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "analisidoc" database table.
 * 
 */
@Entity
@Table(name="\"analisidoc\"")
@NamedQuery(name="Analisidoc.findAll", query="SELECT a FROM Analisidoc a")
public class Analisidoc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"doc_date\"")
	private Timestamp docDate;

	@Column(name="\"doc_ref\"")
	private String docRef;

	@Column(name="\"durata\"")
	private Object durata;

	@Column(name="\"fine\"")
	private Timestamp fine;

	@Column(name="\"id\"")
	private int id;

	@Column(name="\"idsite\"")
	private int idsite;

	@Column(name="\"idstep\"")
	private int idstep;

	@Column(name="\"inizio\"")
	private Timestamp inizio;

	@Column(name="\"pezzi\"")
	private long pezzi;

	@Column(name="\"tempo_medio\"")
	private Object tempoMedio;

	public Analisidoc() {
	}

	public Timestamp getDocDate() {
		return this.docDate;
	}

	public void setDocDate(Timestamp docDate) {
		this.docDate = docDate;
	}

	public String getDocRef() {
		return this.docRef;
	}

	public void setDocRef(String docRef) {
		this.docRef = docRef;
	}

	public Object getDurata() {
		return this.durata;
	}

	public void setDurata(Object durata) {
		this.durata = durata;
	}

	public Timestamp getFine() {
		return this.fine;
	}

	public void setFine(Timestamp fine) {
		this.fine = fine;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdsite() {
		return this.idsite;
	}

	public void setIdsite(int idsite) {
		this.idsite = idsite;
	}

	public int getIdstep() {
		return this.idstep;
	}

	public void setIdstep(int idstep) {
		this.idstep = idstep;
	}

	public Timestamp getInizio() {
		return this.inizio;
	}

	public void setInizio(Timestamp inizio) {
		this.inizio = inizio;
	}

	public long getPezzi() {
		return this.pezzi;
	}

	public void setPezzi(long pezzi) {
		this.pezzi = pezzi;
	}

	public Object getTempoMedio() {
		return this.tempoMedio;
	}

	public void setTempoMedio(Object tempoMedio) {
		this.tempoMedio = tempoMedio;
	}

}