package uebung11.vza.ch.zhaw.weberth6;

public class Hero {
	
	private String name;
	private String publisher;
	private String gender;
	private String alignment;
	private String hair;
	private String eye;
	private double height;
	private double weight;
	
	public String getName() {
		return name;
	}
	
	public String getPublisher() {
		return publisher;
	}

	public String getGender() {
		return gender;
	}

	public String getAlignment() {
		return alignment;
	}

	public String getHair() {
		return hair;
	}

	public String getEye() {
		return eye;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public void print() {
		System.out.println(name+": "+publisher+" (Gender: "+gender+", Alignment: "+alignment+
				", Hair: "+hair+", Eye: "+eye+", Height: "+height+", Weight: "+weight+")");
	}
}
