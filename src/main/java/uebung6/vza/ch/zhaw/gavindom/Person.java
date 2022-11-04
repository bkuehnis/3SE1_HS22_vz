package uebung6.vza.ch.zhaw.gavindom;


public class Person {
	public String name;
	private int jahrgang;
	
	public Person (String name, int jahrgang) {
		this.name = name;
		this.jahrgang = jahrgang;			
	}
	
	public int getjahrgang() {
		return jahrgang;
	}
	
	public void print() {
	System.out.println(name+": "+jahrgang);


}
	
	public int getAlterImJahr(int jahr) {
		return jahr -jahrgang;
	}
}
