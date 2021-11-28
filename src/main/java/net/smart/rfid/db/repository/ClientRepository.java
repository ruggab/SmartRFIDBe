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
	
}