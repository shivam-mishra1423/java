import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        if(age>56){
            System.out.println("you are experinced:");
        }
        else if(age>46){
            System.out.println("you are semi-experinced");
        }
        else if(age>36){
            System.out.println("you are semi-semi-experinced");
        }
        else{
            System.out.println("you are not experinced");
        }
    }
}
