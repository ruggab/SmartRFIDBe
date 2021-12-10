package net.smart.rfid.response;

import java.util.List;

import net.smart.rfid.db.repository.ProductsRepository.ProductSellStock;

public class ProductSellStockResp extends Response {
	private List<ProductSellStock> listings;

	public List<ProductSellStock> getListings() {
		return listings;
	}

	public void setListings(List<ProductSellStock> listings) {
		this.listings = listings;
	}
}
