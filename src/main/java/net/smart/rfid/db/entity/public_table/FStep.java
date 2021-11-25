package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "f_step" database table.
 * 
 */
@Entity
@Table(name="\"f_step\"")
@NamedQuery(name="FStep.findAll", query="SELECT f FROM FStep f")
public class FStep implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"idstep\"")
	private int idstep;

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

	@Column(name="\"idsteptype\"")
	private int idsteptype;

	@Column(name="\"type\"")
	private String type;

	@Column(name="\"valtype\"")
	private String valtype;

	public FStep() {
	}

	public int getIdstep() {
		return this.idstep;
	}

	public void setIdstep(int idstep) {
		this.idstep = idstep;
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