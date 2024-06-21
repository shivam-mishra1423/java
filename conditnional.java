import java.util.Scanner;
public class conditnional {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
        int age=sc.nextInt();
        if(age>=0 && age<=18){
            System.out.println("you are not drive");
            System.out.println("you are not able to give vote");
        }
        else{
            System.out.println("you are able to preformed every task");
        }
    }
}
