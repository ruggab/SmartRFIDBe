package net.smart.rfid.response;

import java.util.List;

import net.smart.rfid.db.repository.ClientRepository.ClientConfig;

public class ClientRespQC extends Response {

	private Long id_client;

	private List<ClientConfig> listings;

	public ClientRespQC() {
	}

	public Long getId_client() {
		return id_client;
	}

	public void setId_client(Long id_client) {
		this.id_client = id_client;
	}

	public List<ClientConfig> getListings() {
		return listings;
	}

	public void setListings(List<ClientConfig> listings) {
		this.listings = listings;
	}

}