package uebung9.vza.ch.zhaw.reichraf;


public class Passenger implements Insasse{
	String name;
	boolean firstClass;
	
	public Passenger(String name, boolean firstClass)	{
		this.name = name;
		this.firstClass = firstClass;
	}
	
	public String getName(){
		return name;
	}
	public boolean isFirstClass() {
		return firstClass;
	}
	
	public void print() {
		String a= "";
		if (firstClass) {
			a= "First Class";
		} else {
			a= "Economy";
		}
		
		System.out.println(getName() + ", " + a);
	}
	

}
