package package1;
public class Main {
    public static void main(String... args){
//        Human kunal = new Human(22, "kunal kushwaha " , 4888 , false);
//        Human rahul = new Human(55, "rahul" , 88848 , false);
//        Human padma= new Human(55, "padma" , 88848 , false);

//        System.out.println(kunal.name);
//        System.out.println(rahul.name);

//        System.out.println(Human.population);

//        this is not dependent on object
//        static void fun(){
//            greeting();  /*you can't use this because
//                     it requires an instance but the function you are using
//                     it in does not depend on instance */
//        }


    }
//    this is   dependent on object
    void greeting(){
        System.out.println("hello world");
    }
}
//we know that something which is not static , belongs to an object
//inside a static method you cannot run anything non-static means static method can only access static data
