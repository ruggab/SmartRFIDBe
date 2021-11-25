package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "documents_toclose" database table.
 * 
 */
@Embeddable
public class DocumentsToclosePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"iddoc\"")
	private int iddoc;

	@Column(name="\"epc\"")
	private String epc;

	public DocumentsToclosePK() {
	}
	public int getIddoc() {
		return this.iddoc;
	}
	public void setIddoc(int iddoc) {
		this.iddoc = iddoc;
	}
	public String getEpc() {
		return this.epc;
	}
	public void setEpc(String epc) {
		this.epc = epc;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DocumentsToclosePK)) {
			return false;
		}
		DocumentsToclosePK castOther = (DocumentsToclosePK)other;
		return 
			(this.iddoc == castOther.iddoc)
			&& this.epc.equals(castOther.epc);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.iddoc;
		hash = hash * prime + this.epc.hashCode();
		
		return hash;
	}
}