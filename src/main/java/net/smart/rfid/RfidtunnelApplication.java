package net.smart.rfid;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;




@SpringBootApplication
public class RfidtunnelApplication extends SpringBootServletInitializer {
	
	
	
	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(RfidtunnelApplication.class);
		SpringApplication.run(RfidtunnelApplication.class, args);
		logger.info("RfidtunnelApplication OK");
	}
	
}
