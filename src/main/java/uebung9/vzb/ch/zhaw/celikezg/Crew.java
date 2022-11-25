package uebung9.vzb.ch.zhaw.celikezg;


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
		System.out.println(name+", "+position);
	}
}
