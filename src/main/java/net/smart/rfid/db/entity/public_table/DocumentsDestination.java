package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "documents_destination" database table.
 * 
 */
@Entity
@Table(name="\"documents_destination\"")
@NamedQuery(name="DocumentsDestination.findAll", query="SELECT d FROM DocumentsDestination d")
public class DocumentsDestination implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DocumentsDestinationPK id;

	public DocumentsDestination() {
	}

	public DocumentsDestinationPK getId() {
		return this.id;
	}

	public void setId(DocumentsDestinationPK id) {
		this.id = id;
	}

}