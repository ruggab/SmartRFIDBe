package net.smart.rfid.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.jdom.DocType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.smart.rfid.db.entity.Documents;
import net.smart.rfid.db.entity.DocumentsDetail;
import net.smart.rfid.db.entity.StepType;
import net.smart.rfid.db.repository.DocumentDetailRepository;
import net.smart.rfid.db.repository.DocumentRepository;
import net.smart.rfid.db.repository.DocumentRepository.DocDetail;
import net.smart.rfid.db.repository.DocumentRepository.DocumentsFilter;
import net.smart.rfid.db.repository.DocumentRepository.LocEpc;
import net.smart.rfid.db.repository.DocumentRepository.ScanDetail;
import net.smart.rfid.db.repository.DocumentRepository.Ticket;
import net.smart.rfid.db.repository.StepTypeRepository;
import net.smart.rfid.response.DocDetailResp;
import net.smart.rfid.response.DocLocEpcResp;
import net.smart.rfid.response.DocNewResp;
import net.smart.rfid.response.DocResp;
import net.smart.rfid.response.DocScanDetailResp;
import net.smart.rfid.response.DocTicketResp;
import net.smart.rfid.response.Response;

@RestController
@RequestMapping("")
@CrossOrigin(origins = "http://localhost:4200")
public class DocApi {
	Logger logger = Logger.getLogger(DocApi.class);

	@Autowired
	private DocumentRepository documentRepository;
	
	@Autowired
	private DocumentDetailRepository documentDetailRepository;

	@Autowired
	private StepTypeRepository stepTypeRepository;

	@GetMapping("/getDoc")
	public DocResp getDoc(@RequestParam(value = "idflow", required = false) Integer idflow, @RequestParam(value = "idstep", required = false) Integer idstep, @RequestParam(value = "idlocation", required = false) Integer idlocation) throws Exception {

		try {
			DocResp documentResp = new DocResp();
			List<DocumentsFilter> docFilterList = documentRepository.getDocuments(idflow, idstep, idlocation);
			documentResp.setId_server("Server");
			documentResp.setMessage("Doc List");
			documentResp.setListings(docFilterList);
			return documentResp;
		} catch (Exception e) {
			throw e;
		}
	}

	@GetMapping("/getTicket")
	public DocTicketResp getTicket(@RequestParam(value = "idflow", required = false) Integer idflow, @RequestParam(value = "idstep", required = false) Integer idstep, @RequestParam(value = "idlocation", required = false) Integer idlocation) throws Exception {

		try {
			DocTicketResp docTicketResp = new DocTicketResp();
			List<Ticket> docFilterList = documentRepository.getTickets(idflow, idstep, idlocation);
			docTicketResp.setId_server("Server");
			docTicketResp.setMessage("Doc List");
			docTicketResp.setListings(docFilterList);
			return docTicketResp;
		} catch (Exception e) {
			throw e;
		}
	}

	@GetMapping("/getDocDet")
	public DocDetailResp getDocDet(@RequestParam(value = "id", required = false) Integer id) throws Exception {

		try {
			DocDetailResp docDetailResp = new DocDetailResp();
			List<DocDetail> docFilterList = documentRepository.getDocDetail(id);
			docDetailResp.setId_server("Server");
			docDetailResp.setMessage("Doc List");
			docDetailResp.setListings(docFilterList);
			return docDetailResp;
		} catch (Exception e) {
			throw e;
		}
	}

	@GetMapping("/getScanDet")
	public DocScanDetailResp getScanDet(@RequestParam(value = "iddoc", required = false) Integer iddoc) throws Exception {

		try {
			DocScanDetailResp docScanDetailResp = new DocScanDetailResp();
			List<ScanDetail> docFilterList = documentRepository.getScanDetail(iddoc);
			docScanDetailResp.setId_server("Server");
			docScanDetailResp.setMessage("Doc List");
			docScanDetailResp.setListings(docFilterList);
			return docScanDetailResp;
		} catch (Exception e) {
			throw e;
		}
	}

