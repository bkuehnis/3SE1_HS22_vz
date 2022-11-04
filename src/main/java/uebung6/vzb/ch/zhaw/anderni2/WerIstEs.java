package uebung6.vzb.ch.zhaw.anderni2;

public class WerIstEs {
 public static void main(String[] args) {
  Person p1 = new Person("Alex", "schwarz", true, "braun");
  Person p2 = new Person("Alfred", "rot", false, "blau");
  Person p3 = new Person("Anita", "blond", false, "blau");
  Person p4 = new Person("Anne", "schwarz", true, "braun");
  Person p5 = new Person("Maria", "braun", false, "braun");
  Person p6 = new Person("Robert", "braun", true, "blau");

  System.out.println(p1.getName() + " Augen: " + p1.getAugenfarbe());
  System.out.println(p2.getName() + " Haarfarbe: " + p2.getAugenfarbe());
  System.out.println(p3.getName() + " kurze Haare: " + p3.getAugenfarbe());
  p4.printPerson();
  p5.printPerson();
  p6.printPerson();

// stimmt Haarfarbe
              System.out.println(p1.getName()+" hat schwarze Haare: "+ p1.stimmtHaarfarbe("schwarz"));
              System.out.println(p1.getName()+" hat blonde Haare: "+ p1.stimmtHaarfarbe("blond"));

// Haare kurz --> wie kann ich die Personen px über eine for-Schleife ansprechen?
 // for(int i = 0; i <= 6; i++){
 //  System.out.println(p1.schneideHaare());}


  System.out.println(p1.schneideHaare());
  System.out.println(p2.schneideHaare());
  System.out.println(p3.schneideHaare());
  System.out.println(p4.schneideHaare());
  System.out.println(p4.schneideHaare());
  System.out.println(p5.schneideHaare());
  System.out.println(p6.schneideHaare());
 }
}




