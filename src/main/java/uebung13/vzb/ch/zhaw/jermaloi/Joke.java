package uebung13.vzb.ch.zhaw.jermaloi;

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

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

}
