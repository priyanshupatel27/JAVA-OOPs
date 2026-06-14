package oops;
import java.util.*;
interface Roti{
    public void amount();
    public void flour();
    public void water();
    public void dough();
}
class Aio implements Roti{
    public void amount(){
        System.out.println("choose the amount of the flour");
    }
    public void flour(){
        System.out.println("type of flour");
}
public void water(){
        System.out.println("amout of water");

    }
public void dough(){
        System.out.println("amout of dough");

    }

}



public class interfacejava {
public static void main(String args[]){
    Roti roti = new Aio();
    roti.amount();
    roti.flour();
    roti.water();
    roti.dough();

}
}
