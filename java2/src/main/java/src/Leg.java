public class Leg {
    private Integer length; 

    public Leg(Integer lenght){
        this.length = lenght;
    }
    public static void main(String[] args){
        Table myTable = new Table(4);
        System.out.println(myTable.getPrice());
    }
    
}
