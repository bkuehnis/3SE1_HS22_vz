package uebung9.vza.ch.zhaw.friesti1;


public class Crew implements Insasse {

	public String name;
	public String position;
	
	public Crew(String n, String p) {
		this.name = n;
		this.position = p;
	}
	
	public String getName() {
		return this.name;
	}

	public void print() {
		System.out.println(this.name + ", " + this.position);
	}
}
