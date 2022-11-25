package uebung9.vza.ch.zhaw.drmicfil;


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
	
	public void print() {   //ufgab b)
		String fc = "First Class";
		if (firstClass) {
			fc = "Economy";
		}
		
		System.out.println(getName()+ ", " +fc);
	}
}
