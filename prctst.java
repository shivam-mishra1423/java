import java.awt.geom.QuadCurve2D;
import java.util.Scanner;

public class prctst {
    public static void main(String[] args) {
//        Q1
//int n=4;
//for (int i=n;i>0;i--){
//    for(int j=0;j<i;j++){
//        System.out.print("*");
//    }
//    System.out.print("\n");
//      }
        //Q2
//        Scanner sc= new Scanner(System.in);
//        System.out.println("enter a number");
//        int n=sc.nextInt();
//       int sum=0;
//       for(int i=0;i<n;i++){
//           sum = sum + (2*i);
//       }
//        System.out.println("the sum of first nth natural number is: "+sum);
        //Q3
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter number : ");
//        int n= sc.nextInt();
//        for(int i=1;i<=10;i++){
//            System.out.printf("%d X %d = %d\n",n,i,n*i);
//        }
        //Q4
        int n=5;
//        int i=1;
//        int factorial = 1;
//        while (i<=n){
//            factorial = factorial*i;
//            i++;
//        }
        int fact=1;
//        System.out.println(factorial);
        for(int i=1;i<=n;i++){

            fact=fact*i;
        }
        System.out.println(fact);
  }
}

