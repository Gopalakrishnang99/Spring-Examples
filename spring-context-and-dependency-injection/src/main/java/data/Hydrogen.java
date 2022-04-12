package data;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary /* This instance will be used if no qualifier is mentioned since another Hydrogen bean is created in config class */
public class Hydrogen implements Element {
	
	private String name;
	
	public Hydrogen() {
		this.name="Hydrogen-One";
	}

	@Override
	public void setName(String s) {
		this.name=s;
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return "Hydrogen - "+name;
	}

}
