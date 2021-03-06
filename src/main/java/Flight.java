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
        if(this.checkAvailableSeat() && !this.checkIfPassengerAlreadyInTheList(passenger1)){
            this.passengers.add(passenger1);
            Flight flight1 = new Flight(this.plane, this.flightNumber, this.destinationAirport, this.departureAirport, this.departureTime);
                    passenger1.setFlight(flight1);
        }

    }

    public Plane getPlane() {
        return plane;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }

    public boolean checkAvailableSeat() {
        return (this.plane.getType().getCapacity() > this.countPassengers());
    }


    public boolean checkIfPassengerAlreadyInTheList(Passenger passenger) {
        return this.passengers.contains(passenger);
    }
}
