package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "r10" database table.
 * 
 */
@Entity
@Table(name="\"r10\"")
@NamedQuery(name="R10.findAll", query="SELECT r FROM R10 r")
public class R10 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"id\"")
	private int id;

	@Column(name="\"date\"")
	private String date;

	@Column(name="\"epc\"")
	private String epc;

	@Column(name="\"exported\"")
	private boolean exported;

	@Column(name="\"id_location_destination\"")
	private int idLocationDestination;

	@Column(name="\"id_location_origin\"")
	private int idLocationOrigin;

	@Column(name="\"id_site\"")
	private int idSite;

	@Column(name="\"iddoc\"")
	private int iddoc;

	@Column(name="\"sku\"")
	private String sku;

	public R10() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getEpc() {
		return this.epc;
	}

	public void setEpc(String epc) {
		this.epc = epc;
	}

	public boolean getExported() {
		return this.exported;
	}

	public void setExported(boolean exported) {
		this.exported = exported;
	}

	public int getIdLocationDestination() {
		return this.idLocationDestination;
	}

	public void setIdLocationDestination(int idLocationDestination) {
		this.idLocationDestination = idLocationDestination;
	}

	public int getIdLocationOrigin() {
		return this.idLocationOrigin;
	}

	public void setIdLocationOrigin(int idLocationOrigin) {
		this.idLocationOrigin = idLocationOrigin;
	}

	public int getIdSite() {
		return this.idSite;
	}

	public void setIdSite(int idSite) {
		this.idSite = idSite;
	}

	public int getIddoc() {
		return this.iddoc;
	}

	public void setIddoc(int iddoc) {
		this.iddoc = iddoc;
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

}