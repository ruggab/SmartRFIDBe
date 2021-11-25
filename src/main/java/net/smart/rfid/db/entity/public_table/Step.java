package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "step" database table.
 * 
 */
@Entity
@Table(name="\"step\"")
@NamedQuery(name="Step.findAll", query="SELECT s FROM Step s")
public class Step implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"can_create_doc\"")
	private boolean canCreateDoc;

	@Column(name="\"color\"")
	private String color;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"idflow\"")
	private int idflow;

	@Column(name="\"idinterface\"")
	private int idinterface;

	@Column(name="\"idstep\"")
	private int idstep;

	@Column(name="\"idsteptype\"")
	private int idsteptype;

	@Column(name="\"type\"")
	private String type;

	@Column(name="\"valtype\"")
	private String valtype;

	public Step() {
	}

	public boolean getCanCreateDoc() {
		return this.canCreateDoc;
	}

	public void setCanCreateDoc(boolean canCreateDoc) {
		this.canCreateDoc = canCreateDoc;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public int getIdstep() {
		return this.idstep;
	}

	public void setIdstep(int idstep) {
		this.idstep = idstep;
	}

	public int getIdsteptype() {
		return this.idsteptype;
	}

	public void setIdsteptype(int idsteptype) {
		this.idsteptype = idsteptype;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValtype() {
		return this.valtype;
	}

	public void setValtype(String valtype) {
		this.valtype = valtype;
	}

}