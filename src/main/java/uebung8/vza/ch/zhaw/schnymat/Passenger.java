package uebung8.vza.ch.zhaw.schnymat;

public class Passenger implements Insasse {
    private String name;
    private boolean firstClass;

    public Passenger(String name, boolean firstClass) {
        this.name = name;
        this.firstClass = firstClass;
    }

    public boolean isFirstClass() {
        return firstClass;
    }

    public String getName() {
        return name;
    }

    public void print() {
        if (firstClass) {
            System.out.println(name + ", First Class");
        } else {
            System.out.println(name + ", Economy");
        }
    }
}
