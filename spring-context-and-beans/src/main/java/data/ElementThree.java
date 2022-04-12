package data;

public class ElementThree implements Element {
	
	private String name;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return "ElementThree name : "+this.name;
	}

}
