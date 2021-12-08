package net.smart.rfid.db.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * Quest' 0ggetto serve solo alla creazione del repository products
 * 
 */
@Entity
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
    private String id;
	
	
	

}