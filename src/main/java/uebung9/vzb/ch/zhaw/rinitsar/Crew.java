package uebung9.vzb.ch.zhaw.rinitsar;

//a)
public class Crew implements Insasse {
	private String name;
	private String position;

	public Crew(String name, String position) {
		this.name = name;
		this.position = position;
	}
	
	public String getName() {
		return name;
	}

	public void print() {
		System.out.println(name + ", " + position);
		
	}
}
