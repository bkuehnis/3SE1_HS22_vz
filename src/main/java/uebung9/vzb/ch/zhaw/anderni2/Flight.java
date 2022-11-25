package uebung9.vzb.ch.zhaw.anderni2;

import java.sql.SQLOutput;
import java.util.HashMap;

public class Flight {
    private final String flightNumber;
    private final HashMap<String, Insasse> insassen = new HashMap<String, Insasse>();

    public Flight(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void addInsasse(String id, Insasse insasse) {
        insassen.put(id, insasse);
    }


    public Insasse getInsasse(String id) {

        if (insassen.containsKey(id)) {
            return insassen.get(id);
        }
        return null;
    }

    public boolean hasInsasse(String id) {
        return insassen.containsKey(id);
    }

public void printInsassen(){
        insassen.forEach((key, insasse) -> insasse.print());
}

public void printInsassenWithId(){
        insassen.forEach((key, insasse) ->  {
        System.out.print(key + ": ");
        insasse.print();
    });
}
}


