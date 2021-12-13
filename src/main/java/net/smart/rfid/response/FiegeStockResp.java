package net.smart.rfid.response;

import java.util.List;

import net.smart.rfid.db.entity.FiegeStock;

public class FiegeStockResp extends Response {
	private List<FiegeStock> listings;

	public List<FiegeStock> getListings() {
		return listings;
	}

	public void setListings(List<FiegeStock> listings) {
		this.listings = listings;
	}

	
}
