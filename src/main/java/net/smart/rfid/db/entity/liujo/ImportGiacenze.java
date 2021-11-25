package net.smart.rfid.db.entity.liujo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "import_giacenze" database table.
 * 
 */
@Entity
@Table(name="\"import_giacenze\"")
@NamedQuery(name="ImportGiacenze.findAll", query="SELECT i FROM ImportGiacenze i")
public class ImportGiacenze implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"pak\"")
	private String pak;

	@Column(name="\"qt\"")
	private int qt;

	@Column(name="\"sku\"")
	private String sku;

	public ImportGiacenze() {
	}

	public String getPak() {
		return this.pak;
	}

	public void setPak(String pak) {
		this.pak = pak;
	}

	public int getQt() {
		return this.qt;
	}

	public void setQt(int qt) {
		this.qt = qt;
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

}