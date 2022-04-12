package data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class WaterFieldInjection {
	
	@Autowired
	private Oxygen oxy;
	
	/*Spring will inject these dependencies while creating the bean 
	* The @Qualifier tells spring to inject bean with name hydrogenTwo */
	@Autowired
	@Qualifier("hydrogenTwo")
	private Hydrogen hyd;
	
	public String toString() {
		return "WaterFieldInjection with "+oxy+" "+hyd;
	}
	
}
