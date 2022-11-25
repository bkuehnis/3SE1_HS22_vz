package uebung9.vzb.ch.zhaw.drarre01;


public class Passenger implements Insasse {
	
	public String name;
	public boolean firstClass;
	
	public Passenger(String name, boolean firstClass) {
		this.name = name;
		this.firstClass = firstClass;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean isFirstClass() {
		return this.firstClass;
	}
	
	public void print() {
		if (this.firstClass) {
		System.out.println(this.name + ", First Class");
		}
		else {
			System.out.println(this.name + "; Economy");
		}
	}

}
