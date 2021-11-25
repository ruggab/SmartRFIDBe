package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_shdescription" database table.
 * 
 */
@Entity
@Table(name="\"pg_shdescription\"")
@NamedQuery(name="PgShdescription.findAll", query="SELECT p FROM PgShdescription p")
public class PgShdescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"classoid\"")
	private long classoid;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"objoid\"")
	private long objoid;

	public PgShdescription() {
	}

	public long getClassoid() {
		return this.classoid;
	}

	public void setClassoid(long classoid) {
		this.classoid = classoid;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getObjoid() {
		return this.objoid;
	}

	public void setObjoid(long objoid) {
		this.objoid = objoid;
	}

}