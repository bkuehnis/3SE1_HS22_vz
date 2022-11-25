package uebung9.vzb.ch.zhaw.weberm08;


public class Passenger implements Insasse{
	private String name;
	private boolean firstClass;
	
	
	public Passenger(String name, boolean firstClass) {
		this.name = name;
		this.firstClass = firstClass;
	}
	
	@Override
	public String getName() {
		return name;
	}

	public boolean isFirstClass() {
		return firstClass;
	}
	
	@Override
	public void print() {
		System.out.println(name + ", " + (isFirstClass() ? "First Class" : "Economy"));
	}

}
