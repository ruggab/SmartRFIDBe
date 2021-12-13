package net.smart.rfid.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.smart.rfid.db.entity.FiegeStock;
import net.smart.rfid.db.repository.ProductsRepository;
import net.smart.rfid.db.repository.ProductsRepository.ProductSellStock;
import net.smart.rfid.db.repository.ProductsRepository.ProductSellStock2;
import net.smart.rfid.db.repository.ProductsRepository.ProductStockAnag;
import net.smart.rfid.db.repository.ProductsRepository.ProductStockAnag2;
import net.smart.rfid.db.repository.ProductsRepository.ProductStockAnag3;
import net.smart.rfid.db.repository.ProductsRepository.ProductStockAnag4;
import net.smart.rfid.db.repository.ProductsRepository.ProductStockEpc;
import net.smart.rfid.db.repository.ProductsRepository.ProductStockSku;
import net.smart.rfid.db.repository.ProductsRepository.Products;
import net.smart.rfid.response.FiegeStockResp;
import net.smart.rfid.response.ProductEpcResp;
import net.smart.rfid.response.ProductSellStock2Resp;
import net.smart.rfid.response.ProductSellStockResp;
import net.smart.rfid.response.ProductStockAnag2Resp;
import net.smart.rfid.response.ProductStockAnag3Resp;
import net.smart.rfid.response.ProductStockAnag4Resp;
import net.smart.rfid.response.ProductStockAnagResp;
import net.smart.rfid.response.ProductStockEpcResp;
import net.smart.rfid.response.ProductStockSkuResp;

