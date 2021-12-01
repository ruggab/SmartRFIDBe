package net.smart.rfid.response;

import java.util.List;

import net.smart.rfid.db.repository.DocumentRepository.Ticket;

public class DocTicketResp extends Response {

	private List<Ticket> listings;

	public List<Ticket> getListings() {
		return listings;
	}

	public void setListings(List<Ticket> listings) {
		this.listings = listings;
	}

}
