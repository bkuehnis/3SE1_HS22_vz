package uebung9.vza.ch.zhaw.reichraf;


public class Crew implements Insasse {

	String name;
	String position;
	public Crew(String name, String position) {
		this.name =name;
		this.position = position;
	}
	
	public String getName() {
		return name;
	}
	public String getPosition() {
		return position;
	}

	public void print() {
		System.out.println(getName() + ", " + this.position);
	}
}
