package net.smart.rfid.db.entity.transact;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "variation" database table.
 * 
 */
@Entity
@Table(name="\"variation\"")
@NamedQuery(name="Variation.findAll", query="SELECT v FROM Variation v")
public class Variation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"code\"")
	private String code;

	@Column(name="\"colourcode\"")
	private int colourcode;

	@Column(name="\"colourname\"")
	private String colourname;

	@Column(name="\"empty1\"")
	private String empty1;

	@Column(name="\"filename\"")
	private String filename;

	@Column(name="\"productid\"")
	private int productid;

	@Column(name="\"size\"")
	private String size;

	@Column(name="\"skuid\"")
	private String skuid;

	public Variation() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getColourcode() {
		return this.colourcode;
	}

	public void setColourcode(int colourcode) {
		this.colourcode = colourcode;
	}

	public String getColourname() {
		return this.colourname;
	}

	public void setColourname(String colourname) {
		this.colourname = colourname;
	}

	public String getEmpty1() {
		return this.empty1;
	}

	public void setEmpty1(String empty1) {
		this.empty1 = empty1;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public int getProductid() {
		return this.productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSkuid() {
		return this.skuid;
	}

	public void setSkuid(String skuid) {
		this.skuid = skuid;
	}

}