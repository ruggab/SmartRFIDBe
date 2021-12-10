package net.smart.rfid.response;

import java.util.List;

import net.smart.rfid.db.repository.ProductsRepository.ProductStockAnag3;
import net.smart.rfid.db.repository.ProductsRepository.ProductStockAnag4;

public class ProductStockAnag4Resp extends Response {
	private List<ProductStockAnag4> listings;

	public List<ProductStockAnag4> getListings() {
		return listings;
	}

	public void setListings(List<ProductStockAnag4> listings) {
		this.listings = listings;
	}
}
