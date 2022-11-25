package uebung9.vzb.ch.zhaw.strubili;


public class Passenger implements Insasse {
	
	private String name;
	private boolean firstClass;
	
	public Passenger (String name, boolean firstClass) {
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
		String Klasse = "";
		if (isFirstClass()) {
			Klasse = String.valueOf(firstClass);
			Klasse = "First Class";
		} else {
			Klasse = String.valueOf(firstClass);
			Klasse = "Economy";
		}
		System.out.println(getName()+", "+Klasse);
	}
}
