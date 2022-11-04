package uebung6.vzb.ch.zhaw.mulahham;

public class Person {
    private String name;
    private String haarfarbe;
    private boolean kurzeHaare;
    private String augenfarbe;

    public Person(String name, String haarfarbe, boolean kurzeHaare, String augenfarbe){
        this.name = name;
        this.haarfarbe = haarfarbe;
        this.kurzeHaare = kurzeHaare;
        this.augenfarbe = augenfarbe;
    }

    public String getName(){
        return name;
    }

    public String getHaarfarbe(){
        return haarfarbe;
    }

    public boolean istKurzeHaare(){
        return kurzeHaare;
    }

    public String getAugenfarbe(){
        return augenfarbe;
    }

    public void printPerson(){
        if (kurzeHaare){
            System.out.println(name + " hat kurze " + haarfarbe + "e Haare und " + augenfarbe + "e Augen.");
        }
        else {
            System.out.println(name + " hat lange " + haarfarbe + "e Haare und " + augenfarbe + "e Augen.");
        }
    }

    public boolean stimmtHaarfarbe(String haarfarbe){
        if (this.haarfarbe.equals(haarfarbe)){
            return true;
        }
        else{
            return false;
        }
    }

    public String schneideHaare(){
        if (kurzeHaare){
            return name + "s Haare sind bereits kurz.";
        }
        else {
            kurzeHaare = true;
            return name + "s Haare wurden geschnitten.";
        }

    }
}
