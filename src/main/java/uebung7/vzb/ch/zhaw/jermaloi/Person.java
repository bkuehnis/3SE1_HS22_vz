package uebung7.vzb.ch.zhaw.jermaloi;

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
        System.out.println(this.name +" Augen: "+ this.augenfarbe);
    }

    public boolean stimmtHaarfarbe(String haarfarbe){
        return this.haarfarbe.equalsIgnoreCase(haarfarbe);
    }

    public String schneideHaare(){
        if (kurzeHaare){
            return this.name + "s Haare sind bereits kurz.";
        } else {
            kurzeHaare = true;
            return this.name + "s Haare wurden geschnitten.";
        }
    }

    public String getMerkmaleAlsCsv(){
        String str = this.kurzeHaare ? "kurze" : "lange";
        str += String.format(" Haare,%se Haare,%se Augen",this.haarfarbe, this.augenfarbe);
        return str;
    }

}
