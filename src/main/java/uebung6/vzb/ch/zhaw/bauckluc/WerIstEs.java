package uebung6.vzb.ch.zhaw.bauckluc;



public class WerIstEs {

   public static void main(String[] args) {
      Person p1 = new Person("Alex","schwarz",true,"braun");
      Person p2 = new Person("Alfred","rot",false,"blau");
      Person p3 = new Person("Anita","blond",false,"blau");
      Person p4 = new Person("Anne","schwarz",true,"braun");
      Person p5 = new Person("Maria","braun",false,"braun");
      Person p6 = new Person("Robert","braun",true,"blau");
      
      p1.printPerson();
      p2.printPerson();
      p3.printPerson(); 
      p4.printPerson();
      p5.printPerson();
      p6.printPerson();
      
      System.out.println("Alex hat schwarze Haare: "+p1.stimmtHaarfarbe("schwarz"));
      System.out.println("Alex hat schwarze Haare: "+p1.stimmtHaarfarbe("blond"));
      
      System.out.println(p1.schneideHaare());
      System.out.println(p2.schneideHaare());
   }
}