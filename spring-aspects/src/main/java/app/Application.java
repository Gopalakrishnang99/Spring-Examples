package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.ProjectConfig;
import data.UserObject;
import service.ServiceClass;

public class Application {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class); 
		
		UserObject obj=new UserObject("John Doe");
		ServiceClass sc=context.getBean(ServiceClass.class);
		sc.saveUserObject(obj);
		sc.modifyUserObject("Hello");
		
		context.close();
	}

}
