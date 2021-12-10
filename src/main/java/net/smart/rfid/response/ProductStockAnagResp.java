package net.smart.rfid.response;

import java.util.List;

import net.smart.rfid.db.repository.ProductsRepository.ProductStockAnag;

public class ProductStockAnagResp extends Response {
	private List<ProductStockAnag> listings;

	public List<ProductStockAnag> getListings() {
		return listings;
	}

	public void setListings(List<ProductStockAnag> listings) {
		this.listings = listings;
	}

}
