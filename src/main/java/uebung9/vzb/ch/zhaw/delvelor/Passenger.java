package uebung9.vzb.ch.zhaw.delvelor;


public class Passenger implements Insasse {

	private String name;
	private boolean firstclass;

	public Passenger(String name, boolean firstclass) {

		this.name = name;
		this.firstclass = firstclass;

	}

	public String getName() {
		return name;

	}

	public boolean isFirstClass() {
			return firstclass;
		
	}

	public void print() {
		String Klasse;
		if (firstclass == true) {
			Klasse = "First Class";
			
		} else {
			Klasse = "Economy";
		}
		
		System.out.println(name + ", " + Klasse);

	}

}
