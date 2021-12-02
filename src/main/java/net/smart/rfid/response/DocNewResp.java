package net.smart.rfid.response;

public class DocNewResp {
	private String id_server;

	private String message;
	
	private Integer document_id;

	public String getId_server() {
		return id_server;
	}

	public void setId_server(String id_server) {
		this.id_server = id_server;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getDocument_id() {
		return document_id;
	}

	public void setDocument_id(Integer document_id) {
		this.document_id = document_id;
	}
	
	

}
