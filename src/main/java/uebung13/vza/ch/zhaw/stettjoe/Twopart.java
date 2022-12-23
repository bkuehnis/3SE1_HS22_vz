package uebung13.vza.ch.zhaw.stettjoe;


public class Twopart extends Witz {
	private String setup;
	private String delivery;
	
	public Twopart(String type, String category) {
		super(type, category);
		this.setup = setup;
		this.delivery = delivery;
	}
	
	public String getSetup() {
		return setup;
	}
	
	public String getDelivery() {
		return delivery;
	}
	
}
