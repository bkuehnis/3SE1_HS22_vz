package uebung9.vzb.ch.zhaw.osmanmin;


public class Passenger implements Insasse {

	private String name;
	private boolean firstClass;

	public Passenger(String name, boolean firstClass) {
		this.name = name;
		this.firstClass = firstClass;
	}

	public String getName() {
		return name;
	}

	public boolean isFirstClass() {
		if (firstClass) {
			return firstClass = true;
		} else {
			return firstClass = false;
		}
	}

	public void print() {
		if (isFirstClass()) {
			System.out.println(getName() + ", First Class");
		} else {
			System.out.println(getName() + ", Economy");
		}
	}
}
