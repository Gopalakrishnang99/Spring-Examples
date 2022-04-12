package data;

public class Water {
	
	private Oxygen oxy;
	private Hydrogen hyd;
	
	public Water(Oxygen oxy, Hydrogen hyd) {
		this.oxy=oxy;
		this.hyd=hyd;
	}
	
	public String toString() {
		return "Water with "+oxy+" "+hyd;
	}
}
