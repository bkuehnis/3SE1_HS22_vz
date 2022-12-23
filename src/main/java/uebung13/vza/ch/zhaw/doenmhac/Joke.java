package uebung13.vza.ch.zhaw.doenmhac;


import com.google.gson.annotations.SerializedName;

public class Joke {
	private String category;
	private String type;
	private String joke;
	private String setup;
	private String delivery;
	private int id;
	
	
	public Joke(String category, String type, String Joke, String setup, String delivery, int id) {
		this.category = category;
		this.type = type;
		this.joke = joke;
		this.setup = setup;
		this.delivery = delivery;
		this.id = id;
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

	public int getId() {
		return id;
	}
	

}
