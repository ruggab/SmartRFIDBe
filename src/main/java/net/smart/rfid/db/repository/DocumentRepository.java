package net.smart.rfid.db.repository;


import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.JsonNode;

import net.smart.rfid.db.entity.Documents;

@Repository
public interface DocumentRepository extends JpaSpecificationExecutor<Documents>, JpaRepository<Documents, Long> {
	

	
	
	@Query(value = "SELECT "
			+ "d.id, d.doc_number, d.doc_date,"
			+ "d.doc_ref, d.doc_origin, d.idflow, d.idstep, d.idsite,"
			+ "d.previous_iddoc, d.status, d.id_document_type, d.doc_date_start_read,"
			+ "d.doc_date_last_read, d.doc_date_closed, d.merged_docs, d.doc_exclusive,"
			+ "d.filter_type, d.expected, d.doc_type, d.idsite_dest, d.origin_location, filter.filter,"
			+ "(select count(sku) from documents_detail dd where d.id = dd.iddoc) qty,"
			+ "(select count(distinct(epc)) from scanner_detail sd where d.id = sd.iddoc and sd.epc <>'null') qty_read,"
			+ "CASE "
			+ "	WHEN json_agg(e.*)\\:\\:text = '[null]'\\:\\:text THEN '[]'\\:\\:json "
			+ "	ELSE json_agg(e.*) "
			+ "END doc_destination,"
			+ "case when can_change_location = true then 1 else 0 end can_change_location,"
			+ "case when as_expected = true then 1 else 0 end as_expected,"
			+ "case when can_overload = true then 1 else 0 end can_overload "
			+ "from documents d "
			+ "JOIN documents_type dt on dt.id_doctype = d.id_document_type "
			+ "LEFT JOIN documents_destination e ON "
			+ "case when length(split_part(d.doc_ref , '(' , 2)) > 0 "
			+ "	then substr(split_part(d.doc_ref , '(' , 2) , 1 , length(split_part(d.doc_ref , '(' , 2))-1) "
			+ "	else '[]'\\:\\:text end  = e.origin "
			+ "and e.idstep = d.idstep "
			+ "LEFT JOIN LATERAL coalesce((select idfilter from rel_filter_step f "
			+ "WHERE f.idstep = d.idstep limit 1) , null, -1) filter on TRUE "
			+ "where d.idflow = :idflow and d.idstep = :idstep and d.idsite = :idsite and d.status is null "
			+ "group by d.id, d.doc_number, d.doc_date, "
			+ "d.doc_ref, d.doc_origin, d.idflow, d.idstep, d.idsite, "
			+ "d.previous_iddoc, d.status, d.id_document_type, d.doc_date_start_read, "
			+ "d.doc_date_last_read, d.doc_date_closed, d.merged_docs, d.doc_exclusive, "
			+ "d.filter_type, d.expected, d.doc_type, d.idsite_dest, d.doc_destination, d.origin_location, filter.filter, "
			+ "can_change_location, as_expected, can_overload ", nativeQuery=true )
	public List<DocumentsFilter>  getDocuments(@Param ("idflow") Integer idflow, @Param ("idstep") Integer idstep, @Param ("idsite") Integer idsite) throws Exception;
	
