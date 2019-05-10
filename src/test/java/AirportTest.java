import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Flight flight;
    Plane plane;
    Airport airport;
    Passenger passenger;
    Ticket ticket;

    @Before
    public void before(){
        plane = new Plane(PlaneModel.AIRBUS310, "EasyJet");
        flight = new Flight(plane,4563, "Malaga");
        airport = new Airport("EDI");
        passenger = new Passenger();
    }

    @Test
    public void canAddFlight(){
        assertEquals(0, airport.flightCount());
        airport.addFlight(flight);
        assertEquals(1, airport.flightCount());
    }

    @Test
    public void canAddPlaneToHanger(){
        assertEquals(0, airport.hangerCount());
        airport.addPlaneToHanger(plane);
        assertEquals(1, airport.hangerCount());
    }

    @Test
    public void canAddTickets(){
        airport.addTicket(ticket);
        airport.addTicket(ticket);
        airport.addTicket(ticket);
        airport.addTicket(ticket);
        assertEquals(4, airport.numOfTickets());
    }

    @Test
    public void canSellTickets(){
        airport.addTicket(ticket);
        airport.addTicket(ticket);
        airport.sellTicket();
        assertEquals(1, airport.numOfTickets());
    }
}
