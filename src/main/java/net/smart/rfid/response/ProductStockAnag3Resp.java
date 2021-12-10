package net.smart.rfid.response;

import java.util.List;

import net.smart.rfid.db.repository.ProductsRepository.ProductStockAnag3;

public class ProductStockAnag3Resp extends Response {
	private List<ProductStockAnag3> listings;

	public List<ProductStockAnag3> getListings() {
		return listings;
	}

	public void setListings(List<ProductStockAnag3> listings) {
		this.listings = listings;
	}
}
