package uebung6.vzb.ch.zhaw.straueri;

public class WerIstEs {

   public static void main(String[] args) {
      Person p1 = new Person("Alex","schwarz",true,"braun");
      Person p2 = new Person("Alfred","rot",false,"blau");
      Person p3 = new Person("Anita","blond",false,"blau");
      Person p4 = new Person("Anne","schwarz",true,"braun");
      Person p5 = new Person("Maria","braun",false,"braun");
      Person p6 = new Person("Robert","braun",true,"blau");
      
      System.out.println(p1.getname()+" "+p1.gethaarFarbe()+" "+p1.getkurzeHaare()+" "+p1.getaugenfarbe());
      System.out.println(p2.getname()+" "+p2.gethaarFarbe()+" "+p2.getkurzeHaare()+" "+p2.getaugenfarbe());
      System.out.println(p3.getname()+" "+p3.gethaarFarbe()+" "+p3.getkurzeHaare()+" "+p3.getaugenfarbe());
      p4.printPerson();
      p5.printPerson();
      p6.printPerson();
   
   
   }
}