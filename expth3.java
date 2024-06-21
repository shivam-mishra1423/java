import java.util.Scanner;

public class expth3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your total amount");
     int TAmount=sc.nextInt();
     System.out.println("Enter Your Withdrawl Amount : ");
     int WdAmount=sc.nextInt();
     TAmount=TAmount-WdAmount;
     try{
     if(TAmount<WdAmount){
throw new ArithmeticException("you enter more amount than your withdrawaling amount");

     }
     
       System.out.println("Transection successfully");
       System.out.println("Your Current Balanced Is "+TAmount);
       System.out.println("Thanks Visit Again");
    
    }
    catch(ArithmeticException e1){
System.out.println(e1.getMessage());
  
    }
    
    }
}

