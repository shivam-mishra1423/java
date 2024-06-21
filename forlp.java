import java.util.Scanner;
public class forlp {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter a number");
//        int a = sc.nextInt();
//        for(int i=a;i<=5;i++){
//            System.out.println(i);
//        }

        //Ques q
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        for(int i=a;i<=6;i++){
            System.out.println("the first five odd number"+(2*i+1));
        }
    }
}
