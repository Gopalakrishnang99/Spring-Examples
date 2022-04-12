package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.ProjectConfig;
import data.Element;
import data.ElementThree;

public class Application {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class); /* Creating the Spring context */
		
		/* Registering a bean in the context */
		context.registerBean("elementThree", Element.class,()->{
			ElementThree element=new ElementThree();
			element.setName("Using registerBean method of the context");
			return element;
		});
		
		System.out.println(context.getBean(Element.class)); /* Gets default bean for Element type */
		System.out.println(context.getBean("elementOne")); /* Gets the bean with name elementOne */
		
		Element element=context.getBean("elementTwo",Element.class); /* Gets the bean of type Element with name elementTwo */
		element.setName("Obtained from context using class name(@Component annotated)");
		System.out.println(element);
		
		System.out.println(context.getBean("elementThree")); /*Gets the bean we registered using registerBean method */
		
		context.close();
	}

}
