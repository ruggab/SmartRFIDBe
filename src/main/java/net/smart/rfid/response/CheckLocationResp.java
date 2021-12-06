package net.smart.rfid.response;

import java.util.List;

import net.smart.rfid.db.repository.ScannerDetailRepository.CheckLocation;

public class CheckLocationResp {

	private List<CheckLocation> locerr;

	public List<CheckLocation> getLocerr() {
		return locerr;
	}

	public void setLocerr(List<CheckLocation> locerr) {
		this.locerr = locerr;
	}

}
