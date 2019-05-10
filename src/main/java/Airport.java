import java.util.ArrayList;

public class Airport {

    private ArrayList<Plane> hanger;
    private ArrayList<Flight> flights;
    private String airportCode;
    private ArrayList<Ticket> tickets;

    public Airport(String airportCode){
        this.airportCode = airportCode;
        this.tickets = new ArrayList<Ticket>();
        this.flights = new ArrayList<Flight>();
        this.hanger = new ArrayList<Plane>();
    }

    public int flightCount(){
        return flights.size();
    }

    public void addFlight(Flight flight){
        flights.add(flight);
    }

    public int hangerCount() {
        return hanger.size();
    }

    public void addPlaneToHanger(Plane plane){
        hanger.add(plane);
    }

    public int numOfTickets(){
        return tickets.size();
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void sellTicket() {
        tickets.remove(0);
    }
}
