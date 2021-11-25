package net.smart.rfid.db.entity.transact;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "product" database table.
 * 
 */
@Entity
@Table(name="\"product\"")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"buyurl\"")
	private String buyurl;

	@Column(name="\"colourcode\"")
	private int colourcode;

	@Column(name="\"colourname\"")
	private String colourname;

	@Column(name="\"currency\"")
	private String currency;

	@Column(name="\"dept\"")
	private String dept;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"filename\"")
	private String filename;

	@Column(name="\"images0\"")
	private String images0;

	@Column(name="\"images1\"")
	private String images1;

	@Column(name="\"images2\"")
	private String images2;

	@Column(name="\"images3\"")
	private String images3;

	@Column(name="\"images4\"")
	private String images4;

	@Column(name="\"itemtype\"")
	private String itemtype;

	@Column(name="\"material\"")
	private String material;

	@Column(name="\"name\"")
	private String name;

	@Column(name="\"price\"")
	private String price;

	@Column(name="\"productid\"")
	private int productid;

	@Column(name="\"recommended0\"")
	private String recommended0;

	@Column(name="\"recommended1\"")
	private String recommended1;

	@Column(name="\"retailer\"")
	private String retailer;

	@Column(name="\"skuid\"")
	private String skuid;

	public Product() {
	}

	public String getBuyurl() {
		return this.buyurl;
	}

	public void setBuyurl(String buyurl) {
		this.buyurl = buyurl;
	}

	public int getColourcode() {
		return this.colourcode;
	}

	public void setColourcode(int colourcode) {
		this.colourcode = colourcode;
	}

	public String getColourname() {
		return this.colourname;
	}

	public void setColourname(String colourname) {
		this.colourname = colourname;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDept() {
		return this.dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getImages0() {
		return this.images0;
	}

	public void setImages0(String images0) {
		this.images0 = images0;
	}

	public String getImages1() {
		return this.images1;
	}

	public void setImages1(String images1) {
		this.images1 = images1;
	}

	public String getImages2() {
		return this.images2;
	}

	public void setImages2(String images2) {
		this.images2 = images2;
	}

	public String getImages3() {
		return this.images3;
	}

	public void setImages3(String images3) {
		this.images3 = images3;
	}

	public String getImages4() {
		return this.images4;
	}

	public void setImages4(String images4) {
		this.images4 = images4;
	}

	public String getItemtype() {
		return this.itemtype;
	}

	public void setItemtype(String itemtype) {
		this.itemtype = itemtype;
	}

	public String getMaterial() {
		return this.material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getProductid() {
		return this.productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getRecommended0() {
		return this.recommended0;
	}

	public void setRecommended0(String recommended0) {
		this.recommended0 = recommended0;
	}

	public String getRecommended1() {
		return this.recommended1;
	}

	public void setRecommended1(String recommended1) {
		this.recommended1 = recommended1;
	}

	public String getRetailer() {
		return this.retailer;
	}

	public void setRetailer(String retailer) {
		this.retailer = retailer;
	}

	public String getSkuid() {
		return this.skuid;
	}

	public void setSkuid(String skuid) {
		this.skuid = skuid;
	}

}