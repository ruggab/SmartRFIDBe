package net.smart.rfid.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.smart.rfid.db.entity.Clients;
import net.smart.rfid.db.repository.ClientRepository;
import net.smart.rfid.db.repository.ClientRepository.ClientConfig;
import net.smart.rfid.response.ClientResp;

@RestController
@RequestMapping("")
@CrossOrigin(origins = "http://localhost:4200")
public class ClientApi {
	Logger logger = Logger.getLogger(ClientApi.class);

	@Autowired
	private ClientRepository clientRepository;

	@GetMapping("/getCompanyPrefix")
	public List<Clients> getCompanyPrefix() throws Exception {
		try {
			List<Clients> client = clientRepository.findAll();
			return client;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@GetMapping("/clientRequest")
	public ClientResp getClientRequest(@RequestParam(value = "mac", required = false) String mac, @RequestParam(value = "description", required = false) String description) throws Exception {
		 
		try {
			ClientResp clientResp = new ClientResp();
			if (mac.equals("undefined") || mac == null || mac.trim().equals("")) {
				clientResp.setId_server("Server");
				clientResp.setMessage("Missing MAC");
				clientResp.setId_client(-1l);
				clientResp.setListings(new ArrayList<ClientConfig>());
			} else {
				List<Clients> listClient = clientRepository.findByMac(mac);
				if (listClient!= null && listClient.size() > 0) {
					logger.info("il client lo conosco....");
					Clients client = listClient.get(0);
					clientResp.setId_client(client.getId());
					clientResp.setId_customer(client.getIdCustomer());
					clientResp.setId_server("Server");
					if (client.isEnabled()) {
						List<ClientConfig> listCliConf = clientRepository.getClientConfig(client.getId());
						clientResp.setMessage("Client Abilitato");
						clientResp.setListings(listCliConf);
					} else {
						clientResp.setMessage("Client non Abilitato");
						clientResp.setListings(new ArrayList<ClientConfig>());
					}
				} else {
					clientResp.setId_client(-1l);
					clientResp.setMessage("Client non Abilitato");
					clientResp.setId_server("Server");
					clientResp.setListings(new ArrayList<ClientConfig>());
					
					//Insert client enable false
				}
			}
			
			
			return clientResp;
		} catch (Exception e) {
			throw e;
		}
	}
	
	

}
