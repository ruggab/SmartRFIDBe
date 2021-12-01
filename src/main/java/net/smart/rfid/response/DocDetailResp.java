package net.smart.rfid.response;

import java.util.List;

import net.smart.rfid.db.repository.DocumentRepository.DocDetail;

public class DocDetailResp extends Response {

	private List<DocDetail> listings;

	public List<DocDetail> getListings() {
		return listings;
	}

	public void setListings(List<DocDetail> listings) {
		this.listings = listings;
	}

}
