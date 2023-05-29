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
