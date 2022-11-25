package uebung9.vzb.ch.zhaw.mulahham;

public class Passenger implements Insasse {
    private String name;
    private boolean firstClass;

    public Passenger(String name, boolean firstClass){
        this.name = name;
        this.firstClass = firstClass;
    }

    public String getName(){
        return name;
    }

    public boolean isFirstClass(){
        return firstClass;
    }

    public void print(){
        System.out.println(name + ", " + (firstClass ? "First Class" : "Economy"));
    }
}
