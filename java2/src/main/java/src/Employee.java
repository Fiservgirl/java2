import java.util.*;
public class Employee extends Person {
    static String firstName; 
    static String lastName; 
    static Byte age; 
    static Integer ssn;
    static Scanner scan =  new Scanner(System.in); 
Employee(String firstName, String lastName, byte age, Integer ssn){
super(firstName, firstName, age, ssn);
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.ssn = ssn;

}
public void setfirstname(){
    System.out.println("Enter first name");
    firstName = scan.nextLine();
}
public String getFirstName(){
    return firstName;
}
public void setLastName(){
    System.out.println("Enter last name");
    lastName = scan.nextLine();
}
public String getLastName(){
    return lastName;
}
public void setAge(){
    System.out.println("Enter age");
    age = scan.nextByte();
}
public byte getAge(){
    return age;
}
public void setSsn(){
    System.out.println("Enter social security number");
    ssn = Integer.parseInt(scan.nextLine());
}
public Integer getSsn(){
    return ssn;
}
public String Speak(){
    return "The data you need is " + " " +  getFirstName() + " " + getLastName() + " " + getAge();
}

public static void main(String[] args){
    Employee obj = new Employee(null, null , (byte) 0, 0);
    obj.setAge();
    obj.setfirstname();
    obj.setLastName();
    obj.setSsn();
    System.out.println(obj.Speak());
}
}
