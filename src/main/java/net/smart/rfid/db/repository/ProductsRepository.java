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
	
	@Query(value = "select distinct epc from scanner_detail sd join documents d on d.id = sd.iddoc "
			+ "where doc_date\\:\\:date > (select x.doc_date\\:\\:date from documents x where id = :iddoc) and epc is not null ", nativeQuery=true )
	public List<String>  getEPCExclude(@Param ("iddoc") Integer iddoc) throws Exception;
	
	@Query(value = "select p.code, p.description, p.sku, count(epc)  from stockdiary "
			+ " left join products p on sku = barcode where barcode = :sku and id_site = :idsite"
			+ "	group by p.code, p.description, p.sku", nativeQuery=true )
	public List<ProductStockSku>  getStockBarcode(@Param ("sku") String sku, @Param ("idsite") Integer idsite) throws Exception;
	
	public interface ProductStockSku {
		String getCode();
		String getDescription();
		String getSku();
		Integer getCount();
	}
	
	
	@Query(value = "select sku, code, description"
			+ " from stockdiary"
			+ "	join products on sku = barcode "
			+ "	where id_site = :idsite and units > 0 "
			+ "	group by sku, code, description", nativeQuery=true )
	public List<ProductStockAnag>  getStockAnag(@Param ("idsite") Integer idsite) throws Exception;

	public interface ProductStockAnag {
		String getCode();
		String getDescription();
		String getSku();
	}
	
	@Query(value = "select code, description, sku, '' as company_prefix, id_customer,"
			+ "'' as reference,"
			+ "'' as codetype,"
			+ "'' as name,"
			+ "'' as pricesell,"
			+ "'' as pricesell1,"
			+ "'' as pricesell2,"
			+ "'' as category,"
			+ "'' as image,"
			+ "'' as itemcode,"
			+ "colourcode,"
			+ "'' as colordesc,"
			+ "size,"
			+ "'' as sizecod,"
			+ "'' as family,"
			+ "'' as target,"
			+ "'' as part,"
			+ "'' as variant,"
			+ "'' as varianttype,"
			+ "brand,"
			+ "'' as season,"
			+ "'' as nas,"
			+ "'' as nas1,"
			+ "'' as art1,"
			+ "'' as art2,"
			+ "'' as art3,"
			+ "'' as codfor,"
			+ "'' as artfor,"
			+ "'' as codlinea,"
			+ "desclinea,"
			+ "bcode1,"
			+ "bcode2 "
			+ "from products "
			+ "where id_customer = :idCustomer", nativeQuery=true )
	public List<ProductStockAnag2>  getStockAnag2(@Param ("idCustomer") Integer idCustomer) throws Exception;

	public interface ProductStockAnag2 {
		String getCode();
		String getDescription(); 
		String getSku();
		String getCompany_prefix();
		String getId_customer();
		String getReference();
		String getCodetype();
		String getName();
		String getPricesell();
		String getPricesell1();
		String getPricesell2();
		String getCategory();
		String getImage();
		String getItemcode();
		String getColourcode();
		String getColordesc();
		String getSize();
		String getSizecod();
		String getFamily();
		String getTarget();
		String getPart();
		String getVariant();
		String getVarianttype();
		String getBrand();
		String getSeason();
		String getNas();
		String getNas1();
		String getArt1();
		String getArt2();
		String getArt3();
		String getOdfor();
		String getArtfor();
		String getCodlinea();
		String getDesclinea();
		String getBcode1();
		String getBcode();
	}
	
	
	
	@Query(value = "select code,"
			+ " description, "
			+ "sku, "
			+ "'' as company_prefix, "
			+ "id_customer,"
			+ "colourcode,"
			+ "size,"
			+ "brand,"
			+ "desclinea,"
			+ "bcode1,"
			+ "bcode2 "
			+ "from products "
			+ "where id_customer = :idCustomer", nativeQuery=true )
	public List<ProductStockAnag3>  getStockAnag3(@Param ("idCustomer") Integer idCustomer) throws Exception;

	public interface ProductStockAnag3 {
		String getCode();
		String getDescription(); 
		String getSku();
		String getCompany_prefix();
		String getId_customer();
		String getColourcode();
		String getSize();
		String getBrand();
		String getDesclinea();
		String getBcode1();
		String getBcode();
	}
	
	
	@Query(value = "select code, description, sku, '' as company_prefix, id_customer,"
			+ "reference,"
			+ "codetype,"
			+ "name,"
			+ "pricesell,"
			+ "pricesell1,"
			+ "pricesell2,"
			+ "category,"
			+ "image,"
			+ "itemcode,"
			+ "colourcode,"
			+ "colordesc,"
			+ "size,"
			+ "sizecod,"
			+ "family,"
			+ "target,"
			+ "part,"
			+ "variant,"
			+ "varianttype,"
			+ "brand,"
			+ "season,"
			+ "nas,"
			+ "nas1,"
			+ "art1,"
			+ "art2,"
			+ "art3,"
			+ "codfor,"
			+ "artfor,"
			+ "codlinea,"
			+ "desclinea,"
			+ "bcode1,"
			+ "bcode2,"
			+ "imglabel,"
			+ "image2,"
			+ "image3,"
			+ "image4,"
			+ "image5,"
			+ "image6,"
			+ "image7"
			+ " from products "
			+ " where id_customer = :idCustomer", nativeQuery=true )
	public List<ProductStockAnag4>  getStockAnag4(@Param ("idCustomer") Integer idCustomer) throws Exception;

	public interface ProductStockAnag4 extends ProductStockAnag2 {
		 String getImglabel();
		 String getImage2();
		 String getImage3();
		 String getImage4();
		 String getImage5();
		 String getImage6();
		 String getImage7();
	}
	
	
	@Query(value = "select code, description, sku, '' as company_prefix, id_customer,"
			+ "reference,"
			+ "codetype,"
			+ "name,"
			+ "pricesell,"
			+ "pricesell1,"
			+ "pricesell2,"
			+ "category,"
			+ "image,"
			+ "itemcode,"
			+ "colourcode,"
			+ "colordesc,"
			+ "size,"
			+ "sizecod,"
			+ "family,"
			+ "target,"
			+ "part,"
			+ "variant,"
			+ "varianttype,"
			+ "brand,"
			+ "season,"
			+ "nas,"
			+ "nas1,"
			+ "art1,"
			+ "art2,"
			+ "art3,"
			+ "codfor,"
			+ "artfor,"
			+ "codlinea,"
			+ "desclinea,"
			+ "bcode1,"
			+ "bcode2,"
			+ "imglabel,"
			+ "image2,"
			+ "image3,"
			+ "image4,"
			+ "image5,"
			+ "image6,"
			+ "image7"
			+ " from products "
			+ " where id_customer = :idCustomer order by sku offset :offset limit :limit", nativeQuery=true )
	public List<ProductStockAnag4>  getStockAnag5(@Param ("idCustomer") Integer idCustomer, @Param ("offset") Integer offset, @Param ("limit") Integer limit) throws Exception;
	
	
	

	@Query(value = "select l.description loc, p.description pro, sum(units) units from stockdiary "
			+ " join products p on sku = barcode "
			+ "	join location l on l.id = id_location and idsite = :idsite "
			+ "	where sku = :sku "
			+ "	group by l.description, p.description ", nativeQuery=true )
	public List<ProductSellStock>  getSellStock(@Param ("idsite") Integer idsite, @Param ("sku") String sku) throws Exception;

	public interface ProductSellStock {
		String getLoc();
		String getPro();
		Integer getUnits();
	}
	
	
	

	@Query(value = "select id_location, units from stockdiary "
			+ " where epc = :epc and id_site = :idsite "
			+ " order by ts desc"
			+ " limit 1 ", nativeQuery=true )
	public List<ProductSellStock2>  getSellStock2(@Param ("idsite") Integer idsite, @Param ("epc") String epc) throws Exception;

	public interface ProductSellStock2 {
		String getId_location();
		String getUnits();
	}
	
	
	
	@Query(value = "select * from fiege_stock where sku = :sku ", nativeQuery=true )
	public List<ProductSellStock2>  getFiegeStock(@Param ("sku") String sku) throws Exception;

//	public interface ProductSellStock2 {
//		String getId_location();
//		String getUnits();
//	}
	
}