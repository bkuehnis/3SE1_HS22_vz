package uebung9.vza.ch.zhaw.stettjoe;


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

	public void print() {
		System.out.println(name+", "+ position);
	}
}
