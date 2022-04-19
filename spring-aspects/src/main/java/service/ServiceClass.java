package service;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import data.UserObject;

@Service
public class ServiceClass {
	
	private Logger logger=Logger.getLogger(ServiceClass.class.getName());
	
	public void saveUserObject(UserObject obj) {
		logger.info("Saving "+obj);
	}
	
	public String modifyUserObject(String s) {
		logger.info("Inside modifyUserObject with parameter "+s);
		return "TRUE";
	}

}
