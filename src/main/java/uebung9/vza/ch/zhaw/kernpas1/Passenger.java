package uebung9.vza.ch.zhaw.kernpas1;


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
		String klasse = "Economy";
		if (firstClass) {
			klasse = "First Class";
		}
		System.out.println(name+", "+klasse);
	}

}
