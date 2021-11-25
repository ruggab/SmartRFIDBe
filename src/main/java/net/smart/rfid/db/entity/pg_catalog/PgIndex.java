package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_index" database table.
 * 
 */
@Entity
@Table(name="\"pg_index\"")
@NamedQuery(name="PgIndex.findAll", query="SELECT p FROM PgIndex p")
public class PgIndex implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"indcheckxmin\"")
	private boolean indcheckxmin;

	@Column(name="\"indclass\"")
	private Object indclass;

	@Column(name="\"indcollation\"")
	private Object indcollation;

	@Column(name="\"indexprs\"")
	private Object indexprs;

	@Column(name="\"indexrelid\"")
	private long indexrelid;

	@Column(name="\"indimmediate\"")
	private boolean indimmediate;

	@Column(name="\"indisclustered\"")
	private boolean indisclustered;

	@Column(name="\"indisexclusion\"")
	private boolean indisexclusion;

	@Column(name="\"indislive\"")
	private boolean indislive;

	@Column(name="\"indisprimary\"")
	private boolean indisprimary;

	@Column(name="\"indisready\"")
	private boolean indisready;

	@Column(name="\"indisreplident\"")
	private boolean indisreplident;

	@Column(name="\"indisunique\"")
	private boolean indisunique;

	@Column(name="\"indisvalid\"")
	private boolean indisvalid;

	@Column(name="\"indkey\"")
	private Object indkey;

	@Column(name="\"indnatts\"")
	private short indnatts;

	@Column(name="\"indnkeyatts\"")
	private short indnkeyatts;

	@Column(name="\"indoption\"")
	private Object indoption;

	@Column(name="\"indpred\"")
	private Object indpred;

	@Column(name="\"indrelid\"")
	private long indrelid;

	public PgIndex() {
	}

	public boolean getIndcheckxmin() {
		return this.indcheckxmin;
	}

	public void setIndcheckxmin(boolean indcheckxmin) {
		this.indcheckxmin = indcheckxmin;
	}

	public Object getIndclass() {
		return this.indclass;
	}

	public void setIndclass(Object indclass) {
		this.indclass = indclass;
	}

	public Object getIndcollation() {
		return this.indcollation;
	}

	public void setIndcollation(Object indcollation) {
		this.indcollation = indcollation;
	}

	public Object getIndexprs() {
		return this.indexprs;
	}

	public void setIndexprs(Object indexprs) {
		this.indexprs = indexprs;
	}

	public long getIndexrelid() {
		return this.indexrelid;
	}

	public void setIndexrelid(long indexrelid) {
		this.indexrelid = indexrelid;
	}

	public boolean getIndimmediate() {
		return this.indimmediate;
	}

	public void setIndimmediate(boolean indimmediate) {
		this.indimmediate = indimmediate;
	}

	public boolean getIndisclustered() {
		return this.indisclustered;
	}

	public void setIndisclustered(boolean indisclustered) {
		this.indisclustered = indisclustered;
	}

	public boolean getIndisexclusion() {
		return this.indisexclusion;
	}

	public void setIndisexclusion(boolean indisexclusion) {
		this.indisexclusion = indisexclusion;
	}

	public boolean getIndislive() {
		return this.indislive;
	}

	public void setIndislive(boolean indislive) {
		this.indislive = indislive;
	}

	public boolean getIndisprimary() {
		return this.indisprimary;
	}

	public void setIndisprimary(boolean indisprimary) {
		this.indisprimary = indisprimary;
	}

	public boolean getIndisready() {
		return this.indisready;
	}

	public void setIndisready(boolean indisready) {
		this.indisready = indisready;
	}

	public boolean getIndisreplident() {
		return this.indisreplident;
	}

	public void setIndisreplident(boolean indisreplident) {
		this.indisreplident = indisreplident;
	}

	public boolean getIndisunique() {
		return this.indisunique;
	}

	public void setIndisunique(boolean indisunique) {
		this.indisunique = indisunique;
	}

	public boolean getIndisvalid() {
		return this.indisvalid;
	}

	public void setIndisvalid(boolean indisvalid) {
		this.indisvalid = indisvalid;
	}

	public Object getIndkey() {
		return this.indkey;
	}

	public void setIndkey(Object indkey) {
		this.indkey = indkey;
	}

	public short getIndnatts() {
		return this.indnatts;
	}

	public void setIndnatts(short indnatts) {
		this.indnatts = indnatts;
	}

	public short getIndnkeyatts() {
		return this.indnkeyatts;
	}

	public void setIndnkeyatts(short indnkeyatts) {
		this.indnkeyatts = indnkeyatts;
	}

	public Object getIndoption() {
		return this.indoption;
	}

	public void setIndoption(Object indoption) {
		this.indoption = indoption;
	}

	public Object getIndpred() {
		return this.indpred;
	}

	public void setIndpred(Object indpred) {
		this.indpred = indpred;
	}

	public long getIndrelid() {
		return this.indrelid;
	}

	public void setIndrelid(long indrelid) {
		this.indrelid = indrelid;
	}

}