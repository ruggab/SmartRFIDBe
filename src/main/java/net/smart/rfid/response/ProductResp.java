package net.smart.rfid.response;

import java.util.List;

import net.smart.rfid.db.repository.ProductsRepository.Product;

public class ProductResp extends Response {
	private List<Product> listings;

	public List<Product> getListings() {
		return listings;
	}

	public void setListings(List<Product> listings) {
		this.listings = listings;
	}

}
