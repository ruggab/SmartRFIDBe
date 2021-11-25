package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "vw_step" database table.
 * 
 */
@Entity
@Table(name="\"vw_step\"")
@NamedQuery(name="VwStep.findAll", query="SELECT v FROM VwStep v")
public class VwStep implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"can_create_doc\"")
	private boolean canCreateDoc;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"docs\"")
	private Object docs;

	@Column(name="\"idclient\"")
	private int idclient;

	@Column(name="\"idflow\"")
	private int idflow;

	@Column(name="\"idinterface\"")
	private int idinterface;

	@Column(name="\"idsite\"")
	private int idsite;

	@Column(name="\"idstep\"")
	private int idstep;

	@Column(name="\"readers\"")
	private Object readers;

	@Column(name="\"sites\"")
	private Object sites;

	public VwStep() {
	}

	public boolean getCanCreateDoc() {
		return this.canCreateDoc;
	}

	public void setCanCreateDoc(boolean canCreateDoc) {
		this.canCreateDoc = canCreateDoc;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Object getDocs() {
		return this.docs;
	}

	public void setDocs(Object docs) {
		this.docs = docs;
	}

	public int getIdclient() {
		return this.idclient;
	}

	public void setIdclient(int idclient) {
		this.idclient = idclient;
	}

	public int getIdflow() {
		return this.idflow;
	}

	public void setIdflow(int idflow) {
		this.idflow = idflow;
	}

	public int getIdinterface() {
		return this.idinterface;
	}

	public void setIdinterface(int idinterface) {
		this.idinterface = idinterface;
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

	public Object getReaders() {
		return this.readers;
	}

	public void setReaders(Object readers) {
		this.readers = readers;
	}

	public Object getSites() {
		return this.sites;
	}

	public void setSites(Object sites) {
		this.sites = sites;
	}

}