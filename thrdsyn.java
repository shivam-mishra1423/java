import java.util.Scanner;
class Account{
    int bal;
    Account(int b){
        bal = b;
    }
   boolean  issufficientbal(int w){
    if(bal>w){
        return true;
    }
    else{
        return false;
    }
    }
   void withdraw(int amt){
        bal=bal-amt;
        System.out.println("transaction successful");
        System.out.println("current balanced is"+bal);
    }
}
    class customer implements Runnable{
      Account x1;
     customer(Account j1){
        j1=x1;
      }
      public void run()
      {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Amount To Withdraw");
        int amt=s1.nextInt();
        if(x1.issufficientbal(amt)){
            x1.withdraw(amt);
        }
        else{
            System.out.println("Insufficient Balanced");
        }
      }
 

public class thrdsyn{
    public static void main(String[]args){
        Account a1=new Account(5000);
        customer c1=new customer(a1);
        customer c2=new customer(a1);
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
    }
}}