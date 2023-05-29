// Clase SmartPhone
public class SmartPhone extends SmartDevice {
    private int screenSize;
    private int batteryCapacity;

    public SmartPhone(String brand, String model, double price, int screenSize, int batteryCapacity) {
        super(brand, model, price);
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Battery Capacity: " + batteryCapacity + " mAh");
    }
}
