import java.util.Scanner;

public class Truck extends Vehicle {
    private String make;
    private String model;
    private double price;

    public Truck(String make, String model, double price, int year) {
        super(make, model, price, year);
    }

    public void setMake() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter make of the car");
        make = scan.nextLine();
    }

    public String getMake() {
        return make;
    }

    public void setModel() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter model of the car");
        model = scan.nextLine();
    }

    public String getModel() {
        return model;
    }

    public void setPrice() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price of the car");
        price = scan.nextDouble();
    }

    public double getPrice() {
        return price;
    }

    public void StartEngine() {
        System.out.println("rum rum");
    }

    public static void main(String[] args) {
        Car obj = new Car(null, null, 0, 0);
        obj.StartEngine();
        obj.setMake();
        obj.setModel();
        obj.setPrice();
        System.out.println("The details of the car are: " + obj.getMake() + " " + obj.getModel() + " " + obj.getPrice());
    }
}
