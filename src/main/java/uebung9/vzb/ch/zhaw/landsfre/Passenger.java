package uebung9.vzb.ch.zhaw.landsfre;


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
		String klasse;
		if(firstClass) {
			klasse = "First Class";
		}else {
			klasse = "Economy";
		}
		System.out.println(name+", "+klasse);
	}
}
