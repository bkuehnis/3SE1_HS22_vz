package uebung9.vza.ch.zhaw.schnymat;


public class Crew implements Insasse {
	private String name;
	private String position;

	public Crew(String name, String postition) {
		this.name = name;
		this.position = postition;
	}
	
	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public void print() {
		System.out.println(name + ", " + position);
	}
}
