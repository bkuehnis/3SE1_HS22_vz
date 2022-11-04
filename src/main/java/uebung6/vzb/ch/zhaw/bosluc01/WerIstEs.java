package uebung6.vzb.ch.zhaw.bosluc01;

public class WerIstEs {

   public static void main(String[] args) {
      Person p1 = new Person("Alex","schwarz",true,"braun");
      Person p2 = new Person("Alfred","rot",false,"blau");
      Person p3 = new Person("Anita","blond",false,"blau");
      Person p4 = new Person("Anne","schwarz",true,"braun");
      Person p5 = new Person("Maria","braun",false,"braun");
      Person p6 = new Person("Robert","braun",true,"blau");
      
      System.out.println(p1.getName()+" Augen: "+p1.getAugenfarbe());
      System.out.println(p2.getName()+" Haarfarbe: "+p2.getHaarfarbe());
      System.out.println(p3.getName()+" kurze Haare: "+p3.isKurzeHaare());
      
      p4.printPerson();
      p5.printPerson();
      p6.printPerson();
      
      p1.printStimmtHaarfarbe("schwarz");
      p1.printStimmtHaarfarbe("blond");
      p2.printStimmtHaarfarbe("braun");
      p2.printStimmtHaarfarbe("rot");
      
      System.out.println(p1.schneideHaare());
      System.out.println(p2.schneideHaare());
      System.out.println(p2.schneideHaare());
   }
}