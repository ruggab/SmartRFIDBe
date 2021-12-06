package net.smart.rfid.response;

import java.util.List;

import net.smart.rfid.db.repository.ScannerDetailRepository.CheckLocation;

public class CheckScanResp {
	private Integer iddoc;

	private Integer expected;

	private Integer readed;

	private boolean compliance;

	private boolean overload;

	private List<CheckLocation> locerr;

	public Integer getIddoc() {
		return iddoc;
	}

	public void setIddoc(Integer iddoc) {
		this.iddoc = iddoc;
	}

	public Integer getExpected() {
		return expected;
	}

	public void setExpected(Integer expected) {
		this.expected = expected;
	}

	public Integer getReaded() {
		return readed;
	}

	public void setReaded(Integer readed) {
		this.readed = readed;
	}

	public boolean isCompliance() {
		return compliance;
	}

	public void setCompliance(boolean compliance) {
		this.compliance = compliance;
	}

	public boolean isOverload() {
		return overload;
	}

	public void setOverload(boolean overload) {
		this.overload = overload;
	}

	public List<CheckLocation> getLocerr() {
		return locerr;
	}

	public void setLocerr(List<CheckLocation> locerr) {
		this.locerr = locerr;
	}

	

}
