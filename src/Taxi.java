public class Taxi extends Car {
  private double fareCollected;

  public Taxi(String licensePlate, double tollFee, int passengers, boolean isElectric, double fareCollected) {
    super(licensePlate, tollFee, passengers, isElectric); // super refers to the Car constructor
    this.fareCollected = fareCollected;
  }



  public boolean chargeAndDropOffRiders(double farePerRider){
    int passagers = getPassengers() - 1;
    boolean lean = dropOffPassengers(passagers);
    if (lean){
      fareCollected += farePerRider * passagers;
    }
    return lean;
  }

  public double getFareCollected() {
    return fareCollected;
  }

  @Override
  public void printInfo(){
    super.printInfo();
    System.out.println("Discount Applied: " + isDiscountApplied());
    System.out.println("Fare Collected: " + fareCollected);
  }
}