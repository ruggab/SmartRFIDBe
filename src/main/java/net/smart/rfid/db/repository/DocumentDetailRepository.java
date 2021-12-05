package net.smart.rfid.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


import net.smart.rfid.db.entity.DocumentsDetail;

public interface  DocumentDetailRepository extends JpaSpecificationExecutor<DocumentsDetail>, JpaRepository<DocumentsDetail, Long> {
		
	
	public List<DocumentsDetail>  findByIddoc(Integer iddoc) throws Exception;
}
