package uebung13.vza.ch.zhaw.friesti1;

import com.google.gson.annotations.SerializedName;

public class Joke {
	@SerializedName("category")
	private String category;
	@SerializedName("setup")
	private String setup;
	@SerializedName("delivery")
	private String delivery;
	@SerializedName("joke")
	private String joke;
	@SerializedName("type")
	private String type;
	
	public Joke(String category, String type, String setup, String delivery, String joke) {
		this.category = category;
		this.type = type;
		if(type.equals("twopart")) {
			this.setup = setup;
			this.delivery = delivery;
		}
		else {
			this.joke = joke;
		}
	}

	public String getCategory() {
		return category;
	}

	public String getSetup() {
		return setup;
	}
	
	public String getDelivery() {
		return delivery;
	}
	
	public String getJoke() {
		return joke;
	}
	
	public String getType() {
		return type;
	}
}
