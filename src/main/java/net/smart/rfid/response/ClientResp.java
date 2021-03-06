package net.smart.rfid.response;

import java.util.List;

import net.smart.rfid.db.repository.ClientRepository.ClientConfig;

public class ClientResp extends Response{

	
	private Long id_client;

	private Long id_customer;

	private List<ClientConfig> listings;

	public ClientResp() {
	}

	public Long getId_client() {
		return id_client;
	}

	public void setId_client(Long id_client) {
		this.id_client = id_client;
	}

	public Long getId_customer() {
		return id_customer;
	}

	public void setId_customer(Long id_customer) {
		this.id_customer = id_customer;
	}
	

	public List<ClientConfig> getListings() {
		return listings;
	}

	public void setListings(List<ClientConfig> listings) {
		this.listings = listings;
	}

	

}