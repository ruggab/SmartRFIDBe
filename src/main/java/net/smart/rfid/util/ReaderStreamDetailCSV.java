package net.smart.rfid.util;

public class ReaderStreamDetailCSV {

	private String tunnel;
	private String packageData;
	private String tid;
	private String epc;
	private String sku;
	private String ipAdress;
	private String antennaPortNumber;
	private String firstSeenTime;
	private String lastSeenTime;
	private String tagSeenCount;
	private String rfDopplerFrequency;
	private String peakRssiInDbm;
	private String channelInMhz;
	private String phaseAngleInRadians;
	private String modelName;

	public String getPackageData() {
		return packageData;
	}

	public void setPackageData(String packageData) {
		this.packageData = packageData;
	}

	public String getTunnel() {
		return tunnel;
	}

	public void setTunnel(String tunnel) {
		this.tunnel = tunnel;
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

	public String getIpAdress() {
		return ipAdress;
	}

	public void setIpAdress(String ipAdress) {
		this.ipAdress = ipAdress;
	}

	public String getAntennaPortNumber() {
		return antennaPortNumber;
	}

	public void setAntennaPortNumber(String antennaPortNumber) {
		this.antennaPortNumber = antennaPortNumber;
	}

	public String getFirstSeenTime() {
		return firstSeenTime;
	}

	public void setFirstSeenTime(String firstSeenTime) {
		this.firstSeenTime = firstSeenTime;
	}

	public String getLastSeenTime() {
		return lastSeenTime;
	}

	public void setLastSeenTime(String lastSeenTime) {
		this.lastSeenTime = lastSeenTime;
	}

	public String getTagSeenCount() {
		return tagSeenCount;
	}

	public void setTagSeenCount(String tagSeenCount) {
		this.tagSeenCount = tagSeenCount;
	}

	public String getRfDopplerFrequency() {
		return rfDopplerFrequency;
	}

	public void setRfDopplerFrequency(String rfDopplerFrequency) {
		this.rfDopplerFrequency = rfDopplerFrequency;
	}

	public String getPeakRssiInDbm() {
		return peakRssiInDbm;
	}

	public void setPeakRssiInDbm(String peakRssiInDbm) {
		this.peakRssiInDbm = peakRssiInDbm;
	}

	public String getChannelInMhz() {
		return channelInMhz;
	}

	public void setChannelInMhz(String channelInMhz) {
		this.channelInMhz = channelInMhz;
	}

	public String getPhaseAngleInRadians() {
		return phaseAngleInRadians;
	}

	public void setPhaseAngleInRadians(String phaseAngleInRadians) {
		this.phaseAngleInRadians = phaseAngleInRadians;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

}