	@GetMapping("/setScanWrite")
	public Response setScanWrite(@RequestParam(value = "epcin", required = false) String epcin, @RequestParam(value = "epcout", required = false) String epcout, @RequestParam(value = "skuin", required = false) String skuin, @RequestParam(value = "skuin", required = false) String skuout) throws Exception {

		try {
			Response response = new Response();
			documentRepository.setScanWrite(epcin, epcout, skuin, skuout);
			response.setId_server("Server");
			response.setMessage("OK");

			return response;
		} catch (Exception e) {
			throw e;
		}
	}

	@GetMapping("/clearDoc")
	public Response clearDoc(@RequestParam(value = "iddoc", required = false) Integer iddoc, @RequestParam(value = "docType", required = false) String docType) throws Exception {

		try {
			Response response = new Response();
			if (docType.equals("R")) {
				documentRepository.clearDoc(iddoc);
			} else {
				documentRepository.clearDocReturn(iddoc);
			}

			response.setId_server("Server");
			response.setMessage("OK");

			return response;
		} catch (Exception e) {
			throw e;
		}
	}

	@GetMapping("/setReadDate")
	public Response setReadDate(@RequestParam(value = "iddoc", required = false) Integer iddoc) throws Exception {
		try {
			Response response = new Response();
			documentRepository.setReadDate(iddoc);
			response.setId_server("Server");
			response.setMessage("OK");
			return response;
		} catch (Exception e) {
			throw e;
		}
	}

	@GetMapping("/mergeDocs")
	public Response mergeDocs(@RequestParam(value = "ids", required = false) String ids) throws Exception {
		try {
			Response response = new Response();
			documentRepository.mergeDocs(ids);
			response.setId_server("Server");
			response.setMessage("OK");
			return response;
		} catch (Exception e) {
			throw e;
		}
	}

	@GetMapping("/getDocTemplate")
	public DocTicketResp getDocTemplate(@RequestParam(value = "idflow", required = false) Integer idflow, @RequestParam(value = "idstep", required = false) Integer idstep, @RequestParam(value = "idlocation", required = false) Integer idlocation) throws Exception {

		try {
			DocTicketResp docTicketResp = new DocTicketResp();
			List<Ticket> docFilterList = documentRepository.getDocumentsTemplates(idflow, idstep, idlocation);
			docTicketResp.setId_server("Server");
			docTicketResp.setMessage("Doc List");
			docTicketResp.setListings(docFilterList);
			return docTicketResp;
		} catch (Exception e) {
			throw e;
		}
	}

	@GetMapping("/setDocTemplate")
	public Response setDocTemplate(@RequestParam(value = "iddoc", required = false) Integer iddoc) throws Exception {
		try {
			Response response = new Response();
			documentRepository.setDocumentsTemplate(iddoc);
			response.setId_server("Server");
			response.setMessage("OK");
			return response;
		} catch (Exception e) {
			throw e;
		}
	}

	@GetMapping("/updateDiary")
	public Response updateDiary(@RequestParam(value = "epc", required = false) String epc, @RequestParam(value = "sku", required = false) String sku, @RequestParam(value = "idsite", required = false) Integer idsite, @RequestParam(value = "idlocation", required = false) Integer idlocation, @RequestParam(value = "idstep", required = false) Integer idstep,
			@RequestParam(value = "units", required = false) Integer units) throws Exception {
		try {
			Response response = new Response();
			documentRepository.updateDiary(epc, sku, idsite, idlocation, idstep, units);
			response.setId_server("Server");
			response.setMessage("OK");
			return response;
		} catch (Exception e) {
			throw e;
		}
	}

	@GetMapping("/getLocEpc")
	public DocLocEpcResp getLocEpc(@RequestParam(value = "iddoc", required = false) Integer iddoc) throws Exception {
		try {
			DocLocEpcResp response = new DocLocEpcResp();
			List<LocEpc> docFilterList = documentRepository.getLocEpc(iddoc);
			response.setId_server("Server");
			response.setMessage("Loc Epc L,ist");
			response.setListings(docFilterList);
			return response;
		} catch (Exception e) {
			throw e;
		}
	}

