package uebung8.vzb.ch.zhaw.jermaloi;

public class Passenger implements Insasse{

    private String name;
    private boolean firstClass;

    public Passenger(String name, boolean firstClass) {
        this.name = name;
        this.firstClass = firstClass;
    }

    public boolean isFirstClass() {
        return firstClass;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        String economyOrFirst = firstClass ? "First Class" : "Economy";
        System.out.println(name + ", " + economyOrFirst);
    }
}
