package uebung13.vza.ch.zhaw.chiraant;



	public class Joke<T> {
	    private final String category;
	    private final String type;
	    private final String setup;
	    private final String delivery;
	    private final String joke;

	    public Joke(String category, String type, String joke, String setup, String delivery) {
	        this.category = category;
	        this.type = type;
	        this.joke = joke;
	        this.setup = setup;
	        this.delivery = delivery;
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

