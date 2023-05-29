// Clase SmartWatch
public class SmartWatch extends SmartDevice {
    private String strapColor;
    private boolean hasHeartRateMonitor;

    public SmartWatch(String brand, String model, double price, String strapColor, boolean hasHeartRateMonitor) {
        super(brand, model, price);
        this.strapColor = strapColor;
        this.hasHeartRateMonitor = hasHeartRateMonitor;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Strap Color: " + strapColor);
        System.out.println("Has Heart Rate Monitor: " + hasHeartRateMonitor);
    }
}
