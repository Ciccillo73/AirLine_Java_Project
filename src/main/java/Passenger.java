public class Passenger {
    private String name;
    private int numberOfBags;
    private int seatNumber;
    private Flight flight;

    public Passenger(String name, int numberOfBags) {
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.seatNumber = seatNumber;
        this.flight = flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String getName() {
        return this.name;
    }

    public boolean hasFlight() {
        return this.flight != null;
    }
}
