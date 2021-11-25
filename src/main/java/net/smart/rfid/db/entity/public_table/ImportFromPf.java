package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "import_from_pf" database table.
 * 
 */
@Entity
@Table(name="\"import_from_pf\"")
@NamedQuery(name="ImportFromPf.findAll", query="SELECT i FROM ImportFromPf i")
public class ImportFromPf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"sku\"")
	private String sku;

	public ImportFromPf() {
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

}