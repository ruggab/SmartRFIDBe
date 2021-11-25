package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "financial_calendar2" database table.
 * 
 */
@Embeddable
public class FinancialCalendar2PK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"year\"")
	private int year;

	@Column(name="\"caltype\"")
	private String caltype;

	@Column(name="\"calperiod\"")
	private int calperiod;

	@Column(name="\"customer_id\"")
	private int customerId;

	public FinancialCalendar2PK() {
	}
	public int getYear() {
		return this.year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCaltype() {
		return this.caltype;
	}
	public void setCaltype(String caltype) {
		this.caltype = caltype;
	}
	public int getCalperiod() {
		return this.calperiod;
	}
	public void setCalperiod(int calperiod) {
		this.calperiod = calperiod;
	}
	public int getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FinancialCalendar2PK)) {
			return false;
		}
		FinancialCalendar2PK castOther = (FinancialCalendar2PK)other;
		return 
			(this.year == castOther.year)
			&& this.caltype.equals(castOther.caltype)
			&& (this.calperiod == castOther.calperiod)
			&& (this.customerId == castOther.customerId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.year;
		hash = hash * prime + this.caltype.hashCode();
		hash = hash * prime + this.calperiod;
		hash = hash * prime + this.customerId;
		
		return hash;
	}
}