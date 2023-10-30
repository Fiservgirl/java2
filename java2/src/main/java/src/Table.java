import java.util.ArrayList;
import java.util.Scanner;

public class Table implements Billable {

    private Integer width = 20; 
    private Integer lenght = 10; 
    Scanner scan = new Scanner(System.in); 
    float m = scan.nextFloat();
    float x = scan.nextFloat(); 
    private ArrayList<Leg>  legs = new ArrayList<>(); 

    public Table (Integer numLegs){
        for(int i = 0; i<numLegs; i++){
            legs.add(new Leg(25));
        }
    }

    public float getPrice(float x, float m){
        System.out.println("Please enter table dimensions"); 
        float total = x*m; 
        return  total;
    }

    @Override
    public float getPrice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPrice'");
    }

   
   
}
