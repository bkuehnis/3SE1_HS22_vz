package uebung6.vzb.ch.zhaw.sprinala;

public class Person {
    private String name;
    private String haarfarbe;
    private boolean kurzeHaare;
    private String augenfarbe;


    public Person(String name, String haarfarbe, boolean kurzeHaare, String augenfarbe) {
        this.name = name;
        this.haarfarbe = haarfarbe;
        this.kurzeHaare = kurzeHaare;
        this.augenfarbe = augenfarbe;
    }

    //Print
    public void printPerson() {
        System.out.println(name + " hat kurze " + haarfarbe + "e Haare und " + augenfarbe + "e Augen.");
    }

    //Getter-Funktion
    public String getName() {
        return name;
    }

    public String getHaarfarbe() {
        return haarfarbe;
    }

    public boolean isKurzeHaare() {
        return kurzeHaare;
    }

    public String getAugenfarbe() {
        return augenfarbe;
    }

    //Stimmt die Haarfarbe?
    public boolean stimmtHaarfarbe(String haarfarbe) {
        return haarfarbe == getHaarfarbe();
    }

    //Haare geschnitten?
    public String schneideHaare() {
        if(kurzeHaare){
            return name+"s Haare sind bereits Kurz";
        } else{
            kurzeHaare = true;
            return name+"s Haare wurden geschnitten";
        }
    }
}


