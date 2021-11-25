package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "docs" database table.
 * 
 */
@Entity
@Table(name="\"docs\"")
@NamedQuery(name="Doc.findAll", query="SELECT d FROM Doc d")
public class Doc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"coalesce\"")
	private Object coalesce;

	@Column(name="\"doc_date\"")
	private Timestamp docDate;

	@Column(name="\"doc_number\"")
	private int docNumber;

	@Column(name="\"doc_origin\"")
	private String docOrigin;

	@Column(name="\"doc_ref\"")
	private String docRef;

	@Column(name="\"id\"")
	private int id;

	@Column(name="\"idflow\"")
	private int idflow;

	@Column(name="\"idsite\"")
	private int idsite;

	@Column(name="\"idstep\"")
	private int idstep;

	@Column(name="\"previous_iddoc\"")
	private int previousIddoc;

	@Column(name="\"status\"")
	private String status;

	public Doc() {
	}

	public Object getCoalesce() {
		return this.coalesce;
	}

	public void setCoalesce(Object coalesce) {
		this.coalesce = coalesce;
	}

	public Timestamp getDocDate() {
		return this.docDate;
	}

	public void setDocDate(Timestamp docDate) {
		this.docDate = docDate;
	}

	public int getDocNumber() {
		return this.docNumber;
	}

	public void setDocNumber(int docNumber) {
		this.docNumber = docNumber;
	}

	public String getDocOrigin() {
		return this.docOrigin;
	}

	public void setDocOrigin(String docOrigin) {
		this.docOrigin = docOrigin;
	}

	public String getDocRef() {
		return this.docRef;
	}

	public void setDocRef(String docRef) {
		this.docRef = docRef;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdflow() {
		return this.idflow;
	}

	public void setIdflow(int idflow) {
		this.idflow = idflow;
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

	public int getPreviousIddoc() {
		return this.previousIddoc;
	}

	public void setPreviousIddoc(int previousIddoc) {
		this.previousIddoc = previousIddoc;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}