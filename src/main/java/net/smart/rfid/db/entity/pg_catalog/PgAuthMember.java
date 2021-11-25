package net.smart.rfid.db.entity.pg_catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pg_auth_members" database table.
 * 
 */
@Entity
@Table(name="\"pg_auth_members\"")
@NamedQuery(name="PgAuthMember.findAll", query="SELECT p FROM PgAuthMember p")
public class PgAuthMember implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"admin_option\"")
	private boolean adminOption;

	@Column(name="\"grantor\"")
	private long grantor;

	@Column(name="\"member\"")
	private long member;

	@Column(name="\"roleid\"")
	private long roleid;

	public PgAuthMember() {
	}

	public boolean getAdminOption() {
		return this.adminOption;
	}

	public void setAdminOption(boolean adminOption) {
		this.adminOption = adminOption;
	}

	public long getGrantor() {
		return this.grantor;
	}

	public void setGrantor(long grantor) {
		this.grantor = grantor;
	}

	public long getMember() {
		return this.member;
	}

	public void setMember(long member) {
		this.member = member;
	}

	public long getRoleid() {
		return this.roleid;
	}

	public void setRoleid(long roleid) {
		this.roleid = roleid;
	}

}