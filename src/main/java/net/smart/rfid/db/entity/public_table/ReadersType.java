package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "readers_type" database table.
 * 
 */
@Entity
@Table(name="\"readers_type\"")
@NamedQuery(name="ReadersType.findAll", query="SELECT r FROM ReadersType r")
public class ReadersType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"id\"")
	private int id;

	@Column(name="\"description\"")
	private String description;

	public ReadersType() {
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

}