package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "active_docs2" database table.
 * 
 */
@Entity
@Table(name="\"active_docs2\"")
@NamedQuery(name="ActiveDocs2.findAll", query="SELECT a FROM ActiveDocs2 a")
public class ActiveDocs2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"doc_date\"")
	private Timestamp docDate;

	@Column(name="\"doc_number\"")
	private int docNumber;

	@Column(name="\"doc_origin\"")
	private String docOrigin;

	@Column(name="\"doc_ref\"")
	private String docRef;

	@Column(name="\"documents_detail\"")
	private Object documentsDetail;

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

	public ActiveDocs2() {
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

	public Object getDocumentsDetail() {
		return this.documentsDetail;
	}

	public void setDocumentsDetail(Object documentsDetail) {
		this.documentsDetail = documentsDetail;
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