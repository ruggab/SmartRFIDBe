package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the "financial_calendar2" database table.
 * 
 */
@Entity
@Table(name="\"financial_calendar2\"")
@NamedQuery(name="FinancialCalendar2.findAll", query="SELECT f FROM FinancialCalendar2 f")
public class FinancialCalendar2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FinancialCalendar2PK id;

	@Temporal(TemporalType.DATE)
	@Column(name="\"fromdate\"")
	private Date fromdate;

	@Temporal(TemporalType.DATE)
	@Column(name="\"todate\"")
	private Date todate;

	public FinancialCalendar2() {
	}

	public FinancialCalendar2PK getId() {
		return this.id;
	}

	public void setId(FinancialCalendar2PK id) {
		this.id = id;
	}

	public Date getFromdate() {
		return this.fromdate;
	}

	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}

	public Date getTodate() {
		return this.todate;
	}

	public void setTodate(Date todate) {
		this.todate = todate;
	}

}