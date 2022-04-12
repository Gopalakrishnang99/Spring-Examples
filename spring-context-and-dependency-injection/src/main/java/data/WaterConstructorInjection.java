package data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class WaterConstructorInjection {
	
	private final Oxygen oxy;
	private final Hydrogen hyd;
	
	/*Spring will inject these dependencies while creating the bean 
	* The @Qualifier tells spring to inject bean with name hydrogenTwo */
	@Autowired 
	public WaterConstructorInjection(Oxygen oxy, @Qualifier("hydrogenTwo") Hydrogen hyd) {
		this.oxy=oxy;
		this.hyd=hyd;
	}
	
	public String toString() {
		return "WaterConstructorInjection with "+oxy+" "+hyd;
	}

}
