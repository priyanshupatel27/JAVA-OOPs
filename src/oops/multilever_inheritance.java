package oops;
class A{
    void classA(){
        System.out.println("this is the class A");
    }
}
class B extends  A{
    void classB(){
        System.out.println("this is the class B");
    }
}
class C extends  B{
    void classC(){
        System.out.println("this is the class c");
    }

}
public class multilever_inheritance {
    public static void main(String args[])
    {
        C obj = new C();
        obj.classC();
        obj.classB();
        obj.classA();
    }
}

// why multi level inheritance is not supported in java ?
//        ANSWER:-    java doesnot support multiple inheritance through classes to avoid ambiguity and the Diamond Problem.
//        If two parent classes contain methods with the same name , the compiler cannot determine which method should be inherited.
//        To achieve multiple inheritance safely, Java uses interfaces