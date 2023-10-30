public class Cat {
    private String name;

    public Cat(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return "This is: " + name;
    }

    public static void main(String[] args){
        Cat myCat = new Cat("Kitty");
        System.out.println(myCat.toString());
    }
}