	public interface DocumentsFilter {
		Integer getId();
		Integer getDoc_number();
		Date getDoc_date();
	    String getDoc_ref();
		String getDoc_origin();
		Integer getIdflow();
		Integer getIdstep();
		Integer getIdsite();
		Integer getPrevious_iddoc();
		String  getStatus();
		Integer getId_document_type();
		Date getDoc_date_start_read();
		Date getDoc_date_last_read();
		Date getDoc_date_closed();
		String getMerged_docs();
		boolean getDoc_exclusive();
		Integer getFilter_type();
		boolean getExpected();
		String getDoc_type();
		Integer getIdsite_dest();
		//String getDoc_destination();
		Integer getOrigin_location();
		Integer getFilter();
		BigInteger getQty();
		BigInteger getQty_read();
		@Column(columnDefinition = "jsonb")
		JsonNode getDoc_destination();
		Integer getCan_change_location();
		Integer getAs_expected();
		Integer getCan_overload();
		
	}
	
	
	@Query(value = "SELECT * , (select count(sku) from scanner_detail dd where d.id = dd.iddoc) qty from documents d "
			+ "	LEFT JOIN LATERAL coalesce((select idfilter from rel_filter_step f "
			+ "	WHERE f.idstep = d.idstep limit 1) , null, -1) filter on TRUE "
			+ "	where d.idflow = :idflow and d.idstep = :idstep and d.idsite = :idsite order by doc_date desc limit 100 ", nativeQuery=true )
	public List<Ticket>  getTickets(@Param ("idflow") Integer idflow, @Param ("idstep") Integer idstep, @Param ("idsite") Integer idsite) throws Exception;

	
	@Query(value = "SELECT * , (select count(sku) from scanner_detail dd where d.id = dd.iddoc) qty from documents d "
			+ "	LEFT JOIN LATERAL coalesce((select idfilter from rel_filter_step f "
			+ "	WHERE f.idstep = d.idstep limit 1) , null, -1) filter on TRUE "
			+ "	where d.idflow = :idflow and d.idstep = :idstep and d.idsite = :idsite and d.id_template = true ", nativeQuery=true )
	public List<Ticket>  getDocumentsTemplates(@Param ("idflow") Integer idflow, @Param ("idstep") Integer idstep, @Param ("idsite") Integer idsite) throws Exception;

	public interface Ticket {
		Integer getId();
		Integer getDoc_number();
		Date getDoc_date();
	    String getDoc_ref();
		String getDoc_origin();
		Integer getIdflow();
		Integer getIdstep();
		Integer getIdsite();
		Integer getPrevious_iddoc();
		String  getStatus();
		Integer getId_document_type();
		Date getDoc_date_start_read();
		Date getDoc_date_last_read();
		Date getDoc_date_closed();
		String getMerged_docs();
		boolean getDoc_exclusive();
		Integer getFilter_type();
		boolean getExpected();
		String getDoc_type();
		Integer getIdsite_dest();
		String getDoc_destination();
		boolean getIs_template();
		Integer getOrigin_location();
		boolean getFiege_export();
		String getOrigin_ref();
		BigInteger getQty();
		
	}
	
	
	@Query(value = "SELECT * from active_docs where id = :id ", nativeQuery=true )
	public List<DocDetail>  getDocDetail(@Param ("id") Integer id) throws Exception;
	
	
	@Query(value = "SELECT * from active_docs2 where id = :id ", nativeQuery=true )
	public List<DocDetail>  getDocDetail2(@Param ("id") Integer id) throws Exception;
	
	public interface DocDetail {
		Integer getId();
		Integer getDoc_number();
		Date getDoc_date();
	    String getDoc_ref();
		String getDoc_origin();
		Integer getIdflow();
		Integer getIdstep();
		Integer getIdsite();
		Integer getPrevious_iddoc();
		String  getStatus();
		@Column(columnDefinition = "jsonb")
		JsonNode getDocuments_detail();
	}
	
	
	@Query(value = "SELECT * from active_scan where iddoc = :iddoc ", nativeQuery=true )
	public List<ScanDetail>  getScanDetail(@Param ("iddoc") Integer iddoc) throws Exception;
	
	@Query(value = "SELECT * from active_scan2 where iddoc = :iddoc order by idscan desc limit 1  ", nativeQuery=true )
	public List<ScanDetail>  getScanDetail2(@Param ("iddoc") Integer iddoc) throws Exception;
	
	public interface ScanDetail {
		Integer getIdscan();
		Integer getIddoc();
		@Column(columnDefinition = "jsonb")
		JsonNode getScanner_detail();
	}
	
	
	@Query(value = "SELECT * from scanwrite(:epcin,:epcout,:skuin,:skuout)", nativeQuery=true )
	public void  setScanWrite(@Param ("epcin") String epcin, @Param ("epcout") String epcout, @Param ("skuin") String skuin,@Param ("skuout") String skuout) throws Exception;

	
	@Query(value = "SELECT * from cleardoc(:iddoc)", nativeQuery=true )
	public void  clearDoc(@Param ("iddoc") Integer iddoc) throws Exception;

