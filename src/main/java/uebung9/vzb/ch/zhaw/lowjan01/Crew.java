package uebung9.vzb.ch.zhaw.lowjan01;


public class Crew implements Insasse {

	private String name;
	private String postition;

	public Crew(String name, String postition) {
		this.name = name;
		this.postition = postition;
	}

	public String getName() {
		return name;
	}

	public String getPostition() {
		return postition;
	}

	public void print() {

		System.out.println(getName()+", "+getPostition());
	}
	
	public void printPos() {

		System.out.println(getPostition());
	}

	@Override
	public boolean isFirstClass() {
		// TODO Auto-generated method stub
		return false;
	}

}
