package oops;

import org.w3c.dom.ls.LSOutput;

class A1{
    void a(){
        System.out.println("method 1");
    }
}
class A2 extends A1{
    void b(){
        System.out.println("method 2");
    }
}
class A3 extends A1{
    void c(){
        System.out.println("method 3");
    }
}

class A21 extends A2{
    void a21(){
        System.out.println("method A21");
    }
}
class A22 extends A2{
    void a22(){
        System.out.println("method A22");
    }
}
class A31 extends A3{
    void a31(){
        System.out.println("method A31");
    }
}
class A32 extends  A3{
    void a32(){
        System.out.println("method A32");
    }
}
public class hierarichel_inheritance
{
    public static void main(String args[])
    {
        A21 obj1 = new A21();
        A31 obj2 = new A31();
        obj2.a31();
        obj1.a21();
    }
}
