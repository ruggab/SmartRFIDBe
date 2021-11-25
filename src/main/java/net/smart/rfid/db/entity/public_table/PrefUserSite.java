package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "pref_user_sites" database table.
 * 
 */
@Entity
@Table(name="\"pref_user_sites\"")
@NamedQuery(name="PrefUserSite.findAll", query="SELECT p FROM PrefUserSite p")
public class PrefUserSite implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PrefUserSitePK id;

	public PrefUserSite() {
	}

	public PrefUserSitePK getId() {
		return this.id;
	}

	public void setId(PrefUserSitePK id) {
		this.id = id;
	}

}