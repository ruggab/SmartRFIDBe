package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "rel_reader_site" database table.
 * 
 */
@Entity
@Table(name="\"rel_reader_site\"")
@NamedQuery(name="RelReaderSite.findAll", query="SELECT r FROM RelReaderSite r")
public class RelReaderSite implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RelReaderSitePK id;

	@Column(name="\"config\"")
	private Object config;

	public RelReaderSite() {
	}

	public RelReaderSitePK getId() {
		return this.id;
	}

	public void setId(RelReaderSitePK id) {
		this.id = id;
	}

	public Object getConfig() {
		return this.config;
	}

	public void setConfig(Object config) {
		this.config = config;
	}

}