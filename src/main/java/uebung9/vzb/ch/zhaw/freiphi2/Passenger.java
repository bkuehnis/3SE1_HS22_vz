package uebung9.vzb.ch.zhaw.freiphi2;

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
		if (firstClass = true) {
			System.out.println("Economy Class");
		}
		if (firstClass = false) {
			System.out.println("Economy");
		}
		return false || true;
		
		
	}

	public void print() {
		System.out.println(name + ", " + isFirstClass());
	}

}