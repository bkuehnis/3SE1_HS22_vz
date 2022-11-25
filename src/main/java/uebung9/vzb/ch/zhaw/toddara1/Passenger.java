package uebung9.vzb.ch.zhaw.toddara1;


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
		/*if(firstClass) {
			return true;
		} else {
			return false;
			
		} */
		return firstClass; //schnellere Variante
		
	}
	
	public void print() {
		String passengerClass; //innerhalb Methoden ohne private/ public
	
		if(firstClass /*== true*/) {
			passengerClass = "First Class";
		} else { 
			passengerClass = "Economy";
		}
		System.out.println(name + ", " + passengerClass);
	}
}
