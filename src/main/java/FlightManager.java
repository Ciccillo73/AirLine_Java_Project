public class FlightManager {
    private  Flight flight;

    public FlightManager(Flight flight){
        this.flight = flight;
    }

    public double totalPlaneLuggageWeight(){
        double result = this.flight.getPlane().getType().getTotalWeight() / 2;
        return result;
    }

    public double allowedBaggageWeigth(){
        double baggageWeightPassenger = totalPlaneLuggageWeight() / (double) this.flight.getPlane().getType().getCapacity();
        return baggageWeightPassenger;
    }

    public double totalBaggageWeigth() {
        double total = 0.00;
        for(Passenger passenger: this.flight.getPassengers()){
            total += passenger.getNumberOfBags() * this.allowedBaggageWeigth() ;
        }
        return total;
    }


    public double leftBaggage() {
        double result = totalPlaneLuggageWeight() - totalBaggageWeigth();
        return result;
    }
}
