package net.smart.rfid.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import net.smart.rfid.db.entity.Scanner;

@Repository
public interface ScannerRepository extends JpaSpecificationExecutor<Scanner>, JpaRepository<Scanner, Long> {

	@Query(value = "select * from clearscan2(:iddoc, :idclient)", nativeQuery = true)
	public void clearScan2(@Param("iddoc") Long iddoc, @Param("idclient") Long idclient) throws Exception;

	@Query(value = "SELECT * from close_step2(:iddoc)", nativeQuery=true)
	public void  closeStep2(@Param ("iddoc") String iddoc) throws Exception;
	
	@Query(value = "SELECT * from close_stepQT(:iddoc)", nativeQuery=true)
	public void  closeStepQT(@Param ("iddoc") String iddoc) throws Exception;

}