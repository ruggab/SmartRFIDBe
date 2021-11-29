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
public interface ClientRepository extends JpaSpecificationExecutor<Clients>, JpaRepository<Clients, Long> {
	

	
	public List<Clients>  findByMac(String mac) throws Exception;
	
	
	
	@Query(value = "SELECT f.id_customer, "
			+ " f.idflow,"
			+ " f.description,"
			+ " json_agg(s.*) as vw_step"
			+ " FROM flow f "
			+ " JOIN vw_step2 s ON f.idflow = s.idflow and s.idclient = ?1 "
			+ " GROUP BY f.id_customer,f.idflow, f.description", nativeQuery=true )
	public List<ClientConfig>  getClientConfig(Long idClinet) throws Exception;
	
	public interface ClientConfig {
		Integer getId_customer();
		Integer getIdflow();
		String getDescription();
	    @Column(columnDefinition = "jsonb")
		JsonNode getVw_step();
	}
	
	
	@Query(value = "SELECT f.id_customer, "
			+ " f.idflow,"
			+ " f.description,"
			+ " json_agg(s.*) as vw_step"
			+ " FROM flow f "
			+ " JOIN vw_step2 s ON f.idflow = s.idflow and s.idclient = ?1 "
			+ " GROUP BY f.idflow, f.description ", nativeQuery=true )
	public List<ClientConfig>  getClientConfigQC(Long idClinet) throws Exception;
	
	
	
	
	@Query(value = "select (SELECT case when json_agg(y.value)\\:\\:text = '[null]' then '[]'\\:\\: json else json_agg(y.value)\\:\\: json end AS json_agg "
			+ "FROM filters y where type = 'C' and id_customer in (select id_customer from clients where mac = ?1)) AS prefix", nativeQuery=true )
	public List<CompanyPrefix>  getCompanyPrefix(String mac) throws Exception;
	
	public interface CompanyPrefix {
	    @Column(columnDefinition = "jsonb")
		JsonNode getPrefix();
	}
	
	
	@Query(value = "select ( SELECT case when json_agg(y.epc)\\:\\:text = '[null]' then '[]'\\:\\:json else json_agg(y.epc)\\:\\:json end AS json_agg "
			 + "FROM stocksite y where idsite = ?1) AS stock", nativeQuery=true )
	public List<CompanyStock>  getCompanyStock(String mac) throws Exception;
	
	public interface CompanyStock {
	    @Column(columnDefinition = "jsonb")
		JsonNode getStock();
	}
	
	
	@Query(value = "select c.id_customer, zpl from printers_templates t"
			+ "	join clients c on c.id_customer = t.id_customer "
			+ "	where c.id = ?1", nativeQuery=true )
	public List<ClientConfigScanPrint>  getClientConfigScanPrint(Long idClinet) throws Exception;
	
	public interface ClientConfigScanPrint {
		Integer getId_customer();
		Integer getZpl();
	}
	
	
	
	
	
	
}