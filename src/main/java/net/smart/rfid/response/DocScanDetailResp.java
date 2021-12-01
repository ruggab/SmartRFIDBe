package net.smart.rfid.response;

import java.util.List;

import net.smart.rfid.db.repository.DocumentRepository.ScanDetail;

public class DocScanDetailResp extends Response {

	private List<ScanDetail> listings;

	public List<ScanDetail> getListings() {
		return listings;
	}

	public void setListings(List<ScanDetail> listings) {
		this.listings = listings;
	}

}
