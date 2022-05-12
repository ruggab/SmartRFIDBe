package net.smart.rfid.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.smart.rfid.db.entity.Documents;
import net.smart.rfid.db.entity.Scanner;
import net.smart.rfid.db.entity.ScannerDetail;
import net.smart.rfid.db.repository.DocumentRepository;
import net.smart.rfid.db.repository.ProductsRepository;
import net.smart.rfid.db.repository.ProductsRepository.Product;
import net.smart.rfid.db.repository.ScannerDetailRepository;
import net.smart.rfid.db.repository.ScannerDetailRepository.CheckLocation;
import net.smart.rfid.db.repository.ScannerDetailRepository.CheckScan;
import net.smart.rfid.db.repository.ScannerRepository;
import net.smart.rfid.response.CheckScanResp;
import net.smart.rfid.response.ProductResp;
import net.smart.rfid.response.Response;

@RestController
@RequestMapping("")
@CrossOrigin(origins = "http://localhost:4200")
public class ScannerApi {
	Logger logger = Logger.getLogger("ScannerApi");

	@Autowired
	private ScannerRepository scannerRepository;

	@Autowired
	private ScannerDetailRepository scannerDetailRepository;

	@Autowired
	private DocumentRepository documentRepository;

	@Autowired
	private ProductsRepository productRepository;

