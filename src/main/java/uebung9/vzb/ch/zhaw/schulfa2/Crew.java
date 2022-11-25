package uebung9.vzb.ch.zhaw.schulfa2;


public class Crew implements Insasse {
	
	private String name;
	private String position;

	public Crew(String name, String postition) {
		this.name = name;
		this.position = postition;
	}
	
	public String getName() {
		return this.name;
	}

	public void print() {
		System.out.println(this.name + ", " + this.position);
	}
}
