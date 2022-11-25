package uebung9.vzb.ch.zhaw.lowjan01;


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

	public void print() {

		if (isFirstClass()) {
			System.out.println(getName()+", First Class");
		} else {
			System.out.println(getName()+", Ecomony");
		}
	}

	public boolean isFirstClass() {
		return firstClass;
	}
	
	public void print1() {

		if (isFirstClass()) {
			System.out.println(getName()+", First Class");
		} else {
			System.out.println(getName()+", Ecomony");
		}
	}

	@Override
	public String getPostition() {
		// TODO Auto-generated method stub
		return null;
	}

}
