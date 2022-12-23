package uebung13.vza.ch.zhaw.zejnutri;


public class Joke {
	private String category;
	private String type;
	private String joke;
	private String setup;
	private String delivery;

	public Joke(String category, String type, String joke, String setup, String delivery) {
		this.category = category;
		this.type = type;
		this.joke = joke;
		this.setup = setup;
		this.delivery = delivery;
	}

	public String getCategory() {
		return category;
	}

	public String getType() {
		return type;
	}

	public String getJoke() {
		return joke;
	}

	public String getSetup() {
		return setup;
	}

	public String getDelivery() {
		return delivery;
	}
}
