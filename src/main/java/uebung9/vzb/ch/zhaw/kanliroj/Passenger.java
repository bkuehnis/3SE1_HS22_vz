package uebung9.vzb.ch.zhaw.kanliroj;


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
		return firstClass;
	}

	public void print() {
		if (firstClass) {
			System.out.println(name+", First Class");
		} else {
			System.out.println(name+", Economy");
		}
	}
}