	@PostMapping("/writeScanner")
	public Response writeScanner(@RequestParam(value = "iddoc", required = true) String iddoc, @RequestParam(value = "id_client", required = true) String id_client, @RequestParam(value = "doc_destination", required = true) String doc_destination, @RequestParam(value = "val", required = true) String val) throws Exception {
		try {

			String id_client2 = id_client.split(",")[0];
			Documents dc = documentRepository.getOne(new Long(iddoc));
			dc.setDocDestination(doc_destination);
			documentRepository.save(dc);
			//
			scannerRepository.clearScan2(new Long(iddoc), new Long(id_client2));
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
					scannerDetail.setIdlocation(new Long(-1));
					try {
						scannerDetail.setIdlocation(new Long(row[2]));
					} catch (Exception e) {
						logger.info(e.getMessage());
					}
					scannerDetail.setIddoc(new Long(iddoc));
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

	@PostMapping("/writeScannerPartial")
	public Response writeScannerPartial(@RequestParam(value = "iddoc", required = true) String iddoc, @RequestParam(value = "id_client", required = true) String id_client, @RequestParam(value = "val", required = true) String val) throws Exception {
		try {
			Response resp = new Response();
			if (val.equals("")) {
				resp.setMessage("OK");
			} else {
				//
				scannerRepository.clearScan2(new Long(iddoc), new Long(id_client));
				Scanner scanner = new Scanner();
				scanner.setScanDate(new Timestamp(System.currentTimeMillis()));
				scanner.setIddoc(new Long(iddoc));
				scanner.setIdclient(new Long(id_client));
				scanner = scannerRepository.save(scanner);
				//
				String[] vals = val.split(",");
				if (vals.length > 0) {
					for (String stream : vals) {
						String[] row = stream.split(";");
						String sku = row[0];
						int cont = 0;
						if (sku.trim().length() > 0) {
							ScannerDetail scannerDetail = new ScannerDetail();
							scannerDetail.setSku(row[0]);
							scannerDetail.setEpc(row[1]);
							scannerDetail.setIdscan(scanner.getIdscan());
							scannerDetail.setIddoc(new Long(iddoc));
							scannerDetail.setIdlocation(new Long(-1));
							try {
								scannerDetail.setIdlocation(new Long(row[2]));
							} catch (Exception e) {
								logger.info(e.getMessage());
							}

							scannerDetailRepository.save(scannerDetail);
							if (cont == vals.length) {
								resp.setMessage("OK");
							}
						}
					}
				} else {
					resp.setMessage("OK");
				}
			}
			return resp;
		} catch (Exception e) {
			throw e;
		}
	}

	@PostMapping("/getAnagBySku")
	public ProductResp getAnagBySku(@RequestParam(value = "val", required = true) String val) throws Exception {
		ProductResp resp = new ProductResp();
		try {
			List<Product> listProduct = new ArrayList<Product>();
			if (val.length() > 0) {
				listProduct = productRepository.getProd(val);
				resp.setId_server("Server");
				resp.setMessage("SKU Anag");
				resp.setListings(listProduct);
			} else {
				resp.setId_server("Server");
				resp.setMessage("SKU Anag");
				resp.setListings(listProduct);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return resp;
	}

	@PostMapping("/writeScannerQT")
	public Response writeScannerQT(@RequestParam(value = "iddoc", required = true) String iddoc, @RequestParam(value = "id_client", required = true) String id_client, @RequestParam(value = "doc_destination", required = true) String doc_destination, @RequestParam(value = "val", required = true) String val) throws Exception {
		try {
			//
			Documents dc = documentRepository.getOne(new Long(iddoc));
			dc.setDocDestination(doc_destination);
			documentRepository.save(dc);
			//
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
					scannerDetail.setIdscan(scanner.getIdscan());
					scannerDetail.setIddoc(new Long(iddoc));
					scannerDetail.setIdlocation(new Long(row[2]));
					scannerDetailRepository.save(scannerDetail);
					if (cont == vals.length) {
						scannerRepository.closeStepQT(iddoc);
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

	@GetMapping("/deleteScannerSku")
	public Response deleteScannerSku(@RequestParam(value = "iddoc", required = true) String iddoc, @RequestParam(value = "sku", required = true) String sku) throws Exception {
		try {

			scannerDetailRepository.deleteByIddocAndSku(new Long(iddoc), sku);

			Response resp = new Response();
			resp.setMessage("OK");
			return resp;
		} catch (Exception e) {
			throw e;
		}
	}

	@GetMapping("/deleteScannerEpc")
	public Response deleteScannerEpc(@RequestParam(value = "iddoc", required = true) String iddoc, @RequestParam(value = "epc", required = true) String epc) throws Exception {
		try {

			scannerDetailRepository.deleteByIddocAndEpc(new Long(iddoc), epc);

			Response resp = new Response();
			resp.setMessage("OK");
			return resp;
		} catch (Exception e) {
			throw e;
		}
	}

	@GetMapping("/checkScanner")
	public CheckScanResp checkScanner(@RequestParam(value = "iddoc", required = true) String iddoc) throws Exception {
		try {

			List<CheckScan> listChekScan = scannerDetailRepository.checkScan(new Long(iddoc));
			Integer exp = 0;
			Integer rea = 0;
			boolean compliance = false;
			boolean overload = false;
			for (CheckScan checkScan : listChekScan) {
				//
				exp = checkScan.getExpected();
				rea = checkScan.getReaded();
				//
				if (rea.intValue() > exp.intValue()) {
					overload = true;
				}
			}
			if (listChekScan.size() == 0) {
				compliance = true;
			}
			//
			List<CheckLocation> listCheckLoc = scannerDetailRepository.checkLocation(new Long(iddoc));
			//
			CheckScanResp resp = new CheckScanResp();
			resp.setCompliance(compliance);
			resp.setExpected(exp);
			resp.setIddoc(new Integer(iddoc));
			resp.setLocerr(listCheckLoc);
			resp.setOverload(overload);
			resp.setReaded(rea);
			return resp;
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	@GetMapping("/checkLocation")
	public CheckScanResp checkLocation(@RequestParam(value = "iddoc", required = true) String iddoc) throws Exception {
		try {
			//
			List<CheckLocation> listCheckLoc = scannerDetailRepository.checkLocation(new Long(iddoc));
			//
			CheckScanResp resp = new CheckScanResp();
			//
			resp.setLocerr(listCheckLoc);
			//
			return resp;
		} catch (Exception e) {
			throw e;
		}
	}
}
