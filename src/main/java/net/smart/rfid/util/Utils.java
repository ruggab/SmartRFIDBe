package net.smart.rfid.util;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.impinj.octane.AutoStartMode;
import com.impinj.octane.AutoStopMode;
import com.impinj.octane.GpoMode;
import com.impinj.octane.OctaneSdkException;
import com.impinj.octane.SearchMode;


public class Utils {
	
	public static final String MISSING_EXPECTED = "E-MISSING-EXPECTED";
	public static final String MISSING_PACKAGE = "E-MISSING-PACKAGE";
	public static final String MORE_PACKAGE = "E-MORE-PACKAGE";
	public static final String TAG_NO_READ = "E-TAG-NO-READ";
	public static final String OK = "OK";
	public static final String KO = "KO";
	public static final String EPC = "EPC";
	public static final String TID = "TID";
	public static final String SKU = "SKU";
	public static final String QTY = "QTY";
	public static final String TAG_ERR = "E-";

	
	
	
	

	
	
	

	public static void main(String[] args) {
		//String ret = fromHexToInt("E2801170200013FB54BD08ED");
		//System.out.println(ret);
		
		//String aa = getSerialFromMask2("FFFA-----","FFFBA12345");
		
		//System.out.println(aa);
		
		
		//http://localhost:8080/api/v1/callWMSIn
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/api/v1/callWMSIn");
		String response = target.request(MediaType.APPLICATION_JSON).post(Entity.json("ffff"), String.class);
		
		System.out.println(response);
		  
	}
	//XXXXX----XXXX sostituisce i ----- con i valori corrispondenti
	public static String getSerialFromMask(String mask, String epc) {
		char splitter = 'X';
		char[] maskArr = mask.toCharArray();
		char[] textArr = epc.toCharArray();
		int textI = 0;
		for (int i = 0; i < maskArr.length; i++) {
			if (maskArr[i] != splitter) {

				if (maskArr[i] == '-' && textI < textArr.length) {
					maskArr[i] = textArr[textI];
				}
				textI++;
			}
		}
		String str = String. valueOf(maskArr);
		String ret = str.replace("X", "");
		return ret;
	}
	
	//XXXXX----XXXX se la string contiene i valori corrispondenti a X restituisce quelli corrispondenti ai ----
	public static String getSerialFromMask2(String mask, String epc) {
		char splitter = '-';
		char[] maskArr = mask.toCharArray();
		char[] epcArr = epc.toCharArray();
		String barcode = "";
		for (int i = 0; i < maskArr.length; i++) {
			if (maskArr[i] == splitter ||  maskArr[i] == epcArr[i]) {
				if (maskArr[i] == '-') {
					barcode = barcode + epcArr[i];
				}
			} else {
				return "";
			}
		}
		return barcode;
	}
	
	
	public static String removeSpaces(String st) {
		String ret = st.replaceAll("\\s+","");;
		return ret;
	}

}
