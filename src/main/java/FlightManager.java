public class FlightManager {
    private  Flight flight;

    public FlightManager(Flight flight){
        this.flight = flight;
    }

    public double allowedBaggageWeigth(){
        double baggageWeightPassenger = (this.flight.getPlane().getType().getTotalWeight() / 2 ) / (double) this.flight.getPlane().getType().getCapacity();
        return baggageWeightPassenger;
    }

    public double totalBagggageWeigth() {
        double total = 0.00;
        for(Passenger passenger: this.flight.getPassengers()){
            total += passenger.getNumberOfBags() * this.allowedBaggageWeigth() ;
        }
        return total;
    }

}