	@Query(value = "SELECT * from cleardoc_return(:iddoc)", nativeQuery=true )
	public void  clearDocReturn(@Param ("iddoc") Integer iddoc) throws Exception;
	
	@Query(value = "select * from setreaddate(:iddoc)", nativeQuery=true )
	public void  setReadDate(@Param ("iddoc") Integer iddoc) throws Exception;
	
	@Query(value = "select * from mergedocs(:ids)", nativeQuery=true )
	public void  mergeDocs(@Param ("ids") String ids) throws Exception;
	
	
	@Query(value = "update documents set is_template = true where id = :iddoc", nativeQuery=true )
	public void  setDocumentsTemplate(@Param ("iddoc") Integer iddoc) throws Exception;
	
	@Query(value = "select * from updatediary(:epc,:sku,:idsite,:idlocation,:idstep,:sign)", nativeQuery=true )
	public void  updateDiary(@Param ("epc") String epc, @Param ("sku") String sku, @Param ("idsite") Integer idsite,
			                 @Param ("idlocation") Integer idlocation, @Param ("idstep") Integer idstep,
			                 @Param ("sign") Integer sign) throws Exception;
	
	
	
	@Query(value = "select s.epc, s.sku, coalesce(d.epc, null, 'S') err,"
			+ "	coalesce (d.id_location , null, -1) id_location "
			//+ "	coalesce (l.description , null, '') ds_location "
			+ "	from scanner_detail s "
			+ "	join documents x on x.id = s.iddoc "
			+ "	left join stockdiary d on s.epc = d.epc "
			+ "	and units > 0 and "
			+ "	case when coalesce(x.origin_location , null , -1) > 0 then "
			+ "	id_location = x.origin_location "
			+ "	else "
			+ "	id_location in(select id from location l where idsite = x.idsite) end "
			+ "	where s.iddoc = :iddoc and s.epc is not null "
			+ "	group by s.epc, s.sku, d.epc, d.id_location ", nativeQuery=true)
	public List<LocEpc>  getLocEpc(@Param ("iddoc") Integer iddoc) throws Exception;

	public interface LocEpc {
		String getEpc();
		String getSku();
		String getErr();
		String getId_location();
		String getDs_location();
	}
	
//	@Query(value = "insert into documents_detail (sku, iddoc) select sku, '+_iddoc+' "
//			+ " from documents_detail where iddoc = '+_iddoc_template;", nativeQuery=true )
//	public void  addDocTemplate(@Param ("iddoc") Integer iddoc) throws Exception;
	

	@Modifying
	@Transactional
	@Query(value="insert into documents_detail "
			+ "(epc, sku, iddoc) "
			+ "select epc, barcode, ?1 from stockdiary "
			+ "where id_site = ?2 and id_location = ?3 "
			+ "group by epc,barcode,id_location "
			+ "having sum(units) > 0 ", 
			  nativeQuery = true)
	void insertEpcFromDiary(Integer iddoc, Integer idsite, Integer idlocation);
	
	
	@Modifying
	@Transactional
	@Query(value="delete from documents_detail where sku in "
			+ "(select "
			+ "sku from products "
			+ "where (code, variant, colourcode) "
			+ "(select code, variant, colourcode "
			+ "from products where sku = ?2)) and iddoc = ?1 ", 
			  nativeQuery = true)
	void deleteExpected(Integer iddoc, String sku);
	
	@Modifying
	@Transactional
	@Query(value="insert into documents_detail "
			+ "(sku, iddoc) "
			+ "select "
			+ "sku, ?1 from products "
			+ "where (code, variant, colourcode) in "
			+ "(select code, variant, colourcode "
			+ "from products where sku = ?2) ", 
			  nativeQuery = true)
	void setExpected(Integer iddoc, String sku);
	
