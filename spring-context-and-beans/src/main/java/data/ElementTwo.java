package data;

import org.springframework.stereotype.Component;

@Component /* One of the stereotype annotations that tells Spring to add the instance as bean */
/* We can add @Primary to make this default */
public class ElementTwo implements Element {
	
	private String name;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return "ElementTwo name : "+this.name;
	}
}
