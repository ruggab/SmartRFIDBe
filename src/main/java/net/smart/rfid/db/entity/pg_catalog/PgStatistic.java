package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_statistic" database table.
 * 
 */
@Entity
@Table(name="\"pg_statistic\"")
@NamedQuery(name="PgStatistic.findAll", query="SELECT p FROM PgStatistic p")
public class PgStatistic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"staattnum\"")
	private short staattnum;

	@Column(name="\"stacoll1\"")
	private long stacoll1;

	@Column(name="\"stacoll2\"")
	private long stacoll2;

	@Column(name="\"stacoll3\"")
	private long stacoll3;

	@Column(name="\"stacoll4\"")
	private long stacoll4;

	@Column(name="\"stacoll5\"")
	private long stacoll5;

	@Column(name="\"stadistinct\"")
	private float stadistinct;

	@Column(name="\"stainherit\"")
	private boolean stainherit;

	@Column(name="\"stakind1\"")
	private short stakind1;

	@Column(name="\"stakind2\"")
	private short stakind2;

	@Column(name="\"stakind3\"")
	private short stakind3;

	@Column(name="\"stakind4\"")
	private short stakind4;

	@Column(name="\"stakind5\"")
	private short stakind5;

	@Column(name="\"stanullfrac\"")
	private float stanullfrac;

	@Column(name="\"stanumbers1\"")
	private Object stanumbers1;

	@Column(name="\"stanumbers2\"")
	private Object stanumbers2;

	@Column(name="\"stanumbers3\"")
	private Object stanumbers3;

	@Column(name="\"stanumbers4\"")
	private Object stanumbers4;

	@Column(name="\"stanumbers5\"")
	private Object stanumbers5;

	@Column(name="\"staop1\"")
	private long staop1;

	@Column(name="\"staop2\"")
	private long staop2;

	@Column(name="\"staop3\"")
	private long staop3;

	@Column(name="\"staop4\"")
	private long staop4;

	@Column(name="\"staop5\"")
	private long staop5;

	@Column(name="\"starelid\"")
	private long starelid;

	@Column(name="\"stavalues1\"")
	private Object stavalues1;

	@Column(name="\"stavalues2\"")
	private Object stavalues2;

	@Column(name="\"stavalues3\"")
	private Object stavalues3;

	@Column(name="\"stavalues4\"")
	private Object stavalues4;

	@Column(name="\"stavalues5\"")
	private Object stavalues5;

	@Column(name="\"stawidth\"")
	private int stawidth;

	public PgStatistic() {
	}

	public short getStaattnum() {
		return this.staattnum;
	}

	public void setStaattnum(short staattnum) {
		this.staattnum = staattnum;
	}

	public long getStacoll1() {
		return this.stacoll1;
	}

	public void setStacoll1(long stacoll1) {
		this.stacoll1 = stacoll1;
	}

	public long getStacoll2() {
		return this.stacoll2;
	}

	public void setStacoll2(long stacoll2) {
		this.stacoll2 = stacoll2;
	}

	public long getStacoll3() {
		return this.stacoll3;
	}

	public void setStacoll3(long stacoll3) {
		this.stacoll3 = stacoll3;
	}

	public long getStacoll4() {
		return this.stacoll4;
	}

	public void setStacoll4(long stacoll4) {
		this.stacoll4 = stacoll4;
	}

	public long getStacoll5() {
		return this.stacoll5;
	}

	public void setStacoll5(long stacoll5) {
		this.stacoll5 = stacoll5;
	}

	public float getStadistinct() {
		return this.stadistinct;
	}

	public void setStadistinct(float stadistinct) {
		this.stadistinct = stadistinct;
	}

	public boolean getStainherit() {
		return this.stainherit;
	}

	public void setStainherit(boolean stainherit) {
		this.stainherit = stainherit;
	}

	public short getStakind1() {
		return this.stakind1;
	}

	public void setStakind1(short stakind1) {
		this.stakind1 = stakind1;
	}

	public short getStakind2() {
		return this.stakind2;
	}

	public void setStakind2(short stakind2) {
		this.stakind2 = stakind2;
	}

	public short getStakind3() {
		return this.stakind3;
	}

	public void setStakind3(short stakind3) {
		this.stakind3 = stakind3;
	}

	public short getStakind4() {
		return this.stakind4;
	}

	public void setStakind4(short stakind4) {
		this.stakind4 = stakind4;
	}

	public short getStakind5() {
		return this.stakind5;
	}

	public void setStakind5(short stakind5) {
		this.stakind5 = stakind5;
	}

	public float getStanullfrac() {
		return this.stanullfrac;
	}

	public void setStanullfrac(float stanullfrac) {
		this.stanullfrac = stanullfrac;
	}

	public Object getStanumbers1() {
		return this.stanumbers1;
	}

	public void setStanumbers1(Object stanumbers1) {
		this.stanumbers1 = stanumbers1;
	}

	public Object getStanumbers2() {
		return this.stanumbers2;
	}

	public void setStanumbers2(Object stanumbers2) {
		this.stanumbers2 = stanumbers2;
	}

	public Object getStanumbers3() {
		return this.stanumbers3;
	}

	public void setStanumbers3(Object stanumbers3) {
		this.stanumbers3 = stanumbers3;
	}

	public Object getStanumbers4() {
		return this.stanumbers4;
	}

	public void setStanumbers4(Object stanumbers4) {
		this.stanumbers4 = stanumbers4;
	}

	public Object getStanumbers5() {
		return this.stanumbers5;
	}

	public void setStanumbers5(Object stanumbers5) {
		this.stanumbers5 = stanumbers5;
	}

	public long getStaop1() {
		return this.staop1;
	}

	public void setStaop1(long staop1) {
		this.staop1 = staop1;
	}

	public long getStaop2() {
		return this.staop2;
	}

	public void setStaop2(long staop2) {
		this.staop2 = staop2;
	}

	public long getStaop3() {
		return this.staop3;
	}

	public void setStaop3(long staop3) {
		this.staop3 = staop3;
	}

	public long getStaop4() {
		return this.staop4;
	}

	public void setStaop4(long staop4) {
		this.staop4 = staop4;
	}

	public long getStaop5() {
		return this.staop5;
	}

	public void setStaop5(long staop5) {
		this.staop5 = staop5;
	}

	public long getStarelid() {
		return this.starelid;
	}

	public void setStarelid(long starelid) {
		this.starelid = starelid;
	}

	public Object getStavalues1() {
		return this.stavalues1;
	}

	public void setStavalues1(Object stavalues1) {
		this.stavalues1 = stavalues1;
	}

	public Object getStavalues2() {
		return this.stavalues2;
	}

	public void setStavalues2(Object stavalues2) {
		this.stavalues2 = stavalues2;
	}

	public Object getStavalues3() {
		return this.stavalues3;
	}

	public void setStavalues3(Object stavalues3) {
		this.stavalues3 = stavalues3;
	}

	public Object getStavalues4() {
		return this.stavalues4;
	}

	public void setStavalues4(Object stavalues4) {
		this.stavalues4 = stavalues4;
	}

	public Object getStavalues5() {
		return this.stavalues5;
	}

	public void setStavalues5(Object stavalues5) {
		this.stavalues5 = stavalues5;
	}

	public int getStawidth() {
		return this.stawidth;
	}

	public void setStawidth(int stawidth) {
		this.stawidth = stawidth;
	}

}