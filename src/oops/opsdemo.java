package oops;

 class Student{
    final  String name = "alpha";    // final keyword use kar ke kisi bhi attributes ko fixed kar sakte hai

     int number;
     String address;

}
public class opsdemo{
     public static void main(String args [])
     {
         Student s = new Student();
//         s.name = "rahul";
         System.out.println(s.name);
//         s.name = "priyanshu";
         System.out.println(s.name);
         Student s2 = new Student();
//         s2.name = " sonu";
         System.out.println(s2.name);
     }
}

//  the data members present inside the class are called the attributes
//class ke andar jo kuch bhi likha hai usko uss class ka object bana ke hi access kiya jaa sakta hai
// static keyword :- we can access the method of the class without declaring the object and can make method

//class is basically the data type and the oject is the variable of the datatype
// the functions inside the class are known as methonds and the methods are object
