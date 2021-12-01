package net.smart.rfid.db.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the "documents" database table.
 * 
 */
@Entity
@Table(name="documents")
public class Documents {

	@Id
	private int id;

	private Timestamp docDate;

	private Timestamp docDateClosed;

	private Timestamp docDateLastRead;
	
	private Timestamp docDateStartRead;

	private String docDestination;

	private boolean docExclusive;

	private int docNumber;

	private String docOrigin;

	private String docRef;

	private String docType;

	private boolean expected;

	private boolean fiegeExport;

	private int filterType;

	private int idDocumentType;

	private int idflow;

	private int idsite;

	private int idsiteDest;

	private int idstep;

	private boolean isTemplate;

	private String mergedDocs;

	private int originLocation;

	private String originRef;

	private int previousIddoc;

	private String status;

	public Documents() {
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