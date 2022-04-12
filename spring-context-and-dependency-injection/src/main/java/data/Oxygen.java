package data;

import org.springframework.stereotype.Component;

@Component
public class Oxygen implements Element {
	
	private String name;
	
	public Oxygen() {
		this.name="Oxygen-One";
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
		return "Oxygen - "+name;
	}

}