	@Modifying
	@Transactional
	@Query(value="update documents set filter_type = 2 where id = ?1 ", 
			  nativeQuery = true)
	void updateFilterType(Integer iddoc);
	
	
	
	
	public interface ILocationBySite {
		String getTs();
		Integer getUnits();
		String getSign2();
		Integer getId_location();
		String getLocdesc();
		Integer getId_site();
		String getSitedesc();
		String getEpc();
		String getBarcode();
		Integer getId_document();
		Integer getId_reason();
		String getReadesc();
		Integer getId_doctype();
		String getDoctypedesc();
		Integer getId();
		String getDoc_ref();
		String getSign();
	}
	
	
	@Query(value = "select ts, sum(units), case when d.units < 0 then '-' else '+' end sign2, "
			  +"id_location, l.description locdesc, id_site, s.description sitedesc , "
			  +"epc, barcode, id_document, id_reason, r.description readesc, y.id_doctype, "
			  +"y.description doctypedesc, x.id, x.doc_ref, r.sign "
			  +"from stockdiary d join sites s on d.id_site = s.id "
			  +"join location l on l.id = d.id_location "
			  +"join reason r on r.id = d.id_reason "
			  +"left join documents x on x.id = d.id_document "
			  +"left join documents_type y on x.id_document_type = y.id_doctype "
			  +"where epc = :epc "
			  +"group by ts, d.id, d.units, l.description, id_location, l.description, "
			  +"id_site, s.description , epc, barcode, id_document, id_reason, "
			  +"r.description, y.id_doctype, y.description, x.id, x.doc_ref, r.sign "
			  +"order by ts, d.id  ", nativeQuery=true)
	public List<ILocationBySite>  getEpcHistory(@Param ("epc") String epc) throws Exception;
	
	
	@Query(value = "select ts, sum(units), case when d.units < 0 then '-' else '+' end sign2, "
			  +"id_location, l.description locdesc, id_site, s.description sitedesc , "
			  +"epc, barcode, id_document, id_reason, r.description readesc, y.id_doctype, "
			  +"y.description doctypedesc, x.id, x.doc_ref, r.sign "
			  +"from stockdiary d join sites s on d.id_site = s.id "
			  +"join location l on l.id = d.id_location "
			  +"join reason r on r.id = d.id_reason "
			  +"left join documents x on x.id = d.id_document "
			  +"left join documents_type y on x.id_document_type = y.id_doctype "
			  +"where epc = :epc and sign = '+' and id_site = :idsite "
			  +"group by ts, d.id, d.units, l.description, id_location, l.description, "
			  +"id_site, s.description , epc, barcode, id_document, id_reason, "
			  +"r.description, y.id_doctype, y.description, x.id, x.doc_ref, r.sign "
			  +"order by ts desc, d.id desc "
			  +"limit 1", nativeQuery=true)
	public List<ILocationBySite>  getEpcLocationBySite(@Param ("epc") String epc, @Param ("idsite") String idsite ) throws Exception;

	
	@Query(value = "select ts, sum(units), case when d.units < 0 then '-' else '+' end sign2, "
			  +"id_location, l.description locdesc, id_site, s.description sitedesc , "
			  +"epc, barcode, id_document, id_reason, r.description readesc, y.id_doctype, "
			  +"y.description doctypedesc, x.id, x.doc_ref, r.sign, "
			  +"(select id_location "
			  +"from stockdiary where epc = :epc "
			  +"and id_site = :idsite and units = 1 "
			  +"order by ts desc ,id desc "
			  +"limit 1) current_location "
			  +"from stockdiary d join sites s on d.id_site = s.id "
			  +"join location l on l.id = d.id_location "
			  +"join reason r on r.id = d.id_reason "
			  +"left join documents x on x.id = d.id_document "
			  +"left join documents_type y on x.id_document_type = y.id_doctype "
			  +"where  barcode = :sku and epc <> :epc and sign = '+' and id_site =:idsite "
			  +"group by ts, d.id, d.units, l.description, id_location, l.description, "
			  +"id_site, s.description , epc, barcode, id_document, id_reason, "
			  +"r.description, y.id_doctype, y.description, x.id, x.doc_ref, r.sign "
			  +"order by ts desc, d.id desc "
			  +"limit 1", nativeQuery=true)
	public List<ILocationBySite>  getSkuLocationBySite(@Param ("sku") String sku, @Param ("epc") String epc, @Param ("idsite") String idsite ) throws Exception;

	
}