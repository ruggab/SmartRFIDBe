package net.smart.rfid.response;

import java.util.List;

import net.smart.rfid.db.repository.ProductsRepository.ProductSellStock2;

public class ProductSellStock2Resp extends Response {
	private List<ProductSellStock2> listings;

	public List<ProductSellStock2> getListings() {
		return listings;
	}

	public void setListings(List<ProductSellStock2> listings) {
		this.listings = listings;
	}
}
