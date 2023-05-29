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

// Clase Main
public class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("Apple", "iPhone 12", 999.99, 6, 3000);
        System.out.println("SmartPhone:");
        phone.printDetails();

        System.out.println();

        SmartWatch watch = new SmartWatch("Samsung", "Galaxy Watch 3", 299.99, "Black", true);
        System.out.println("SmartWatch:");
        watch.printDetails();
    }
}
