package oops;
import javax.swing.*;
import java.util.*;
 class atm{
     float balance;
     int pin = 5674;
     private Object checkpin;

     public void checkpin(){
         System.out.println("enter your pin");
         Scanner sc = new Scanner(System.in);
         int enterpin = sc.nextInt();
         if(enterpin == pin){
             menu();
         }
         else {
             System.out.println("enter a valid pin");
             checkpin();
//

         }

     }
     public void menu(){
         System.out.println("enter your choice");
         System.out.println("1 check a/c balance");
         System.out.println("2 for withdraw money");
         System.out.println("3 for deposit money");
         System.out.println("4 for exit");

         Scanner sc = new Scanner(System.in);
         int opt = sc.nextInt();
         if(opt ==1)
         {
             checkbalance();
         }
         else if(opt == 2)
         {
             withdrawmoney();
         }
         else if(opt == 3)
         {
             depositmoney();
         }
         else if(opt == 4)
         {
             return;
         }
         else{
             System.out.println("enter a valid choice");

         }
     }
     public void checkbalance(){
         System.out.println("balance = " + balance);
         menu();
     }
     public void withdrawmoney(){
         System.out.println("Enter money for withdrawl");
         Scanner sc = new Scanner(System.in);
         float amount = sc.nextFloat();
         if(amount>balance){
             System.out.println("insufficient balance");

         }
         else {
             balance = balance-amount;
             System.out.println("withdrawl money = "+ amount);
           menu();
         }
     }
     public void depositmoney(){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the money you want to deposit");
         float deposit = sc.nextFloat();

         balance = balance + deposit;
         System.out.println("deposited money = " + deposit);
         menu();
     }
 }

 public class atm_machine{
     public static void main() {
         atm obj = new atm();
         obj.checkpin();

     }
 }