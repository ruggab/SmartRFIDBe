package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "vw_readers" database table.
 * 
 */
@Entity
@Table(name="\"vw_readers\"")
@NamedQuery(name="VwReader.findAll", query="SELECT v FROM VwReader v")
public class VwReader implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"id\"")
	private int id;

	@Column(name="\"idreader\"")
	private int idreader;

	@Column(name="\"idsite\"")
	private int idsite;

	@Column(name="\"idstep\"")
	private int idstep;

	@Column(name="\"ip\"")
	private String ip;

	@Column(name="\"port\"")
	private int port;

	@Column(name="\"reader_type\"")
	private int readerType;

	public VwReader() {
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdreader() {
		return this.idreader;
	}

	public void setIdreader(int idreader) {
		this.idreader = idreader;
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

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPort() {
		return this.port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getReaderType() {
		return this.readerType;
	}

	public void setReaderType(int readerType) {
		this.readerType = readerType;
	}

}