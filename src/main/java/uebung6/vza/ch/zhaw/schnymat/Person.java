package uebung6.vza.ch.zhaw.schnymat;

public class Person {
    private String name;
    private String haarfarbe;
    private boolean kurzeHaare;
    private String augenfarbe;

    public Person(String name, String haarfarbe, boolean kurzeHaare, String augenfarbe){
        this.name =  name;
        this.haarfarbe = haarfarbe;
        this.kurzeHaare = kurzeHaare;
        this.augenfarbe = augenfarbe;
    }

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

    public void printPerson(){
        if (this.kurzeHaare) {
            System.out.println(this.name + " hat kurze " + this.haarfarbe + "e Haare und " + this.augenfarbe + "e Augen.");
        } else {
            System.out.println(this.name + " hat lange " + this.haarfarbe + "e Haare und " + this.augenfarbe + "e Augen.");
        }
    }

    public boolean stimmtHaarfarbe(String haarfarbe){
        if (this.haarfarbe.equals(haarfarbe)) {
            return true;
        } else {
            return false;
        }
    }

    public void schneideHaare(){
        if (this.isKurzeHaare()) {
            System.out.println(this.name + "s Haare sind bereits kurz!");
        } else {
            this.kurzeHaare = true;
            System.out.println(this.name + "s Haare wurden gescnitten!");
        }
    }
}
