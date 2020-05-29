public class Passenger {
    private String name;
    private int numberOfBags;
    private int seatNumber;
//    private Flight flight;

    public Passenger(String name, int numberOfBags) {
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.seatNumber = seatNumber;
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
}
