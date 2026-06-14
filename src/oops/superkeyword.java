package oops;

// To invoke the class variable
//class a1{
//
//        int so = 99;
//
//}
//class a2 extends a1{
//    int so = 89;
//    public void sonu(){
//
//        System.out.println(" using super keyword to print the parent class variable = " + super.so);
//        System.out.println("s2 class = "+ so);
//    }
//}
//public class superkeyword {
//    public static void main(String[] args){
//        a2 obj = new a2();
//        obj.sonu();
//    }
//}


// to invoke the parent class method;

//class bg {
//    public void method1() {
//        System.out.println("method 1");
//
//    }
//}
//    class gg extends bg {
//        public void method1() {
//            System.out.println("method2");
//        }
//
//        public void method2() {
//            System.out.println("method2");
//        }
//        public void method3() {
//            super.method1();
//            method2();
//        }
//    }
//public class superkeyword{
//    public static void main(String[] args){
//        gg obj = new gg();
//        obj.method3();
//    }
//}

//TO invoke the parent class constructor

//   class sonu{
//       void sonuu(){
//           System.out.println("hello world");
//       }
//       sonu(){
//           System.out.println("constructor 1");
//       }
//   }
//   class golu extends sonu{
//       golu(){
//           super();
//           System.out.println("this is second constructor");
//       }
//   }
//
//   public class superkeyword
//   {
//       public static void main(String args[])
//       {
//           golu obj = new golu();
//       }
//   }