package data;

public class ElementOne implements Element{
	
	private String name;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return "ElementOne name : "+this.name;
	}
}
