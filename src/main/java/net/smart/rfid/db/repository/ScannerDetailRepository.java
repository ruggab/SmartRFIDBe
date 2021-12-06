package net.smart.rfid.db.repository;

import java.util.List;

import javax.persistence.Column;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.JsonNode;

import net.smart.rfid.db.entity.ScannerDetail;
import net.smart.rfid.db.repository.ClientRepository.ClientConfig;

@Repository
public interface ScannerDetailRepository extends JpaSpecificationExecutor<ScannerDetail>, JpaRepository<ScannerDetail, Long> {

	public void deleteByIddocAndSku(Long iddoc, String sku);
	
	public void deleteByIddocAndEpc(Long iddoc, String epc);
	
	
	@Query(value = "select sku, sum(expected) expected, sum(readed) readed from "
			+ "("
			+ " select sku, count(sku) expected, 0 readed "
			+ " from documents_detail"
			+ " where iddoc =  ?1 "
			+ " group by sku "
			+ " union "
			+ " select sku, 0 expected, count(distinct(epc)) readed "
			+ " from scanner_detail "
			+ " where iddoc =  ?1 "
			+ " group by sku "
			+ " ) a "
			+ " group by sku "
			+ " having sum(expected) <> sum(readed)", nativeQuery=true )
	public List<CheckScan>  checkScan(Long iddoc) throws Exception;
	
	public interface CheckScan {
		String getSku();
		Integer getExpected();
		Integer getReaded();
	   
	}
	
	
	@Query(value = "select * from location_check "
			+ "	where iddoc = ?1 and diary_last_location <> idlocation ", nativeQuery=true )
	public List<CheckLocation>  checkLocation(Long iddoc) throws Exception;
	
	public interface CheckLocation {
		Integer getIdlocation();
		Integer getDiary_last_location();
		Integer getIddoc();
		String getEpc();
		String getSku();
	}

}