/*
package uebung9.vzb.ch.zhaw.bosluc01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FlightTest {

	@Test
	public void testGetFlightNumber() {
		Flight flight = new Flight("LH123");
		assertEquals("LH123", flight.getFlightNumber());
	}

	@Test
	public void testGetInsasse() {
		Flight flight = new Flight("LH123");
		flight.addInsasse("1", new Passenger("Hans", true));
		flight.addInsasse("2", new Passenger("Peter", false));
		flight.addInsasse("3", new Crew("Hans", "Pilot"));
		flight.addInsasse("4", new Crew("Peter", "Steward"));
		assertEquals("Hans", flight.getInsasse("1").getName());
		assertEquals("Peter", flight.getInsasse("2").getName());
		assertEquals("Hans", flight.getInsasse("3").getName());
		assertEquals("Peter", flight.getInsasse("4").getName());
	}

	@Test
	public void testHasInsasse() {
		Flight flight = new Flight("LH123");
		flight.addInsasse("1", new Passenger("Hans", true));
		flight.addInsasse("2", new Passenger("Peter", false));
		flight.addInsasse("3", new Crew("Hans", "Pilot"));
		flight.addInsasse("4", new Crew("Peter", "Steward"));
		assertTrue(flight.hasInsasse("1"));
		assertTrue(flight.hasInsasse("2"));
		assertTrue(flight.hasInsasse("3"));
		assertTrue(flight.hasInsasse("4"));
		assertFalse(flight.hasInsasse("5"));
	}

}
*/