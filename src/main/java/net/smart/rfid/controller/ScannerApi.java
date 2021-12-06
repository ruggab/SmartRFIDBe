package net.smart.rfid.controller;

import java.sql.Timestamp;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.smart.rfid.db.entity.Documents;
import net.smart.rfid.db.entity.Scanner;
import net.smart.rfid.db.entity.ScannerDetail;
import net.smart.rfid.db.repository.DocumentRepository;
import net.smart.rfid.db.repository.ScannerDetailRepository;
import net.smart.rfid.db.repository.ScannerRepository;
import net.smart.rfid.response.Response;

@RestController
@RequestMapping("")
@CrossOrigin(origins = "http://localhost:4200")
public class ScannerApi {
	Logger logger = Logger.getLogger(ScannerApi.class);

	@Autowired
	private ScannerRepository scannerRepository;

	@Autowired
	private ScannerDetailRepository scannerDetailRepository;

	@Autowired
	private DocumentRepository documentRepository;

	@GetMapping("/writeScanner")
	public Response writeScanner(@RequestParam(value = "iddoc", required = true) String iddoc, @RequestParam(value = "id_client", required = true) String id_client, @RequestParam(value = "doc_destination", required = true) String doc_destination, @RequestParam(value = "val", required = true) String val) throws Exception {
		try {

			String id_client2 = id_client.split(",")[0];
			Documents dc = documentRepository.getOne(new Long(iddoc));
			dc.setDocDestination(doc_destination);
			documentRepository.save(dc);
			//
			scannerRepository.clearScan(new Long(iddoc), new Long(id_client2));
			Scanner scanner = new Scanner();
			scanner.setScanDate(new Timestamp(System.currentTimeMillis()));
			scanner.setIddoc(new Long(iddoc));
			scanner = scannerRepository.save(scanner);
			//
			String[] vals = val.split(",");
			for (String stream : vals) {
				String[] row = stream.split(";");
				String sku = row[0];
				int cont = 0;
				if (sku.trim().length() > 0) {
					ScannerDetail scannerDetail = new ScannerDetail();
					scannerDetail.setSku(row[0]);
					scannerDetail.setEpc(row[1]);
					scannerDetail.setIddoc(new Long(iddoc));
					scannerDetail.setIdlocation(new Long(row[2]));
					scannerDetail.setIdscan(scanner.getIdscan());
					scannerDetailRepository.save(scannerDetail);
					if (cont == vals.length) {
						scannerRepository.closeStep2(iddoc);
					}
				}
			}
			Response resp = new Response();
			resp.setMessage("OK");
			return resp;
		} catch (Exception e) {
			throw e;
		}
	}

}
