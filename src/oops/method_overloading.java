package oops;
import java.util.*;
// in method overloading either :-
//  1:  this is must that the function/methods name should be same
//  2:  either the number of given parameters in the methods should be different
//  3:  or if the parameters are also same then the data type of the methods should be different
class Overloading{
//    method sum
    int  sum(int x , int y)
    {
        return (x+y);
    }
//    same method name but different number of parameter

    int sum(int x , int y , int z)
    {
        return (x+y+z);
    }
//   same method name and the number of parameter are also same but the data type  is different;
    String sum(String x , String y )
    {
        return  (x+y);
    }


}
public class method_overloading {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter first integer");
        int x = sc.nextInt();
        System.out.println("enter second integer:");
        int y = sc.nextInt();
        System.out.println("enter third integer");
        int z = sc.nextInt();
        sc.nextLine();
        System.out.println("enter first string");
        String a = sc.nextLine();
        System.out.println("enter second string");
        String b  = sc.nextLine();

//         declaring the object of the class overloading;
        Overloading s = new Overloading();


        System.out.println("calling the two parameter method:- " + (s.sum(x,y)));
        System.out.println("calling the three parameter method:- " + ( s.sum(x,y,z)));
        System.out.println("calling the two parameter method but different data type i.e String :- " + (s.sum(a,b)));


    }
}
