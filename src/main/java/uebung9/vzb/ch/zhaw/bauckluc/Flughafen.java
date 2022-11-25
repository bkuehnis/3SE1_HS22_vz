package uebung9.vzb.ch.zhaw.bauckluc;

public class Flughafen {

	public static void main(String[] args) {
		
		System.out.println("Test 1: Crew");
		Insasse in5 = new Crew("Oberholzer", "Captain");
		Insasse in6 = new Crew("Burger", "Co-Pilot");
		Insasse in7 = new Crew("Bieri", "Cabin Crew");
		System.out.println(in5.getName());
		in6.print();
		in7.print();
		
		// TODO: Tests auskommentieren wenn diese ben�tigt werden
		
		
		System.out.println("\nTest 2: Passenger");
		Insasse in1 = new Passenger("Sutter", false);
		Insasse in2 = new Passenger("Frey", true);
		Insasse in3 = new Passenger("B�rki", false);
		Insasse in4 = new Passenger("Meier", true);
		Passenger p1 = new Passenger("Sparer", false);
		Passenger p2 = new Passenger("Prahler", true);
		System.out.println(in1.getName());
		System.out.println(in2.getName());
		in3.print();
		in4.print();
		System.out.println(p1.isFirstClass());
		System.out.println(p2.isFirstClass());
		
		System.out.println("\nTest 3: Flight");
		Flight f1 = new Flight("LX 735");
		f1.addInsasse("CH1234",in1);
		f1.addInsasse("CH4567",in4);
		f1.addInsasse("CH2345",in2);
		f1.addInsasse("M12345",in5);
		f1.addInsasse("CH3456",in3);
		f1.addInsasse("M34567",in7);
		f1.addInsasse("M23456",in6);
		System.out.println(f1.getFlightNumber());
		System.out.println(f1.getInsasse("M23456").getName());
		System.out.println(f1.getInsasse("CH1234").getName());
		System.out.println(f1.getInsasse("CH2134"));
		
		System.out.println("\nTest 4: hasInsasse");
		System.out.println(f1.hasInsasse("CH1234"));
		System.out.println(f1.hasInsasse("CH2234"));
		System.out.println(f1.hasInsasse("M23456"));
		System.out.println(f1.hasInsasse("M23457"));
		
		System.out.println("\nTest 5: Alle");
		f1.printInsassen();
		
		System.out.println("\nTest 6: Alle mit ID");
		f1.printInsassenWithId();
	}
}
