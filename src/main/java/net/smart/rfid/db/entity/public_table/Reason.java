package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "reason" database table.
 * 
 */
@Entity
@Table(name="\"reason\"")
@NamedQuery(name="Reason.findAll", query="SELECT r FROM Reason r")
public class Reason implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"id\"")
	private int id;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"id_customer\"")
	private int idCustomer;

	@Column(name="\"idlocation_type_in\"")
	private int idlocationTypeIn;

	@Column(name="\"idlocation_type_out\"")
	private int idlocationTypeOut;

	@Column(name="\"sign\"")
	private String sign;

	public Reason() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIdCustomer() {
		return this.idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	public int getIdlocationTypeIn() {
		return this.idlocationTypeIn;
	}

	public void setIdlocationTypeIn(int idlocationTypeIn) {
		this.idlocationTypeIn = idlocationTypeIn;
	}

	public int getIdlocationTypeOut() {
		return this.idlocationTypeOut;
	}

	public void setIdlocationTypeOut(int idlocationTypeOut) {
		this.idlocationTypeOut = idlocationTypeOut;
	}

	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

}