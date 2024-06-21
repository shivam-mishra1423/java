import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class prctset {
    public static void main(String[] args) {
       //Q2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter physics sub marks");
//        int phy=sc.nextInt();
//        System.out.println("enter chemistry sub marks");
//        int che=sc.nextInt();
//        System.out.println("enter maths sub marks");
//        int maths=sc.nextInt();
//        float avg=(phy+che+maths)/3.0f;
//        if(avg>=40 && phy>=33 && che>=33 && maths>=33){
//            System.out.println("conguration you are promoted :");
//        }
//        else{
//            System.out.println("try again");
//        }

//        //Q3
//        Scanner sc =  new Scanner(System.in);
//        System.out.println("enter your amount  :");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if (income<=2.5){
//            tax =  tax + 0;
//        }
//        else if(income>2.5 && tax <=5f){
//            tax = tax +0.05f *(income - 2.5f);
//        }
//        else if(income>5f && tax <=10f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.02f * (income - 2.5f);
//
//        }
//        else if(income>10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.05f * (income - 2.5f);
//            tax= tax + 0.3f * (income - 10.0f);
//        }
//        System.out.println("the total tax is  paid by the employee : "+tax);


//Scanner sc =new Scanner(System.in);
//        System.out.println("Enter Days (1-7)");
//int day=sc.nextInt();
//switch (day){
//    case 1 -> System.out.println("Sunday");
//    case 2 -> System.out.println("Monday");
//    case 3 -> System.out.println("Tuesday");
//    case 4 -> System.out.println("Wednesday");
//    case 5 -> System.out.println("Thrusday");
//    case 6 -> System.out.println("Friday");
////    case 7 -> System.out.println("Saturday");
//}

        //Q6
        Scanner sc = new Scanner(System.in);
        System.out.println("enter url");
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("this is an organization Website");
        }else if(website.endsWith(".com")){
            System.out.println("this is an commertial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("this is indian website");
        }


    }
}
