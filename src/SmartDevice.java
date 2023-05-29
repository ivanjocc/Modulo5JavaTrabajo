// Clase SmartDevice
public class SmartDevice {
    protected String brand;
    protected String model;
    protected double price;

    public SmartDevice() {}

    public SmartDevice(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void printDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}
