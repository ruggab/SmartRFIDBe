package net.smart.rfid.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.smart.rfid.db.repository.ProductsRepository;
import net.smart.rfid.db.repository.ProductsRepository.Products;

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
			
			List<Products> listProducts = productsRepository.getDocProducts(iddoc);
			if (listProducts.size() > 0) {
				return listProducts.get(0);
			}
			return  null;
		} catch (Exception e) {
			throw e;
		}
	}
	

	
	

}
