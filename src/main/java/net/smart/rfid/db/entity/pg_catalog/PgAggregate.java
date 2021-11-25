package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_aggregate" database table.
 * 
 */
@Entity
@Table(name="\"pg_aggregate\"")
@NamedQuery(name="PgAggregate.findAll", query="SELECT p FROM PgAggregate p")
public class PgAggregate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"aggcombinefn\"")
	private Object aggcombinefn;

	@Column(name="\"aggdeserialfn\"")
	private Object aggdeserialfn;

	@Column(name="\"aggfinalextra\"")
	private boolean aggfinalextra;

	@Column(name="\"aggfinalfn\"")
	private Object aggfinalfn;

	@Column(name="\"aggfinalmodify\"")
	private String aggfinalmodify;

	@Column(name="\"aggfnoid\"")
	private Object aggfnoid;

	@Column(name="\"agginitval\"")
	private String agginitval;

	@Column(name="\"aggkind\"")
	private String aggkind;

	@Column(name="\"aggmfinalextra\"")
	private boolean aggmfinalextra;

	@Column(name="\"aggmfinalfn\"")
	private Object aggmfinalfn;

	@Column(name="\"aggmfinalmodify\"")
	private String aggmfinalmodify;

	@Column(name="\"aggminitval\"")
	private String aggminitval;

	@Column(name="\"aggminvtransfn\"")
	private Object aggminvtransfn;

	@Column(name="\"aggmtransfn\"")
	private Object aggmtransfn;

	@Column(name="\"aggmtransspace\"")
	private int aggmtransspace;

	@Column(name="\"aggmtranstype\"")
	private long aggmtranstype;

	@Column(name="\"aggnumdirectargs\"")
	private short aggnumdirectargs;

	@Column(name="\"aggserialfn\"")
	private Object aggserialfn;

	@Column(name="\"aggsortop\"")
	private long aggsortop;

	@Column(name="\"aggtransfn\"")
	private Object aggtransfn;

	@Column(name="\"aggtransspace\"")
	private int aggtransspace;

	@Column(name="\"aggtranstype\"")
	private long aggtranstype;

	public PgAggregate() {
	}

	public Object getAggcombinefn() {
		return this.aggcombinefn;
	}

	public void setAggcombinefn(Object aggcombinefn) {
		this.aggcombinefn = aggcombinefn;
	}

	public Object getAggdeserialfn() {
		return this.aggdeserialfn;
	}

	public void setAggdeserialfn(Object aggdeserialfn) {
		this.aggdeserialfn = aggdeserialfn;
	}

	public boolean getAggfinalextra() {
		return this.aggfinalextra;
	}

	public void setAggfinalextra(boolean aggfinalextra) {
		this.aggfinalextra = aggfinalextra;
	}

	public Object getAggfinalfn() {
		return this.aggfinalfn;
	}

	public void setAggfinalfn(Object aggfinalfn) {
		this.aggfinalfn = aggfinalfn;
	}

	public String getAggfinalmodify() {
		return this.aggfinalmodify;
	}

	public void setAggfinalmodify(String aggfinalmodify) {
		this.aggfinalmodify = aggfinalmodify;
	}

	public Object getAggfnoid() {
		return this.aggfnoid;
	}

	public void setAggfnoid(Object aggfnoid) {
		this.aggfnoid = aggfnoid;
	}

	public String getAgginitval() {
		return this.agginitval;
	}

	public void setAgginitval(String agginitval) {
		this.agginitval = agginitval;
	}

	public String getAggkind() {
		return this.aggkind;
	}

	public void setAggkind(String aggkind) {
		this.aggkind = aggkind;
	}

	public boolean getAggmfinalextra() {
		return this.aggmfinalextra;
	}

	public void setAggmfinalextra(boolean aggmfinalextra) {
		this.aggmfinalextra = aggmfinalextra;
	}

	public Object getAggmfinalfn() {
		return this.aggmfinalfn;
	}

	public void setAggmfinalfn(Object aggmfinalfn) {
		this.aggmfinalfn = aggmfinalfn;
	}

	public String getAggmfinalmodify() {
		return this.aggmfinalmodify;
	}

	public void setAggmfinalmodify(String aggmfinalmodify) {
		this.aggmfinalmodify = aggmfinalmodify;
	}

	public String getAggminitval() {
		return this.aggminitval;
	}

	public void setAggminitval(String aggminitval) {
		this.aggminitval = aggminitval;
	}

	public Object getAggminvtransfn() {
		return this.aggminvtransfn;
	}

	public void setAggminvtransfn(Object aggminvtransfn) {
		this.aggminvtransfn = aggminvtransfn;
	}

	public Object getAggmtransfn() {
		return this.aggmtransfn;
	}

	public void setAggmtransfn(Object aggmtransfn) {
		this.aggmtransfn = aggmtransfn;
	}

	public int getAggmtransspace() {
		return this.aggmtransspace;
	}

	public void setAggmtransspace(int aggmtransspace) {
		this.aggmtransspace = aggmtransspace;
	}

	public long getAggmtranstype() {
		return this.aggmtranstype;
	}

	public void setAggmtranstype(long aggmtranstype) {
		this.aggmtranstype = aggmtranstype;
	}

	public short getAggnumdirectargs() {
		return this.aggnumdirectargs;
	}

	public void setAggnumdirectargs(short aggnumdirectargs) {
		this.aggnumdirectargs = aggnumdirectargs;
	}

	public Object getAggserialfn() {
		return this.aggserialfn;
	}

	public void setAggserialfn(Object aggserialfn) {
		this.aggserialfn = aggserialfn;
	}

	public long getAggsortop() {
		return this.aggsortop;
	}

	public void setAggsortop(long aggsortop) {
		this.aggsortop = aggsortop;
	}

	public Object getAggtransfn() {
		return this.aggtransfn;
	}

	public void setAggtransfn(Object aggtransfn) {
		this.aggtransfn = aggtransfn;
	}

	public int getAggtransspace() {
		return this.aggtransspace;
	}

	public void setAggtransspace(int aggtransspace) {
		this.aggtransspace = aggtransspace;
	}

	public long getAggtranstype() {
		return this.aggtranstype;
	}

	public void setAggtranstype(long aggtranstype) {
		this.aggtranstype = aggtranstype;
	}

}