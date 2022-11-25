package uebung9.vzb.ch.zhaw.reiflja1;


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
		String flightclass = "Economy";
		if(isFirstClass()) {
			flightclass = "First Class";
		}
		System.out.println(name + ", " + flightclass);
	}
}
