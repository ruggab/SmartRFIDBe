package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "documents" database table.
 * 
 */
@Entity
@Table(name="\"documents\"")
@NamedQuery(name="Document.findAll", query="SELECT d FROM Document d")
public class Document implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"id\"")
	private int id;

	@Column(name="\"doc_date\"")
	private Timestamp docDate;

	@Column(name="\"doc_date_closed\"")
	private Timestamp docDateClosed;

	@Column(name="\"doc_date_last_read\"")
	private Timestamp docDateLastRead;

	@Column(name="\"doc_date_start_read\"")
	private Timestamp docDateStartRead;

	@Column(name="\"doc_destination\"")
	private String docDestination;

	@Column(name="\"doc_exclusive\"")
	private boolean docExclusive;

	@Column(name="\"doc_number\"")
	private int docNumber;

	@Column(name="\"doc_origin\"")
	private String docOrigin;

	@Column(name="\"doc_ref\"")
	private String docRef;

	@Column(name="\"doc_type\"")
	private String docType;

	@Column(name="\"expected\"")
	private boolean expected;

	@Column(name="\"fiege_export\"")
	private boolean fiegeExport;

	@Column(name="\"filter_type\"")
	private int filterType;

	@Column(name="\"id_document_type\"")
	private int idDocumentType;

	@Column(name="\"idflow\"")
	private int idflow;

	@Column(name="\"idsite\"")
	private int idsite;

	@Column(name="\"idsite_dest\"")
	private int idsiteDest;

	@Column(name="\"idstep\"")
	private int idstep;

	@Column(name="\"is_template\"")
	private boolean isTemplate;

	@Column(name="\"merged_docs\"")
	private String mergedDocs;

	@Column(name="\"origin_location\"")
	private int originLocation;

	@Column(name="\"origin_ref\"")
	private String originRef;

	@Column(name="\"previous_iddoc\"")
	private int previousIddoc;

	@Column(name="\"status\"")
	private String status;

	public Document() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getDocDate() {
		return this.docDate;
	}

	public void setDocDate(Timestamp docDate) {
		this.docDate = docDate;
	}

	public Timestamp getDocDateClosed() {
		return this.docDateClosed;
	}

	public void setDocDateClosed(Timestamp docDateClosed) {
		this.docDateClosed = docDateClosed;
	}

	public Timestamp getDocDateLastRead() {
		return this.docDateLastRead;
	}

	public void setDocDateLastRead(Timestamp docDateLastRead) {
		this.docDateLastRead = docDateLastRead;
	}

	public Timestamp getDocDateStartRead() {
		return this.docDateStartRead;
	}

	public void setDocDateStartRead(Timestamp docDateStartRead) {
		this.docDateStartRead = docDateStartRead;
	}

	public String getDocDestination() {
		return this.docDestination;
	}

	public void setDocDestination(String docDestination) {
		this.docDestination = docDestination;
	}

	public boolean getDocExclusive() {
		return this.docExclusive;
	}

	public void setDocExclusive(boolean docExclusive) {
		this.docExclusive = docExclusive;
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

	public String getDocType() {
		return this.docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public boolean getExpected() {
		return this.expected;
	}

	public void setExpected(boolean expected) {
		this.expected = expected;
	}

	public boolean getFiegeExport() {
		return this.fiegeExport;
	}

	public void setFiegeExport(boolean fiegeExport) {
		this.fiegeExport = fiegeExport;
	}

	public int getFilterType() {
		return this.filterType;
	}

	public void setFilterType(int filterType) {
		this.filterType = filterType;
	}

	public int getIdDocumentType() {
		return this.idDocumentType;
	}

	public void setIdDocumentType(int idDocumentType) {
		this.idDocumentType = idDocumentType;
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

	public int getIdsiteDest() {
		return this.idsiteDest;
	}

	public void setIdsiteDest(int idsiteDest) {
		this.idsiteDest = idsiteDest;
	}

	public int getIdstep() {
		return this.idstep;
	}

	public void setIdstep(int idstep) {
		this.idstep = idstep;
	}

	public boolean getIsTemplate() {
		return this.isTemplate;
	}

	public void setIsTemplate(boolean isTemplate) {
		this.isTemplate = isTemplate;
	}

	public String getMergedDocs() {
		return this.mergedDocs;
	}

	public void setMergedDocs(String mergedDocs) {
		this.mergedDocs = mergedDocs;
	}

	public int getOriginLocation() {
		return this.originLocation;
	}

	public void setOriginLocation(int originLocation) {
		this.originLocation = originLocation;
	}

	public String getOriginRef() {
		return this.originRef;
	}

	public void setOriginRef(String originRef) {
		this.originRef = originRef;
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