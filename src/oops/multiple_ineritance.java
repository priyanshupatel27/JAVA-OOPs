package oops;
interface a {
    public void printt();
}
interface  b {
    public void printt();
}
class c implements a,b{
    @Override
    public void printt() {
        System.out.println("hello world");
    }
}
public class multiple_ineritance {
    public static void main(String args[])
    {
        c obj = new c();
        obj.printt();
    }
}
