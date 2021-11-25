package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "rel_doctype_reason" database table.
 * 
 */
@Entity
@Table(name="\"rel_doctype_reason\"")
@NamedQuery(name="RelDoctypeReason.findAll", query="SELECT r FROM RelDoctypeReason r")
public class RelDoctypeReason implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RelDoctypeReasonPK id;

	public RelDoctypeReason() {
	}

	public RelDoctypeReasonPK getId() {
		return this.id;
	}

	public void setId(RelDoctypeReasonPK id) {
		this.id = id;
	}

}