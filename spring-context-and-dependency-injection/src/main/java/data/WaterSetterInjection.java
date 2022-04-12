package data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class WaterSetterInjection {
	
	private Oxygen oxy;
	private Hydrogen hyd;
	
	/*Spring will inject these dependencies while creating the bean*/
	@Autowired
	public void setOxy(Oxygen oxy) {
		this.oxy=oxy;
	}
	
	/* The @Qualifier tells spring to inject bean with name hydrogenTwo */
	@Autowired
	@Qualifier("hydrogenTwo")
	public void setHyd(Hydrogen hyd) {
		this.hyd=hyd;
	}
	
	public String toString() {
		return "WaterSetterInjection with "+oxy+" "+hyd;
	}

}
