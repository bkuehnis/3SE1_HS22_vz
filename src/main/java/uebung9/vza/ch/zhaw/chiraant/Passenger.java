package uebung9.vza.ch.zhaw.chiraant;


public class Passenger implements Insasse {
	private String name;
	private boolean firstClass;

	public Passenger(String name, boolean firstClass ) {
		this.name = name;
		this.firstClass = firstClass;
	}
	
	public String getName() {
		return name;
	}
	public boolean isFirstClass() {
		if (this.firstClass == true) {
			return true;
		}return false;
	}

	public void print() {
		if (isFirstClass()== true) {
			System.out.println(getName() + " First Class");
		}
			System.out.println(getName() + " Economy");
	}
}
