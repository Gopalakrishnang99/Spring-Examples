package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import data.Element;
import data.ElementOne;

@Configuration /* Marks this class as a configuration class */
@ComponentScan("data")  /* Informs Spring where to find the stereotype annotated classes */
public class ProjectConfig {

	@Bean /* Creates a bean in the Spring context with the same name as the method name */
	public Element elementOne(){
		ElementOne element = new ElementOne();
		element.setName("Bean from configuration class");
		return element;
	}
	
	@Bean
	@Primary /* If more than one bean of a type is added, then we get this bean as the default for that type */
	public Element eOne() {
		ElementOne element=new ElementOne();
		element.setName("Bean set as primary from config class");
		return element;
	}
	
	
}
