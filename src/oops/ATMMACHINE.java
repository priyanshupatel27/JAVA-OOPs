package oops;
import com.sun.jdi.PathSearchingVirtualMachine;

import  java.util.*;

class atm2{

    Scanner sc = new Scanner(System.in);
    int balance;
    int pin = 5555;

    atm2(){
        while(true) {
            System.out.println("enter the pin");
            int input = sc.nextInt();
            if (input == pin) {
                menu();
                break;
            }
            else {
                System.out.println("enter correct pin");

            }
        }
    }
    public void menu(){
        System.out.println("enter the choice \n 1 for available balance \n " +
                "2 for money deposition \n " + "3 for cash withdrawl \n " + "4 to exit");
        int choice = sc.nextInt();
        if(choice == 1) AvailaleBalance();
        else if (choice == 2) DepositMoney();
        else if(choice == 3 ) WithdrawlMoney();
        else if(choice == 4 )  return;
        else {
            System.out.println(" enter correct option");
            menu();
        }
    }
     public void AvailaleBalance(){
         System.out.println("Current Balance = " + balance);
         menu();
     }
     public void DepositMoney() {
         System.out.println("How much money you want to deposit");
         int money = sc.nextInt();
         balance += money;
         System.out.println("Money Deposited Successfully");
         menu();
     }
     public void WithdrawlMoney(){
         System.out.println("How much MONEY you want to WITHDRAW");
         int withdraw = sc.nextInt();
         if(withdraw <= balance ){
             balance -= withdraw;
             System.out.println("Money withdrawl successful " + withdraw);
             menu();
         }
         else {
             System.out.println("Withdrawl money out of bound");
             menu();
         }
     }
}
public class ATMMACHINE
{
    public static void main(String[] args) {
        atm2 obj = new atm2();
    }
}