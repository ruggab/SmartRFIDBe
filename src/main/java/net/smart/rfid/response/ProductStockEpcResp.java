package net.smart.rfid.response;

import java.util.List;

import net.smart.rfid.db.repository.ProductsRepository.Product;
import net.smart.rfid.db.repository.ProductsRepository.ProductStockEpc;

public class ProductStockEpcResp extends Response {
	private List<ProductStockEpc> listings;

	public List<ProductStockEpc> getListings() {
		return listings;
	}

	public void setListings(List<ProductStockEpc> listings) {
		this.listings = listings;
	}

}
