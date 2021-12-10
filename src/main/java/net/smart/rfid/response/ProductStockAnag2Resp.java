package net.smart.rfid.response;

import java.util.List;

import net.smart.rfid.db.repository.ProductsRepository.ProductStockAnag2;

public class ProductStockAnag2Resp extends Response {
	private List<ProductStockAnag2> listings;

	public List<ProductStockAnag2> getListings() {
		return listings;
	}

	public void setListings(List<ProductStockAnag2> listings) {
		this.listings = listings;
	}
}
