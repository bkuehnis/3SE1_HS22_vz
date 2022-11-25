package uebung9.vzb.ch.zhaw.weberm08;


public class Crew implements Insasse {

	private String name;
	private String position;
	
	public Crew(String name, String postition) {
		this.position = postition;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void print() {
		System.out.println(name + ", " + position);
	}
}
