package net.smart.rfid.db.entity.transact;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "log" database table.
 * 
 */
@Entity
@Table(name="\"log\"")
@NamedQuery(name="Log.findAll", query="SELECT l FROM Log l")
public class Log implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"elaborated\"")
	private boolean elaborated;

	@Column(name="\"elaborationresult\"")
	private String elaborationresult;

	@Column(name="\"elaborationtimestamp\"")
	private String elaborationtimestamp;

	@Column(name="\"error\"")
	private boolean error;

	@Column(name="\"filename\"")
	private String filename;

	@Column(name="\"importtimestamp\"")
	private String importtimestamp;

	@Column(name="\"size\"")
	private String size;

	public Log() {
	}

	public boolean getElaborated() {
		return this.elaborated;
	}

	public void setElaborated(boolean elaborated) {
		this.elaborated = elaborated;
	}

	public String getElaborationresult() {
		return this.elaborationresult;
	}

	public void setElaborationresult(String elaborationresult) {
		this.elaborationresult = elaborationresult;
	}

	public String getElaborationtimestamp() {
		return this.elaborationtimestamp;
	}

	public void setElaborationtimestamp(String elaborationtimestamp) {
		this.elaborationtimestamp = elaborationtimestamp;
	}

	public boolean getError() {
		return this.error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getImporttimestamp() {
		return this.importtimestamp;
	}

	public void setImporttimestamp(String importtimestamp) {
		this.importtimestamp = importtimestamp;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}