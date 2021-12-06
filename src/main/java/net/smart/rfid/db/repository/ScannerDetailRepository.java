package net.smart.rfid.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import net.smart.rfid.db.entity.ScannerDetail;

@Repository
public interface ScannerDetailRepository extends JpaSpecificationExecutor<ScannerDetail>, JpaRepository<ScannerDetail, Long> {

	

}