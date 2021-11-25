package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_rewrite" database table.
 * 
 */
@Entity
@Table(name="\"pg_rewrite\"")
@NamedQuery(name="PgRewrite.findAll", query="SELECT p FROM PgRewrite p")
public class PgRewrite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"ev_action\"")
	private Object evAction;

	@Column(name="\"ev_class\"")
	private long evClass;

	@Column(name="\"ev_enabled\"")
	private String evEnabled;

	@Column(name="\"ev_qual\"")
	private Object evQual;

	@Column(name="\"ev_type\"")
	private String evType;

	@Column(name="\"is_instead\"")
	private boolean isInstead;

	@Column(name="\"oid\"")
	private long oid;

	@Column(name="\"rulename\"")
	private String rulename;

	public PgRewrite() {
	}

	public Object getEvAction() {
		return this.evAction;
	}

	public void setEvAction(Object evAction) {
		this.evAction = evAction;
	}

	public long getEvClass() {
		return this.evClass;
	}

	public void setEvClass(long evClass) {
		this.evClass = evClass;
	}

	public String getEvEnabled() {
		return this.evEnabled;
	}

	public void setEvEnabled(String evEnabled) {
		this.evEnabled = evEnabled;
	}

	public Object getEvQual() {
		return this.evQual;
	}

	public void setEvQual(Object evQual) {
		this.evQual = evQual;
	}

	public String getEvType() {
		return this.evType;
	}

	public void setEvType(String evType) {
		this.evType = evType;
	}

	public boolean getIsInstead() {
		return this.isInstead;
	}

	public void setIsInstead(boolean isInstead) {
		this.isInstead = isInstead;
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public String getRulename() {
		return this.rulename;
	}

	public void setRulename(String rulename) {
		this.rulename = rulename;
	}

}