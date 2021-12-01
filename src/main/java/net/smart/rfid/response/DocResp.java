package net.smart.rfid.response;

import java.util.List;

import net.smart.rfid.db.repository.DocumentRepository.DocumentsFilter;

public class DocResp extends Response {

	private List<DocumentsFilter> listings;

	public List<DocumentsFilter> getListings() {
		return listings;
	}

	public void setListings(List<DocumentsFilter> listings) {
		this.listings = listings;
	}

}
