package net.smart.rfid.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.smart.rfid.db.repository.ProductsRepository;
import net.smart.rfid.db.repository.ProductsRepository.ProductStockEpc;
import net.smart.rfid.db.repository.ProductsRepository.Products;
import net.smart.rfid.response.ProductStockEpcResp;

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
	

}
