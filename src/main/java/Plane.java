import java.util.ArrayList;

public class Plane {

    private PlaneModel type;
    private String airline;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneModel type, String airline){
        this.type = type;
        this.airline = airline;
    }

}
