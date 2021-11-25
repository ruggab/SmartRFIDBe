package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "filters" database table.
 * 
 */
@Entity
@Table(name="\"filters\"")
@NamedQuery(name="Filter.findAll", query="SELECT f FROM Filter f")
public class Filter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"id\"")
	private int id;

	@Column(name="\"end\"")
	private int end;

	@Column(name="\"id_customer\"")
	private int idCustomer;

	@Column(name="\"operation\"")
	private String operation;

	@Column(name="\"start\"")
	private int start;

	@Column(name="\"type\"")
	private String type;

	@Column(name="\"value\"")
	private String value;

	public Filter() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEnd() {
		return this.end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getIdCustomer() {
		return this.idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public int getStart() {
		return this.start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}