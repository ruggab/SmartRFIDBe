package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "printers_templates" database table.
 * 
 */
@Entity
@Table(name="\"printers_templates\"")
@NamedQuery(name="PrintersTemplate.findAll", query="SELECT p FROM PrintersTemplate p")
public class PrintersTemplate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"id\"")
	private int id;

	@Column(name="\"id_customer\"")
	private int idCustomer;

	@Column(name="\"name\"")
	private String name;

	@Column(name="\"zpl\"")
	private String zpl;

	public PrintersTemplate() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdCustomer() {
		return this.idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZpl() {
		return this.zpl;
	}

	public void setZpl(String zpl) {
		this.zpl = zpl;
	}

}