@RestController
@RequestMapping("")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductsApi {
	Logger logger = Logger.getLogger(ProductsApi.class);

	@Autowired
	private ProductsRepository productsRepository;
	
	@GetMapping("/products")
	public Products getProducts() throws Exception {
		try {
			
			List<Products> listProducts = productsRepository.getProducts();
			if (listProducts.size() > 0) {
				return listProducts.get(0);
			}
			return  null;
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	@GetMapping("/docsProducts")
	public Products getDocsProducts(Integer iddoc) throws Exception {
		try {
			//Questa query sembra errata anche nella vecchia versione
			List<Products> listProducts = productsRepository.getDocProducts(iddoc);
			if (listProducts.size() > 0) {
				return listProducts.get(0);
			}
			return  null;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@GetMapping("/sellProducts")
	public Products sellProducts(String sku) throws Exception {
		try {
			
			List<Products> listProducts = productsRepository.getSellProducts(sku);
			if (listProducts.size() > 0) {
				return listProducts.get(0);
			}
			return  null;
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	@GetMapping("/epcStock")
	public ProductStockEpcResp getStockEPC(@RequestParam(value = "sku", required = true)String sku, @RequestParam(value = "idsite", required = true)Integer idsite) throws Exception {
		try {
			ProductStockEpcResp resp = new ProductStockEpcResp();
			List<ProductStockEpc> listProducts = productsRepository.getStockEPC(sku, idsite);
			if (listProducts.size() > 0) {
				resp.setListings(listProducts);
			}
			resp.setId_server("Server");
			resp.setMessage("EPC Stock");
			return  resp;
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	@GetMapping("/epcExclude")
	public ProductEpcResp getEpcExclude(@RequestParam(value = "iddoc", required = true)Integer iddoc) throws Exception {
		try {
			ProductEpcResp resp = new ProductEpcResp();
			List<String> listProducts = productsRepository.getEPCExclude(iddoc);
			if (listProducts.size() > 0) {
				resp.setListings(listProducts);
			}
			resp.setId_server("Server");
			resp.setMessage("EPC Exclude");
			return  resp;
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	@GetMapping("/skuStock")
	public ProductStockSkuResp getSkuStock(@RequestParam(value = "sku", required = true)String sku, @RequestParam(value = "idsite", required = true)Integer idsite) throws Exception {
		try {
			ProductStockSkuResp resp = new ProductStockSkuResp();
			List<ProductStockSku> listProducts = productsRepository.getStockBarcode(sku, idsite);
			if (listProducts.size() > 0) {
				resp.setListings(listProducts);
			}
			resp.setId_server("Server");
			resp.setMessage("SKU Stock");
			return  resp;
		} catch (Exception e) {
			throw e;
		}
	}
	

	@GetMapping("/getStockAnag")
	public ProductStockAnagResp getStockAnag(@RequestParam(value = "idsite", required = true)Integer idsite) throws Exception {
		try {
			ProductStockAnagResp resp = new ProductStockAnagResp();
			List<ProductStockAnag> listProducts = productsRepository.getStockAnag(idsite);
			if (listProducts.size() > 0) {
				resp.setListings(listProducts);
			}
			resp.setId_server("Server");
			resp.setMessage("SKU Stock");
			return  resp;
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	@GetMapping("/getStockAnag2")
	public ProductStockAnag2Resp getStockAnag2(@RequestParam(value = "idCustomer", required = true)Integer idCustomer) throws Exception {
		try {
			ProductStockAnag2Resp resp = new ProductStockAnag2Resp();
			List<ProductStockAnag2> listProducts = productsRepository.getStockAnag2(idCustomer);
			if (listProducts.size() > 0) {
				resp.setListings(listProducts);
			}
			resp.setId_server("Server");
			resp.setMessage("Products");
			return  resp;
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	@GetMapping("/getStockAnag3")
	public ProductStockAnag3Resp getStockAnag3(@RequestParam(value = "idCustomer", required = true)Integer idCustomer) throws Exception {
		try {
			ProductStockAnag3Resp resp = new ProductStockAnag3Resp();
			List<ProductStockAnag3> listProducts = productsRepository.getStockAnag3(idCustomer);
			if (listProducts.size() > 0) {
				resp.setListings(listProducts);
			}
			resp.setId_server("Server");
			resp.setMessage("Products");
			return  resp;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@GetMapping("/getStockAnag4")
	public ProductStockAnag4Resp getStockAnag4(@RequestParam(value = "idCustomer", required = true)Integer idCustomer) throws Exception {
		try {
			ProductStockAnag4Resp resp = new ProductStockAnag4Resp();
			List<ProductStockAnag4> listProducts = productsRepository.getStockAnag4(idCustomer);
			if (listProducts.size() > 0) {
				resp.setListings(listProducts);
			}
			resp.setId_server("Server");
			resp.setMessage("Products");
			return  resp;
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	
	@GetMapping("/getStockAnag5")
	public ProductStockAnag4Resp getStockAnag5(@RequestParam(value = "idCustomer", required = true)Integer idCustomer) throws Exception {
		try {
			ProductStockAnag4Resp resp = new ProductStockAnag4Resp();
			List<ProductStockAnag4> listProducts = productsRepository.getStockAnag4(idCustomer);
			if (listProducts.size() > 0) {
				resp.setListings(listProducts);
			}
			resp.setId_server("Server");
			resp.setMessage("Products");
			return  resp;
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	
	@GetMapping("/getSellStock")
	public ProductSellStockResp getSellStock(@RequestParam(value = "idSite", required = true)Integer idSite, @RequestParam(value = "sku", required = true)String sku) throws Exception {
		try {
			ProductSellStockResp resp = new ProductSellStockResp();
			List<ProductSellStock> listProducts = productsRepository.getSellStock(idSite, sku);
			if (listProducts.size() > 0) {
				resp.setListings(listProducts);
			}
			resp.setId_server("Server");
			resp.setMessage("Sell Stock");
			return  resp;
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	@GetMapping("/getSellStock2")
	public ProductSellStock2Resp getSellStock2(@RequestParam(value = "idSite", required = true)Integer idSite, @RequestParam(value = "epc", required = true)String epc) throws Exception {
		try {
			ProductSellStock2Resp resp = new ProductSellStock2Resp();
			List<ProductSellStock2> listProducts = productsRepository.getSellStock2(idSite, epc);
			if (listProducts.size() > 0) {
				resp.setListings(listProducts);
			}
			resp.setId_server("Server");
			resp.setMessage("Sell Stock");
			return  resp;
		} catch (Exception e) {
			throw e;
		}
	}

	
	@GetMapping("/getFiegeStock")
	public FiegeStockResp getFiegeStock(@RequestParam(value = "sku", required = true)String sku) throws Exception {
		try {
			FiegeStockResp resp = new FiegeStockResp();
			List<FiegeStock> listProducts = productsRepository.getFiegeStock(sku);
			if (listProducts.size() > 0) {
				resp.setListings(listProducts);
			}
			resp.setId_server("Server");
			resp.setMessage("Fiege Stock");
			return  resp;
		} catch (Exception e) {
			throw e;
		}
	}

}
