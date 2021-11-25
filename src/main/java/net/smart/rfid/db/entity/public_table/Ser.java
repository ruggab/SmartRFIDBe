package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "ser" database table.
 * 
 */
@Entity
@Table(name="\"ser\"")
@NamedQuery(name="Ser.findAll", query="SELECT s FROM Ser s")
public class Ser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"id\"")
	private int id;

	@Column(name="\"exported\"")
	private boolean exported;

	@Column(name="\"iddoc\"")
	private int iddoc;

	public Ser() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getExported() {
		return this.exported;
	}

	public void setExported(boolean exported) {
		this.exported = exported;
	}

	public int getIddoc() {
		return this.iddoc;
	}

	public void setIddoc(int iddoc) {
		this.iddoc = iddoc;
	}

}