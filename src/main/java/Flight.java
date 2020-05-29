import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destinationAirport;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destinationAirport, String departureAirport, String departureTime) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();
    }

    public int countPassengers() {
        return this.passengers.size();
    }



    public void addPassenger(Passenger passenger1) {
        this.passengers.add(passenger1);
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }

    public boolean checkAvailableSeat() {
        return (this.plane.getType().getCapacity() > this.countPassengers());
    }
}
