package oops;

//method overriding me method ka name same hota hai par classes ke accoriding uska body change hota hai
//method overiding ke liye inheritance must hai
class Bank{
    public void rateofinterest(){
        System.out.println("rate of interest is 6.5%");
    }
}
//yaha pe sbi class bank class ko inherit kar raha hai agar yaha pe is body change nahi hota toh wo bank class ka rateof interest ka body ko use kar leta par yaha pe iska khud ka body hai isliye isko call karne pe ye run hoga bhale hi ye bank class ko extend kar raha ho

 class SBI extends  Bank{
    public void rateofinterest(){
        System.out.println("rate of interest is 88%");
    }
 }
 class HDFC extends Bank{
    public void rateofinterest(){
        System.out.println("rate of interest is 1%");
    }
 }

public class method_overriding {
    public static void main(String []args)
    {
        SBI sbi = new SBI();
        HDFC hdfc = new HDFC();
        sbi.rateofinterest();
        hdfc.rateofinterest();
    }
}
