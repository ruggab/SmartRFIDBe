package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_largeobject" database table.
 * 
 */
@Entity
@Table(name="\"pg_largeobject\"")
@NamedQuery(name="PgLargeobject.findAll", query="SELECT p FROM PgLargeobject p")
public class PgLargeobject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"data\"")
	private byte[] data;

	@Column(name="\"loid\"")
	private long loid;

	@Column(name="\"pageno\"")
	private int pageno;

	public PgLargeobject() {
	}

	public byte[] getData() {
		return this.data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public long getLoid() {
		return this.loid;
	}

	public void setLoid(long loid) {
		this.loid = loid;
	}

	public int getPageno() {
		return this.pageno;
	}

	public void setPageno(int pageno) {
		this.pageno = pageno;
	}

}