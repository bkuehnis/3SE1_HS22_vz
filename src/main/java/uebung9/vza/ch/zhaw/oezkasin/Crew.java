package uebung9.vza.ch.zhaw.oezkasin;


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
		System.out.println(name+", "+position);
		
	}
}
