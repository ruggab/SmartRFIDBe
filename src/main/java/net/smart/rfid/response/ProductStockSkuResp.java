package net.smart.rfid.response;

import java.util.List;

import net.smart.rfid.db.repository.ProductsRepository.ProductStockSku;

public class ProductStockSkuResp extends Response {
	private List<ProductStockSku> listings;

	public List<ProductStockSku> getListings() {
		return listings;
	}

	public void setListings(List<ProductStockSku> listings) {
		this.listings = listings;
	}
}
