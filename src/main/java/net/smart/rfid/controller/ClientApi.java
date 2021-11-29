package net.smart.rfid.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.smart.rfid.db.entity.Clients;
import net.smart.rfid.db.repository.ClientRepository;
import net.smart.rfid.db.repository.ClientRepository.ClientConfig;
import net.smart.rfid.db.repository.ClientRepository.ClientConfigScanPrint;
import net.smart.rfid.db.repository.ClientRepository.CompanyPrefix;
import net.smart.rfid.db.repository.ClientRepository.CompanyStock;
import net.smart.rfid.response.ClientResp;
import net.smart.rfid.response.ClientRespQC;
import net.smart.rfid.response.ClientRespSP;

@RestController
@RequestMapping("")
@CrossOrigin(origins = "http://localhost:4200")
public class ClientApi {
	Logger logger = Logger.getLogger(ClientApi.class);

	@Autowired
	private ClientRepository clientRepository;
	
	@GetMapping("/getStock")
	public CompanyStock getStock(@RequestParam(value = "idsite", required = true)String idsite) throws Exception {
		try {
			
			List<CompanyStock> stockList = clientRepository.getCompanyStock(idsite);
			if (stockList.size() > 0) {
				return  stockList.get(0);
			}
			return  null;
		} catch (Exception e) {
			throw e;
		}
	}
	

	@GetMapping("/getCompanyPrefix")
	public CompanyPrefix getCompanyPrefix(@RequestParam(value = "mac", required = true)String mac) throws Exception {
		try {
			
			List<CompanyPrefix> prefixList = clientRepository.getCompanyPrefix(mac);
			if (prefixList.size() > 0) {
				return  prefixList.get(0);
			}
			return  null;
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
					Clients clients = new Clients();
					clients.setMac(mac);
					clients.setDescription(description);
					clients.setEnabled(false);
					clientRepository.save(clients);
					//clients.insertClient();
				}
			}
			return clientResp;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@GetMapping("/clientRequestScanPrint")
	public ClientRespSP clientRequestScanPrint(@RequestParam(value = "mac", required = false) String mac, @RequestParam(value = "description", required = false) String description) throws Exception {	 
		try {
			ClientRespSP clientRespSp = new ClientRespSP();
			if (mac.equals("undefined") || mac == null || mac.trim().equals("")) {
				clientRespSp.setId_server("Server");
				clientRespSp.setMessage("Missing MAC");
				clientRespSp.setId_client(-1l);
				clientRespSp.setListings(new ArrayList<ClientConfigScanPrint>());
			} else {
				List<Clients> listClient = clientRepository.findByMac(mac);
				if (listClient!= null && listClient.size() > 0) {
					logger.info("il client lo conosco....");
					Clients client = listClient.get(0);
					clientRespSp.setId_client(client.getId());
					clientRespSp.setId_server("Server");
					if (client.isEnabled()) {
						List<ClientConfigScanPrint> listCliConfSP = clientRepository.getClientConfigScanPrint(client.getId());
						clientRespSp.setMessage("Client Abilitato");
						clientRespSp.setListings(listCliConfSP);
					} else {
						clientRespSp.setMessage("Client non Abilitato");
						clientRespSp.setListings(new ArrayList<ClientConfigScanPrint>());
					}
				} else {
					clientRespSp.setId_client(-1l);
					clientRespSp.setMessage("Client non Abilitato");
					clientRespSp.setId_server("Server");
					clientRespSp.setListings(new ArrayList<ClientConfigScanPrint>());
					
					//Insert client enable false
					Clients clients = new Clients();
					clients.setMac(mac);
					clients.setDescription(description);
					clients.setEnabled(false);
					clientRepository.save(clients);
					//clients.insertClient();
				}
			}
			return clientRespSp;
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	@GetMapping("/clientRequestQT")
	public ClientRespQC clientRequestQT(@RequestParam(value = "mac", required = false) String mac, @RequestParam(value = "description", required = false) String description) throws Exception {	 
		try {
			ClientRespQC clientRespQC = new ClientRespQC();
			if (mac.equals("undefined") || mac == null || mac.trim().equals("")) {
				clientRespQC.setId_server("Server");
				clientRespQC.setMessage("Missing MAC");
				clientRespQC.setId_client(-1l);
				clientRespQC.setListings(new ArrayList<ClientConfig>());
			} else {
				List<Clients> listClient = clientRepository.findByMac(mac);
				if (listClient!= null && listClient.size() > 0) {
					logger.info("il client lo conosco....");
					Clients client = listClient.get(0);
					clientRespQC.setId_client(client.getId());
					clientRespQC.setId_server("Server");
					if (client.isEnabled()) {
						List<ClientConfig> listCliConf = clientRepository.getClientConfigQC(client.getId());
						clientRespQC.setMessage("Client Abilitato");
						clientRespQC.setListings(listCliConf);
					} else {
						clientRespQC.setMessage("Client non Abilitato");
						clientRespQC.setListings(new ArrayList<ClientConfig>());
					}
				} else {
					clientRespQC.setId_client(-1l);
					clientRespQC.setMessage("Client non Abilitato");
					clientRespQC.setId_server("Server");
					clientRespQC.setListings(new ArrayList<ClientConfig>());
					
					//Insert client enable false
					Clients clients = new Clients();
					clients.setMac(mac);
					clients.setDescription(description);
					clients.setEnabled(false);
					clientRepository.save(clients);
					//clients.insertClient();
				}
			}
			return clientRespQC;
		} catch (Exception e) {
			throw e;
		}
	}
	

}
