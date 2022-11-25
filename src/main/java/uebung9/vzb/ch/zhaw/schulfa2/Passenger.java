package uebung9.vzb.ch.zhaw.schulfa2;


public class Passenger implements Insasse {

	private String name;
	private boolean firstClass;

	public Passenger(String name, boolean firstClass) {
		this.name = name;
		this.firstClass = firstClass;
	}

	@Override
	public String getName() {
		return this.name;
	}

	public boolean isFirstClass() {
        return this.firstClass;
	}

	@Override
	public void print() {
		String whichClass = (firstClass)? "First Class":"Economy";
		System.out.println(this.name + ", " + whichClass);

	}

}