	@GetMapping("/newDoc")
	public DocNewResp newDoc(@RequestParam(value = "doc_ref", required = false) String doc_ref, @RequestParam(value = "idflow", required = false) Integer idflow, @RequestParam(value = "idstep", required = false) Integer idstep, @RequestParam(value = "idlocation", required = false) Integer idlocation, @RequestParam(value = "doctype", required = false) String doctype,
			@RequestParam(value = "idsite_dest", required = false) Integer idsite_dest, @RequestParam(value = "origin_location", required = false) Integer origin_location) throws Exception {

		try {
			if (idsite_dest.equals("undefined") || idsite_dest == null) {
				idsite_dest = -1;
			}
			if (origin_location.equals("undefined") || origin_location == null) {
				origin_location = -1;
			}
			Documents doc = new Documents();
			doc.setDocNumber(0);
			doc.setDocRef(doc_ref);
			doc.setDocOrigin("Server");
			doc.setIdflow(idflow);
			doc.setIdstep(idstep);
			doc.setIdsite(idlocation);
			doc.setIdsiteDest(idsite_dest);
			doc.setOriginLocation(origin_location);
			StepType stepType = stepTypeRepository.getDocTypeByStep(idstep);
			if (doctype != null  && !doctype.equals("undefined") && !doctype.trim().equals("")) {
				doc.setIdDocumentType(stepType.getIdDoctypeDefault2());
			} else {
				doc.setIdDocumentType(stepType.getIdDoctypeDefault());
			}
			doc = documentRepository.save(doc);
			doc.setDocNumber(doc.getId());
			doc = documentRepository.save(doc);
			DocNewResp docNewResp = new DocNewResp();
			docNewResp.setId_server("Server");
			docNewResp.setMessage("Doc Creato");
			docNewResp.setDocument_id(doc.getId());
			return docNewResp;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@GetMapping("/newDocFromTemplate")
	public DocNewResp newDocFromTemplate(@RequestParam(value = "doc_ref", required = false) String doc_ref, 
			@RequestParam(value = "idflow", required = false) Integer idflow, 
			@RequestParam(value = "idstep", required = false) Integer idstep, 
			@RequestParam(value = "idlocation", required = false) Integer idlocation, 
			@RequestParam(value = "doctype", required = false) String doctype,
			@RequestParam(value = "iddoc_template", required = false) Integer iddoc_template) throws Exception {

		try {
			if (iddoc_template.equals("undefined") || iddoc_template == null) {
				iddoc_template = -1;
			}
			//
			Documents doc = new Documents();
			doc.setDocNumber(0);
			doc.setDocRef(doc_ref);
			doc.setDocOrigin("Server");
			doc.setIdflow(idflow);
			doc.setIdstep(idstep);
			doc.setIdsite(idlocation);
			doc.setIdsiteDest(-1);
			//
			StepType stepType = stepTypeRepository.getDocTypeByStep(idstep);
			if (doctype != null  && !doctype.equals("undefined") && !doctype.trim().equals("")) {
				doc.setIdDocumentType(stepType.getIdDoctypeDefault2());
			} else {
				doc.setIdDocumentType(stepType.getIdDoctypeDefault());
			}
			doc = documentRepository.save(doc);
			doc.setDocNumber(doc.getId());
			doc = documentRepository.save(doc);
			//insert 
			List<DocumentsDetail> listDocDet = documentDetailRepository.findByIddoc(iddoc_template);
			for (DocumentsDetail dt : listDocDet) {
				DocumentsDetail dtNew = new DocumentsDetail();
				dtNew.setSku(dt.getSku());
				dtNew.setIddoc(dt.getIddoc());
				documentDetailRepository.save(dtNew);
			}
			//
			DocNewResp docNewResp = new DocNewResp();
			docNewResp.setId_server("Server");
			docNewResp.setMessage("Doc Creato");
			docNewResp.setDocument_id(doc.getId());
			return docNewResp;
		} catch (Exception e) {
			throw e;
		}
	}
}
