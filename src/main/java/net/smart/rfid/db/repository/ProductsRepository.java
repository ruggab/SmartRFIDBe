package net.smart.rfid.db.repository;


import java.util.Date;
import java.util.List;

import javax.persistence.Column;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.JsonNode;

@Repository
public interface ProductsRepository extends JpaSpecificationExecutor<net.smart.rfid.db.entity.Product>, JpaRepository<net.smart.rfid.db.entity.Product, Long> {
	
	
	
	@Query(value = "SELECT * from products where sku in (:val)", nativeQuery=true )
	public List<Product>  getProd(String val) throws Exception;
	
	public interface Product {
	
		String getArt1();
		String getArt2();
		String getArt3();
		String getArtfor();
		String getBcode1();
		String getBcode2();
		String getBrand();
		String getCategory();
		String getCode();
		String getCodetype();
		String getCodfor();
		String getCodlinea();
		String getColordesc();
		String getColourcode();
		Integer getCompanyPrefix();
		String getDesclinea();
		String getDescription();
		@Column(columnDefinition = "jsonb")
		JsonNode getExtraj();
		String getFamily();
		Integer getIdCustomer();
		String getImage();
		String getImage2();
		String getImage3();
		String getImage4();
		String getImage5();
		String getImage6();
		String getImage7();
		String getImglabel();
		String getItemcode();
		String getName();
		String getNas();
		String getNas1();
		String getPart();
		Double getPricesell();
		Double getPricesell1();
		Double getPricesell2();
		String getReference();
		String getSeason();
		String getSize();
		String getSizecod();
		String getSku();
		String getTarget();
		String getVariant();
		String getVarianttype();
	}
	
	
	
	@Query(value = "SELECT json_agg(y.*) AS products FROM products y", nativeQuery=true )
	public List<Products>  getProducts() throws Exception;
	
	public interface Products {
	    @Column(columnDefinition = "jsonb")
		JsonNode getProducts();
	}
	
	
	
	@Query(value = "select ( SELECT json_agg(y.*) AS json_agg "
			+ "  FROM products y) AS products where sku in (select sku from documents_details where iddoc = ?1 )", nativeQuery=true )
	public List<Products>  getDocProducts(Integer iddoc) throws Exception;
	
	
	
	@Query(value = "select ( SELECT json_agg(y.*) AS json_agg FROM products y where sku in (:sku) ) AS products", nativeQuery=true )
	public List<Products>  getSellProducts(@Param ("sku") String sku) throws Exception;
	
	
	@Query(value = "select p.*, epc, ts from stockdiary left join products p on sku = barcode where barcode = :sku and id_site = :idsite ", nativeQuery=true )
	public List<ProductStockEpc>  getStockEPC(@Param ("sku") String sku, @Param ("idsite") Integer idsite) throws Exception;
	
	
	public interface ProductStockEpc extends Product{
		String getEpc();
		Date getTs();
	}
	
	
}