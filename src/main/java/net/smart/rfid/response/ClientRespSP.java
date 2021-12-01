package net.smart.rfid.response;

import java.util.List;

import net.smart.rfid.db.repository.ClientRepository.ClientConfigScanPrint;

public class ClientRespSP extends Response {

	private Long id_client;

	private List<ClientConfigScanPrint> listings;

	public ClientRespSP() {
	}

	public Long getId_client() {
		return id_client;
	}

	public void setId_client(Long id_client) {
		this.id_client = id_client;
	}

	public List<ClientConfigScanPrint> getListings() {
		return listings;
	}

	public void setListings(List<ClientConfigScanPrint> listings) {
		this.listings = listings;
	}

	
	
}