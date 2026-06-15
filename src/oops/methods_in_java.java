
package oops;
import java.util.*;
class Dog{
    String name;


    public void breed (){
        System.out.println(name + "kutta hai");
    }
}


public class methods_in_java {
    public static void main(String args[])
    {
        Dog d1 = new Dog();
        d1.name = "german sheford";
        d1.breed();
    }
}
//the functions inside the class are known as methods in java