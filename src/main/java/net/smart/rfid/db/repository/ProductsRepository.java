package net.smart.rfid.db.repository;


import java.util.List;

import javax.persistence.Column;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.fasterxml.jackson.databind.JsonNode;

import net.smart.rfid.db.entity.Clients;

@Repository
public interface ProductsRepository extends JpaSpecificationExecutor<Object>, JpaRepository<Object, Long> {
	

	
	
	
	
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
	
	
	
	
	
	
	
	
	
}