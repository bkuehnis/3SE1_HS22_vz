package uebung9.vza.ch.zhaw.doenmhac;


public class Passenger implements Insasse{

	private String name;
	private boolean firstClass;
	
	public Passenger(String name, boolean firstClass) {
		this.name = name;
		this.firstClass = firstClass;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean isFirstClass() {
		return this.firstClass;
	}
	
	public void print() {
		String klasse = "";
		if (this.firstClass == true){
			klasse = "First Class";
		} else {
				klasse = "Economy";
	}
		System.out.println(this.name + ", "+klasse);
	}

}
