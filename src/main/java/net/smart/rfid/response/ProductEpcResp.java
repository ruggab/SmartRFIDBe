package net.smart.rfid.response;

import java.util.List;

public class ProductEpcResp extends Response {
	private List<String> listings;

	public List<String> getListings() {
		return listings;
	}

	public void setListings(List<String> listings) {
		this.listings = listings;
	}

}
