import java.util.*;

public abstract class Vehicle {
protected String Make; 
protected String Model; 
protected double price; 
protected int year;
Scanner scan = new Scanner (System.in); 

public Vehicle(String Make, String Model, double price, int year){
    this.Make = Make; 
    this.Model = Model; 
    this.price = price; 
    this.year = year; 
}


public abstract void StartEngine();


}
