package uebung9.vza.ch.zhaw.eglofpau;


public class Crew implements Insasse {
	private String name;
	private String position;

	public Crew(String name, String position) {
		this.name= name;
		this.position = position;
		
	}
	
	public String getName() {
		return name;
	}
	public String getPosition() {
		return position;
	}
	
	
	public void print() {
		System.out.println(getName()+", "+getPosition());
	}
}
