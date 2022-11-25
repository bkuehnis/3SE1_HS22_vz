/*
package uebung9.vzb.ch.zhaw.kanliroj;

import static org.junit.jupiter.api.Assertions.*;
// weshalb gibt der import(bzw. die imports einen fehler?

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FlightTest {
	
	public Flight f1;
	Insasse in1, in2, in6, in7;

	//@BeforeEach
	void setUp() throws Exception {
		f1 = new Flight("LX 735");
		in1 = new Passenger("Sutter", false);
		in2 = new Passenger("Frey", true);
		in6 = new Crew("Burger", "Co-Pilot");
		in7 = new Crew("Bieri", "Cabin Crew");
		f1.addInsasse("CH1234",in1);
		f1.addInsasse("CH2345",in2);
		f1.addInsasse("M34567",in7);
		f1.addInsasse("M23456",in6);
	}

	//Test
	void testGetFlightNumber() {
		assertTrue(f1.getFlightNumber().equals("LX 735"));
	}
	
	//Test
	void testHasInsassen() {
		assertTrue(f1.hasInsasse("CH1234"));
		assertTrue(!f1.hasInsasse("CH2234"));
		assertTrue(f1.hasInsasse("M23456"));
		assertTrue(!f1.hasInsasse("M23457"));
	}

	//Test
	void testGetInsassen() {
		assertTrue(f1.getInsasse("CH1234") == in1);
		assertTrue(f1.getInsasse("CH2345") == in2);
		assertTrue(f1.getInsasse("M34567") == in7);
		assertTrue(f1.getInsasse("M23456") == in6);
		assertTrue(f1.getInsasse("M23457") == null);
	}
}
*/