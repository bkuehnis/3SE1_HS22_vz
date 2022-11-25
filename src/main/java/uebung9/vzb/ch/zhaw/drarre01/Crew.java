package uebung9.vzb.ch.zhaw.drarre01;


public class Crew implements Insasse {
	
	public String name;
	public String position;

	public Crew(String name, String position) {
		this.name = name;
		this.position = position;
	}
	
	public String getName() {
		return this.name ;
	}
	
	public boolean isFirstClass() {
		return this.isFirstClass();
	}
	

	public void print() {
		System.out.println(this.name+ ", " + this.position);
	}
}
