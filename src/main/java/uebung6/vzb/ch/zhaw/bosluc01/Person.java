package uebung6.vzb.ch.zhaw.bosluc01;

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

    public void printPerson() {
        System.out.println(name + " hat " + (kurzeHaare ? "kurze" : "lange") + " " + haarfarbe + "e Haare und " + augenfarbe + "e Augen.");
    }

    public boolean stimmtHaarfarbe(String haarfarbe) {
        return this.haarfarbe.equals(haarfarbe);
    }
    
    // Redundanz vermeiden:
    public void printStimmtHaarfarbe(String haarfarbe) {
    	System.out.println(this.getName() + " hat " + haarfarbe + "e Haare: " + this.stimmtHaarfarbe(haarfarbe));
    }
    
    public String schneideHaare() {
    	String namePossessive = this.getName() + (this.getName().endsWith("x") || this.getName().endsWith("s") ? "'" : "s");
    	if (this.kurzeHaare) {
    		return namePossessive + " Haare sind bereits kurz.";
    	} else {
    		this.kurzeHaare = true;
    		return namePossessive + " Haare wurden geschnitten.";
    	}
    }
}