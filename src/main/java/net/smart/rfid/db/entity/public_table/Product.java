package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "products" database table.
 * 
 */
@Entity
@Table(name="\"products\"")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"art1\"")
	private String art1;

	@Column(name="\"art2\"")
	private String art2;

	@Column(name="\"art3\"")
	private String art3;

	@Column(name="\"artfor\"")
	private String artfor;

	@Column(name="\"bcode1\"")
	private String bcode1;

	@Column(name="\"bcode2\"")
	private String bcode2;

	@Column(name="\"brand\"")
	private String brand;

	@Column(name="\"category\"")
	private String category;

	@Column(name="\"code\"")
	private String code;

	@Column(name="\"codetype\"")
	private String codetype;

	@Column(name="\"codfor\"")
	private String codfor;

	@Column(name="\"codlinea\"")
	private String codlinea;

	@Column(name="\"colordesc\"")
	private String colordesc;

	@Column(name="\"colourcode\"")
	private String colourcode;

	@Column(name="\"company_prefix\"")
	private int companyPrefix;

	@Column(name="\"desclinea\"")
	private String desclinea;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"extraj\"")
	private Object extraj;

	@Column(name="\"family\"")
	private String family;

	@Column(name="\"id_customer\"")
	private int idCustomer;

	@Column(name="\"image\"")
	private String image;

	@Column(name="\"image2\"")
	private String image2;

	@Column(name="\"image3\"")
	private String image3;

	@Column(name="\"image4\"")
	private String image4;

	@Column(name="\"image5\"")
	private String image5;

	@Column(name="\"image6\"")
	private String image6;

	@Column(name="\"image7\"")
	private String image7;

	@Column(name="\"imglabel\"")
	private String imglabel;

	@Column(name="\"itemcode\"")
	private String itemcode;

	@Column(name="\"name\"")
	private String name;

	@Column(name="\"nas\"")
	private String nas;

	@Column(name="\"nas1\"")
	private String nas1;

	@Column(name="\"part\"")
	private String part;

	@Column(name="\"pricesell\"")
	private double pricesell;

	@Column(name="\"pricesell1\"")
	private double pricesell1;

	@Column(name="\"pricesell2\"")
	private double pricesell2;

	@Column(name="\"reference\"")
	private String reference;

	@Column(name="\"season\"")
	private String season;

	@Column(name="\"size\"")
	private String size;

	@Column(name="\"sizecod\"")
	private String sizecod;

	@Column(name="\"sku\"")
	private String sku;

	@Column(name="\"target\"")
	private String target;

	@Column(name="\"variant\"")
	private String variant;

	@Column(name="\"varianttype\"")
	private String varianttype;

	public Product() {
	}

	public String getArt1() {
		return this.art1;
	}

	public void setArt1(String art1) {
		this.art1 = art1;
	}

	public String getArt2() {
		return this.art2;
	}

	public void setArt2(String art2) {
		this.art2 = art2;
	}

	public String getArt3() {
		return this.art3;
	}

	public void setArt3(String art3) {
		this.art3 = art3;
	}

	public String getArtfor() {
		return this.artfor;
	}

	public void setArtfor(String artfor) {
		this.artfor = artfor;
	}

	public String getBcode1() {
		return this.bcode1;
	}

	public void setBcode1(String bcode1) {
		this.bcode1 = bcode1;
	}

	public String getBcode2() {
		return this.bcode2;
	}

	public void setBcode2(String bcode2) {
		this.bcode2 = bcode2;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodetype() {
		return this.codetype;
	}

	public void setCodetype(String codetype) {
		this.codetype = codetype;
	}

	public String getCodfor() {
		return this.codfor;
	}

	public void setCodfor(String codfor) {
		this.codfor = codfor;
	}

	public String getCodlinea() {
		return this.codlinea;
	}

	public void setCodlinea(String codlinea) {
		this.codlinea = codlinea;
	}

	public String getColordesc() {
		return this.colordesc;
	}

	public void setColordesc(String colordesc) {
		this.colordesc = colordesc;
	}

	public String getColourcode() {
		return this.colourcode;
	}

	public void setColourcode(String colourcode) {
		this.colourcode = colourcode;
	}

	public int getCompanyPrefix() {
		return this.companyPrefix;
	}

	public void setCompanyPrefix(int companyPrefix) {
		this.companyPrefix = companyPrefix;
	}

	public String getDesclinea() {
		return this.desclinea;
	}

	public void setDesclinea(String desclinea) {
		this.desclinea = desclinea;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Object getExtraj() {
		return this.extraj;
	}

	public void setExtraj(Object extraj) {
		this.extraj = extraj;
	}

	public String getFamily() {
		return this.family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public int getIdCustomer() {
		return this.idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getImage2() {
		return this.image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getImage3() {
		return this.image3;
	}

	public void setImage3(String image3) {
		this.image3 = image3;
	}

	public String getImage4() {
		return this.image4;
	}

	public void setImage4(String image4) {
		this.image4 = image4;
	}

	public String getImage5() {
		return this.image5;
	}

	public void setImage5(String image5) {
		this.image5 = image5;
	}

	public String getImage6() {
		return this.image6;
	}

	public void setImage6(String image6) {
		this.image6 = image6;
	}

	public String getImage7() {
		return this.image7;
	}

	public void setImage7(String image7) {
		this.image7 = image7;
	}

	public String getImglabel() {
		return this.imglabel;
	}

	public void setImglabel(String imglabel) {
		this.imglabel = imglabel;
	}

	public String getItemcode() {
		return this.itemcode;
	}

	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNas() {
		return this.nas;
	}

	public void setNas(String nas) {
		this.nas = nas;
	}

	public String getNas1() {
		return this.nas1;
	}

	public void setNas1(String nas1) {
		this.nas1 = nas1;
	}

	public String getPart() {
		return this.part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public double getPricesell() {
		return this.pricesell;
	}

	public void setPricesell(double pricesell) {
		this.pricesell = pricesell;
	}

	public double getPricesell1() {
		return this.pricesell1;
	}

	public void setPricesell1(double pricesell1) {
		this.pricesell1 = pricesell1;
	}

	public double getPricesell2() {
		return this.pricesell2;
	}

	public void setPricesell2(double pricesell2) {
		this.pricesell2 = pricesell2;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getSeason() {
		return this.season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSizecod() {
		return this.sizecod;
	}

	public void setSizecod(String sizecod) {
		this.sizecod = sizecod;
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getVariant() {
		return this.variant;
	}

	public void setVariant(String variant) {
		this.variant = variant;
	}

	public String getVarianttype() {
		return this.varianttype;
	}

	public void setVarianttype(String varianttype) {
		this.varianttype = varianttype;
	}

}