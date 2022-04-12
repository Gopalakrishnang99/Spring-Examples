package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.ProjectConfig;
import data.Water;

public class Application {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class); 
		
		System.out.println(context.getBean("waterFieldInjection"));
		System.out.println(context.getBean(Water.class));
		System.out.println(context.getBean("waterConstructorInjection"));
		System.out.println(context.getBean("waterSetterInjection"));
		
		context.close();
	}

}
