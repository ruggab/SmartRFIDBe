package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the "docs_dash" database table.
 * 
 */
@Entity
@Table(name="\"docs_dash\"")
@NamedQuery(name="DocsDash.findAll", query="SELECT d FROM DocsDash d")
public class DocsDash implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="\"doc_date\"")
	private Date docDate;

	@Column(name="\"doc_number\"")
	private int docNumber;

	@Column(name="\"doc_ref\"")
	private String docRef;

	@Column(name="\"iddoc\"")
	private int iddoc;

	@Column(name="\"idsite\"")
	private int idsite;

	@Column(name="\"idstep\"")
	private int idstep;

	@Column(name="\"nr_row\"")
	private long nrRow;

	@Column(name="\"site_description\"")
	private String siteDescription;

	@Column(name="\"status\"")
	private String status;

	@Column(name="\"step_description\"")
	private String stepDescription;

	public DocsDash() {
	}

	public Date getDocDate() {
		return this.docDate;
	}

	public void setDocDate(Date docDate) {
		this.docDate = docDate;
	}

	public int getDocNumber() {
		return this.docNumber;
	}

	public void setDocNumber(int docNumber) {
		this.docNumber = docNumber;
	}

	public String getDocRef() {
		return this.docRef;
	}

	public void setDocRef(String docRef) {
		this.docRef = docRef;
	}

	public int getIddoc() {
		return this.iddoc;
	}

	public void setIddoc(int iddoc) {
		this.iddoc = iddoc;
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

	public long getNrRow() {
		return this.nrRow;
	}

	public void setNrRow(long nrRow) {
		this.nrRow = nrRow;
	}

	public String getSiteDescription() {
		return this.siteDescription;
	}

	public void setSiteDescription(String siteDescription) {
		this.siteDescription = siteDescription;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStepDescription() {
		return this.stepDescription;
	}

	public void setStepDescription(String stepDescription) {
		this.stepDescription = stepDescription;
	}

}