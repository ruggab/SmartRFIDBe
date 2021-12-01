package net.smart.rfid.response;

import java.util.List;

import net.smart.rfid.db.repository.DocumentRepository.LocEpc;

public class DocLocEpcResp extends Response {

	private List<LocEpc> listings;

	public List<LocEpc> getListings() {
		return listings;
	}

	public void setListings(List<LocEpc> listings) {
		this.listings = listings;
	}

}
