package oops;

class Vehicle {
    String name;
    int price;
    String Category;
    void display(){
        System.out.println(name);
        System.out.println(Category);
        System.out.println(price);
    }
}
class Car extends Vehicle{
    boolean sunroof;
    String colour;
    void fun(){
        System.out.println(sunroof);
        System.out.println(colour);
    }
}

public class  inheritance{
    public static void main(String args[])
    {
        Car car1 = new Car();
        car1.sunroof = true;
        car1.colour = "blue";
                car1.name = "lamborgini";
        car1.Category="suv";

        car1.display();
        System.out.println();
        car1.fun();
    }
}








//yaha pe ye parent and child class hota hai
//when a child class inherit the property of the parent class then it is known as inheritance

//in other words , inheritance is the mechanism of building a new class on the existing functionality of super class.
// uses :- method overriding , reusability of the code and reduce the duplication
