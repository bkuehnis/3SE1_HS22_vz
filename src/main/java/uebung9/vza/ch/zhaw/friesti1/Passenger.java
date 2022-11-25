package uebung9.vza.ch.zhaw.friesti1;

public class Passenger implements Insasse {
	
	public String name;
	public boolean firstClass;
	
	public Passenger(String n, boolean fC) {
		this.name = n;
		this.firstClass = fC;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean isFirstClass() {
		return this.firstClass;
	}

	public void print() {
		System.out.println(this.name + ", " + (this.firstClass ? "First Class" : "Economy"));
	}
}
