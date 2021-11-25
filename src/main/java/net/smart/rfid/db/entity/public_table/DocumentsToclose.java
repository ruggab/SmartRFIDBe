package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "documents_toclose" database table.
 * 
 */
@Entity
@Table(name="\"documents_toclose\"")
@NamedQuery(name="DocumentsToclose.findAll", query="SELECT d FROM DocumentsToclose d")
public class DocumentsToclose implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DocumentsToclosePK id;

	@Column(name="\"sku\"")
	private String sku;

	public DocumentsToclose() {
	}

	public DocumentsToclosePK getId() {
		return this.id;
	}

	public void setId(DocumentsToclosePK id) {
		this.id = id;
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

}