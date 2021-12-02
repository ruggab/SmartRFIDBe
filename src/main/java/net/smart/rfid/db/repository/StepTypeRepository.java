package net.smart.rfid.db.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.smart.rfid.db.entity.StepType;

@Repository
public interface StepTypeRepository extends JpaSpecificationExecutor<StepType>, JpaRepository<StepType, Long> {

	@Query(value = "select t.* "
			+ "	from step_type t join step s on s.idsteptype = t.idstep_type "
			+ "	where s.idstep = ?1", nativeQuery=true )
	public StepType  getDocTypeByStep(Integer idStep) throws Exception;
	
	
}