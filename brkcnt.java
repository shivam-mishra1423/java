import java.util.Scanner;
public class brkcnt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
//        System.out.println("enter a number :");
//        int n = sc.nextInt();
//        for(int i=n; i<=10;i++){
//            System.out.println(i);
//            if(i==4){
//                break;
        System.out.println("enter a number :");
        int n = sc.nextInt();
        for(int i=n; i<=5;i++){

            if(i==4){
                continue;
            }
            System.out.println(i);
        }
    }
}
