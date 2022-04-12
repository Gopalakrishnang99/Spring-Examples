package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import data.Hydrogen;
import data.Oxygen;
import data.Water;

@Configuration
@ComponentScan("data")
public class ProjectConfig {

	@Bean /*Creating a hydrogen bean here so we have more than one bean of Hydrogen*/
	public Hydrogen hydrogenTwo() {
		Hydrogen hyd=new Hydrogen();
		hyd.setName("Hydrogen-Two");
		return hyd;
	}
	
	/*Here, Spring injects the values in the constructor parameters while creating the bean*/
	@Bean
	public Water water(Oxygen oxy, Hydrogen hyd) {
		return new Water(oxy,hyd);
	}
	
}
