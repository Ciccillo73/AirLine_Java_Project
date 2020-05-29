public enum PlaneType {
    BOEING(300, 5000),
    CONCORDE(200, 3000),
    SUPPAJET(800,10000);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
