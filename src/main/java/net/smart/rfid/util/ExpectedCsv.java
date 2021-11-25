package net.smart.rfid.util;

public class ExpectedCsv {

	public static final String[] ExpectedCsv = { "packageData", "tid", "epc", "sku" };
	private String packageData;
	private String tid;
	private String epc;
	private String sku;

	public String getPackageData() {
		return packageData;
	}

	public void setPackageData(String packageData) {
		this.packageData = packageData;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getEpc() {
		return epc;
	}

	public void setEpc(String epc) {
		this.epc = epc;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

}
